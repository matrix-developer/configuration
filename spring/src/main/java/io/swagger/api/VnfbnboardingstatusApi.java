/**
 * NOTE: This class is auto generated by the swagger code generator program (1.0.11).
 * https://github.com/swagger-api/swagger-codegen
 * Do not edit the class manually.
 */
package io.swagger.api;

import io.swagger.model.BaseResponse;
import io.swagger.annotations.*;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.Valid;
import javax.validation.constraints.*;
import java.util.List;
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2017-12-26T06:37:43.014Z")

@Api(value = "vnfbnboardingstatus", description = "the vnfbnboardingstatus API")
public interface VnfbnboardingstatusApi {

    @ApiOperation(value = "Fetch the jenkins job status", nickname = "vnfbnboardingstatusGet", notes = "Fetch the jenkins job status", response = BaseResponse.class, tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "jenkins job status", response = BaseResponse.class) })
    @RequestMapping(value = "/vnfbnboardingstatus",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    ResponseEntity<BaseResponse> vnfbnboardingstatusGet(@NotNull @ApiParam(value = "Execution jenkins job id", required = true) @Valid @RequestParam(value = "uid", required = true) String uid);

}
