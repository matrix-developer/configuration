package io.swagger.api;

import io.swagger.model.AdapterResponse;
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
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-05-23T07:28:33.665Z")

@Controller
public class WorkflowadapterApiController implements WorkflowadapterApi {

    private static final Logger log = LoggerFactory.getLogger(WorkflowadapterApiController.class);

    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;

    @org.springframework.beans.factory.annotation.Autowired
    public WorkflowadapterApiController(ObjectMapper objectMapper, HttpServletRequest request) {
        this.objectMapper = objectMapper;
        this.request = request;
    }

    public ResponseEntity<AdapterResponse> createVnfUsingPOST(@NotNull @ApiParam(value = "UID", required = true) @Valid @RequestParam(value = "UID", required = true) String UID,@NotNull @ApiParam(value = "timeout", required = true) @Valid @RequestParam(value = "timeout", required = true) String timeout) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("")) {
            try {
                return new ResponseEntity<AdapterResponse>(objectMapper.readValue("", AdapterResponse.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type ", e);
                return new ResponseEntity<AdapterResponse>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<AdapterResponse>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<AdapterResponse> deleteVnfUsingPOST(@NotNull @ApiParam(value = "UID", required = true) @Valid @RequestParam(value = "UID", required = true) String UID,@NotNull @ApiParam(value = "timeout", required = true) @Valid @RequestParam(value = "timeout", required = true) String timeout) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("")) {
            try {
                return new ResponseEntity<AdapterResponse>(objectMapper.readValue("", AdapterResponse.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type ", e);
                return new ResponseEntity<AdapterResponse>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<AdapterResponse>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<AdapterResponse> executeCurrentJobUsingGET(@NotNull @ApiParam(value = "UID", required = true) @Valid @RequestParam(value = "UID", required = true) String UID,@NotNull @ApiParam(value = "timeout", required = true) @Valid @RequestParam(value = "timeout", required = true) String timeout) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("")) {
            try {
                return new ResponseEntity<AdapterResponse>(objectMapper.readValue("", AdapterResponse.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type ", e);
                return new ResponseEntity<AdapterResponse>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<AdapterResponse>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<AdapterResponse> getParamUsingGET(@NotNull @ApiParam(value = "UID", required = true) @Valid @RequestParam(value = "UID", required = true) String UID,@NotNull @ApiParam(value = "timeout", required = true) @Valid @RequestParam(value = "timeout", required = true) String timeout) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("")) {
            try {
                return new ResponseEntity<AdapterResponse>(objectMapper.readValue("", AdapterResponse.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type ", e);
                return new ResponseEntity<AdapterResponse>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<AdapterResponse>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<AdapterResponse> instantiateVnfUsingPOST(@NotNull @ApiParam(value = "UID", required = true) @Valid @RequestParam(value = "UID", required = true) String UID,@NotNull @ApiParam(value = "timeout", required = true) @Valid @RequestParam(value = "timeout", required = true) String timeout) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("")) {
            try {
                return new ResponseEntity<AdapterResponse>(objectMapper.readValue("", AdapterResponse.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type ", e);
                return new ResponseEntity<AdapterResponse>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<AdapterResponse>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<AdapterResponse> terminateVnfUsingPOST(@NotNull @ApiParam(value = "UID", required = true) @Valid @RequestParam(value = "UID", required = true) String UID,@NotNull @ApiParam(value = "timeout", required = true) @Valid @RequestParam(value = "timeout", required = true) String timeout) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("")) {
            try {
                return new ResponseEntity<AdapterResponse>(objectMapper.readValue("", AdapterResponse.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type ", e);
                return new ResponseEntity<AdapterResponse>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<AdapterResponse>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<AdapterResponse> testGetUsingPOST(@NotNull @ApiParam(value = "UID", required = true) @Valid @RequestParam(value = "UID", required = true) String UID,@NotNull @ApiParam(value = "timeout", required = true) @Valid @RequestParam(value = "timeout", required = true) String timeout) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("")) {
            try {
                return new ResponseEntity<AdapterResponse>(objectMapper.readValue("", AdapterResponse.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type ", e);
                return new ResponseEntity<AdapterResponse>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<AdapterResponse>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<AdapterResponse> updateVnfUsingPOST(@NotNull @ApiParam(value = "UID", required = true) @Valid @RequestParam(value = "UID", required = true) String UID,@NotNull @ApiParam(value = "timeout", required = true) @Valid @RequestParam(value = "timeout", required = true) String timeout) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("")) {
            try {
                return new ResponseEntity<AdapterResponse>(objectMapper.readValue("", AdapterResponse.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type ", e);
                return new ResponseEntity<AdapterResponse>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<AdapterResponse>(HttpStatus.NOT_IMPLEMENTED);
    }

}
