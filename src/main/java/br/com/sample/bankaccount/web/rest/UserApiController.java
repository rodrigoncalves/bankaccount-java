package br.com.sample.bankaccount.web.rest;

import br.com.sample.bankaccount.domain.Agency;
import br.com.sample.bankaccount.domain.User;
import br.com.sample.bankaccount.repository.AgencyRepository;
import br.com.sample.bankaccount.repository.UserRepository;
import io.swagger.annotations.ApiParam;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import javax.validation.Valid;
import java.util.List;

@AllArgsConstructor
@Slf4j
@Controller
public class UserApiController implements UserApi {

    private UserRepository userRepository;
    private AgencyRepository agencyRepository;

    public ResponseEntity<User> createUser(@ApiParam(value = "Created user object", required = true) @Valid @RequestBody User body) {
        Agency agency = agencyRepository.findById(body.getAgency().getId())
                .orElseThrow(() -> new NotFoundException(ApiResponseMessage.WARNING, "Agency not found: " + body.getAgency().getId()));

        body.setAgency(agency);
        User user = userRepository.save(body);
        return ResponseEntity.status(HttpStatus.CREATED).body(user);
    }

    public ResponseEntity<Void> deleteUser(@ApiParam(value = "The name that needs to be deleted", required = true) @PathVariable("userId") Long userId) {
        userRepository.deleteById(userId);
        return ResponseEntity.noContent().build();
    }

    public ResponseEntity<List<User>> getAllUsers() {
        return ResponseEntity.ok(userRepository.findAll());
    }

    public ResponseEntity<User> getUserById(@ApiParam(value = "The name that needs to be fetched.", required = true) @PathVariable("userId") Long userId) {
        User user = userRepository.findById(userId)
                .orElseThrow(() -> new NotFoundException(ApiResponseMessage.WARNING, "User not found: " + userId));

        return ResponseEntity.ok(user);
    }

    public ResponseEntity<User> updateUser(@ApiParam(value = "name that need to be updated", required = true) @PathVariable("userId") Long userId,
                                           @ApiParam(value = "Updated user object", required = true) @Valid @RequestBody User body) {
        User user = userRepository.findById(userId)
                .orElseThrow(() -> new NotFoundException(ApiResponseMessage.WARNING, "User not found: " + userId));

        user.setAccount(body.getAccount());
        user.setAgency(body.getAgency());
        user.setCep(body.getCep());
        user.setEmail(body.getEmail());
        user.setName(body.getName());

        user = userRepository.save(user);
        return ResponseEntity.ok(user);
    }

}
