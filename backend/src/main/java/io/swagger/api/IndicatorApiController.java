package io.swagger.api;

import io.swagger.model.Indicator;
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
public class IndicatorApiController implements IndicatorApi {

    private static final Logger log = LoggerFactory.getLogger(IndicatorApiController.class);

    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;

    @org.springframework.beans.factory.annotation.Autowired
    public IndicatorApiController(ObjectMapper objectMapper, HttpServletRequest request) {
        this.objectMapper = objectMapper;
        this.request = request;
    }

    public ResponseEntity<Void> addIndicator(@ApiParam(value = "Indicator object that needs to be added to the store" ,required=true )  @Valid @RequestBody Indicator body) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> deleteIndicator(@ApiParam(value = "Indicator id to delete",required=true) @PathVariable("indicatorId") Long indicatorId,@ApiParam(value = "" ) @RequestHeader(value="api_key", required=false) String apiKey) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Indicator> getIndicatorById(@ApiParam(value = "ID of indicator to return",required=true) @PathVariable("indicatorId") Long indicatorId) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<Indicator>(objectMapper.readValue("{\"empty\": false}", Indicator.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<Indicator>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        if (accept != null && accept.contains("application/xml")) {
            try {
                return new ResponseEntity<Indicator>(objectMapper.readValue("<Indicator>  <id>123456789</id>  <name>aeiou</name></Indicator>", Indicator.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/xml", e);
                return new ResponseEntity<Indicator>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<Indicator>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> updateIndicator(@ApiParam(value = "Indicator object that needs to be added" ,required=true )  @Valid @RequestBody Indicator body) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> updateIndicatorWithForm(@ApiParam(value = "ID of indicator that needs to be updated",required=true) @PathVariable("indicatorId") Long indicatorId,@ApiParam(value = "Updated name of the indicator") @RequestParam(value="name", required=false)  String name,@ApiParam(value = "Updated status of the indicator") @RequestParam(value="status", required=false)  String status) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

}
