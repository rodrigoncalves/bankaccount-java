package br.com.sample.bankaccount.web.rest;

import br.com.sample.bankaccount.domain.Agency;
import br.com.sample.bankaccount.repository.AgencyRepository;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.swagger.annotations.ApiParam;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;
import java.io.IOException;
import java.util.List;

@AllArgsConstructor
@Slf4j
@Controller
public class AgencyApiController implements AgencyApi {

    private AgencyRepository agencyRepository;

    public ResponseEntity<Agency> addAgency(@ApiParam(value = "User object that needs to be added", required = true) @Valid @RequestBody Agency body) {
        Agency agency = agencyRepository.save(body);
        return ResponseEntity.status(HttpStatus.CREATED).body(agency);
    }

    public ResponseEntity<Void> deleteAgency(@ApiParam(value = "Agency id to delete", required = true) @PathVariable("agencyId") Long agencyId) {
        agencyRepository.deleteById(agencyId);
        return ResponseEntity.noContent().build();
    }

    public ResponseEntity<Agency> getAgencyById(@ApiParam(value = "ID of agency to return", required = true) @PathVariable("agencyId") Long agencyId) {
        Agency agency = agencyRepository.findById(agencyId)
                .orElseThrow(() -> new NotFoundException(ApiResponseMessage.WARNING, "Agency not found: " + agencyId));

        return ResponseEntity.ok(agency);
    }

    public ResponseEntity<List<Agency>> getAllAgencies() {
        return ResponseEntity.ok(agencyRepository.findAll());
    }

    public ResponseEntity<Agency> updateAgency(@ApiParam(value = "ID of agency that needs to be updated", required = true) @PathVariable("agencyId") Long agencyId,
                                               @ApiParam(value = "", required = true) @Valid @RequestBody Agency body) {
        Agency agency = agencyRepository.findById(agencyId)
                .orElseThrow(() -> new NotFoundException(ApiResponseMessage.WARNING, "Agency not found: " + agencyId));

        agency.setBank(body.getBank());
        agency.setAg(body.getAg());
        agency.setAddress(body.getAddress());

        agency = agencyRepository.save(agency);
        return ResponseEntity.ok(agency);
    }

}
