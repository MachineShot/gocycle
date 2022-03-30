package io.swagger.api;

import io.swagger.model.Trip;
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
public class TripApiController implements TripApi {

    private static final Logger log = LoggerFactory.getLogger(TripApiController.class);

    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;

    @org.springframework.beans.factory.annotation.Autowired
    public TripApiController(ObjectMapper objectMapper, HttpServletRequest request) {
        this.objectMapper = objectMapper;
        this.request = request;
    }

    public ResponseEntity<Void> addTrip(@ApiParam(value = "Trip object that needs to be added to the store" ,required=true )  @Valid @RequestBody Trip body) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> deleteTrip(@ApiParam(value = "Trip id to delete",required=true) @PathVariable("tripId") Long tripId,@ApiParam(value = "" ) @RequestHeader(value="api_key", required=false) String apiKey) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Trip> getTripById(@ApiParam(value = "ID of trip to return",required=true) @PathVariable("tripId") Long tripId) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<Trip>(objectMapper.readValue("{\"empty\": false}", Trip.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<Trip>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        if (accept != null && accept.contains("application/xml")) {
            try {
                return new ResponseEntity<Trip>(objectMapper.readValue("<Trip>  <id>123456789</id>  <timestamp>aeiou</timestamp>  <duration>aeiou</duration>  <avgSpeed>1.3579</avgSpeed>  <maxSpeed>1.3579</maxSpeed>  <calories>123456789</calories>  <altitude>1.3579</altitude></Trip>", Trip.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/xml", e);
                return new ResponseEntity<Trip>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<Trip>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> updateTrip(@ApiParam(value = "Trip object that needs to be added" ,required=true )  @Valid @RequestBody Trip body) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> updateTripWithForm(@ApiParam(value = "ID of trip that needs to be updated",required=true) @PathVariable("tripId") Long tripId,@ApiParam(value = "Updated name of the trip") @RequestParam(value="name", required=false)  String name,@ApiParam(value = "Updated status of the trip") @RequestParam(value="status", required=false)  String status) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

}
