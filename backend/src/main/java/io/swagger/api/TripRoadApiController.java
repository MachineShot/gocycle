package io.swagger.api;

import io.swagger.model.TripRoad;
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
public class TripRoadApiController implements TripRoadApi {

    private static final Logger log = LoggerFactory.getLogger(TripRoadApiController.class);

    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;

    @org.springframework.beans.factory.annotation.Autowired
    public TripRoadApiController(ObjectMapper objectMapper, HttpServletRequest request) {
        this.objectMapper = objectMapper;
        this.request = request;
    }

    public ResponseEntity<Void> addTripRoad(@ApiParam(value = "Trip_road object that needs to be added to the store" ,required=true )  @Valid @RequestBody TripRoad body) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> deleteTripRoad(@ApiParam(value = "Trip_road id to delete",required=true) @PathVariable("trip_roadId") Long tripRoadId,@ApiParam(value = "" ) @RequestHeader(value="api_key", required=false) String apiKey) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<TripRoad> getTripRoadById(@ApiParam(value = "ID of trip_road to return",required=true) @PathVariable("trip_roadId") Long tripRoadId) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<TripRoad>(objectMapper.readValue("{\"empty\": false}", TripRoad.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<TripRoad>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        if (accept != null && accept.contains("application/xml")) {
            try {
                return new ResponseEntity<TripRoad>(objectMapper.readValue("<Trip_road>  <id>123456789</id>  <startTimestamp>aeiou</startTimestamp>  <endTimestamp>aeiou</endTimestamp>  <startPoint>aeiou</startPoint>  <endPoint>aeiou</endPoint></Trip_road>", TripRoad.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/xml", e);
                return new ResponseEntity<TripRoad>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<TripRoad>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> updateTripRoad(@ApiParam(value = "Trip_road object that needs to be added" ,required=true )  @Valid @RequestBody TripRoad body) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> updateTripRoadWithForm(@ApiParam(value = "ID of trip_road that needs to be updated",required=true) @PathVariable("trip_roadId") Long tripRoadId,@ApiParam(value = "Updated name of the trip_road") @RequestParam(value="name", required=false)  String name,@ApiParam(value = "Updated status of the trip_road") @RequestParam(value="status", required=false)  String status) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

}
