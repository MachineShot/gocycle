package io.swagger.api;

import io.swagger.model.UserTransport;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.swagger.annotations.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.constraints.*;
import javax.validation.Valid;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.util.List;
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2022-03-29T15:47:54.662Z")

@Controller
public class UserTransportApiController implements UserTransportApi {

    private static final Logger log = LoggerFactory.getLogger(UserTransportApiController.class);

    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;

    @org.springframework.beans.factory.annotation.Autowired
    public UserTransportApiController(ObjectMapper objectMapper, HttpServletRequest request) {
        this.objectMapper = objectMapper;
        this.request = request;
    }

    public ResponseEntity<Void> addUserTransport(@ApiParam(value = "User_transport object that needs to be added to the store" ,required=true )  @Valid @RequestBody UserTransport body) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> deleteUserTransport(@ApiParam(value = "User_transport id to delete",required=true) @PathVariable("user_transportId") Long userTransportId,@ApiParam(value = "" ) @RequestHeader(value="api_key", required=false) String apiKey) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<UserTransport> getUserTransportById(@ApiParam(value = "ID of user_transport to return",required=true) @PathVariable("user_transportId") Long userTransportId) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<UserTransport>(objectMapper.readValue("{\"empty\": false}", UserTransport.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<UserTransport>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        if (accept != null && accept.contains("application/xml")) {
            try {
                return new ResponseEntity<UserTransport>(objectMapper.readValue("<User_transport>  <id>123456789</id></User_transport>", UserTransport.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/xml", e);
                return new ResponseEntity<UserTransport>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<UserTransport>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> updateUserTransport(@ApiParam(value = "User_transport object that needs to be added" ,required=true )  @Valid @RequestBody UserTransport body) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> updateUserTransportWithForm(@ApiParam(value = "ID of user_transport that needs to be updated",required=true) @PathVariable("user_transportId") Long userTransportId,@ApiParam(value = "Updated name of the user_transport") @RequestParam(value="name", required=false)  String name,@ApiParam(value = "Updated status of the user_transport") @RequestParam(value="status", required=false)  String status) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

}
