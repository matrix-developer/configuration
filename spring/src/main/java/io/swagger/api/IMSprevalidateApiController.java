package io.swagger.api;

import io.swagger.model.BuildInfo;
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
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2017-12-26T06:37:34.285Z")

@Controller
public class IMSprevalidateApiController implements IMSprevalidateApi {

    private static final Logger log = LoggerFactory.getLogger(IMSprevalidateApiController.class);

    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;

    @org.springframework.beans.factory.annotation.Autowired
    public IMSprevalidateApiController(ObjectMapper objectMapper, HttpServletRequest request) {
        this.objectMapper = objectMapper;
        this.request = request;
    }

    public ResponseEntity<BuildInfo> iMSprevalidatePost(@NotNull @ApiParam(value = "Execution jenkins job id12", required = true) @Valid @RequestParam(value = "uid", required = true) String uid) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<BuildInfo>(objectMapper.readValue("{  \"result\" : \"result\",  \"buildName\" : \"buildName\",  \"buildURL\" : \"buildURL\",  \"operationName\" : \"operationName\",  \"message\" : \"message\",  \"buildNumber\" : \"buildNumber\"}", BuildInfo.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<BuildInfo>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<BuildInfo>(HttpStatus.NOT_IMPLEMENTED);
    }

}
