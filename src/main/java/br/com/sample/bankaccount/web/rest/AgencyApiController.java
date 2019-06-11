package br.com.sample.bankaccount.web.rest;

import br.com.sample.bankaccount.domain.Agency;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.swagger.annotations.ApiParam;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
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

@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-06-11T01:35:03.801Z")

@Controller
public class AgencyApiController implements AgencyApi {

    private static final Logger log = LoggerFactory.getLogger(AgencyApiController.class);

    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;

    @org.springframework.beans.factory.annotation.Autowired
    public AgencyApiController(ObjectMapper objectMapper, HttpServletRequest request) {
        this.objectMapper = objectMapper;
        this.request = request;
    }

    public ResponseEntity<Void> addAgency(@ApiParam(value = "User object that needs to be added" ,required=true )  @Valid @RequestBody Agency body) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> deleteAgency(@ApiParam(value = "Agency id to delete", required = true) @PathVariable("agencyId") Long agencyId) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Agency> getAgencyById(@ApiParam(value = "ID of agency to return",required=true) @PathVariable("agencyId") Long agencyId) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<Agency>(objectMapper.readValue("{  \"bank\" : \"Banco do Brasil\",  \"address\" : \"address\",  \"ag\" : \"2090-0\",  \"id\" : 0}", Agency.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<Agency>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<Agency>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<List<Agency>> getAllAgencies() {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<List<Agency>>(objectMapper.readValue("[ {  \"bank\" : \"Banco do Brasil\",  \"address\" : \"address\",  \"ag\" : \"2090-0\",  \"id\" : 0}, {  \"bank\" : \"Banco do Brasil\",  \"address\" : \"address\",  \"ag\" : \"2090-0\",  \"id\" : 0} ]", List.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<List<Agency>>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<List<Agency>>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> updateAgency(@ApiParam(value = "" ,required=true )  @Valid @RequestBody Agency body) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> updateAgencyWithForm(@ApiParam(value = "ID of agency that needs to be updated",required=true) @PathVariable("agencyId") Long agencyId, @ApiParam(value = "Updated name of the agency") @RequestParam(value="name", required=false)  String name, @ApiParam(value = "Updated status of the agency") @RequestParam(value="status", required=false)  String status) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

}
