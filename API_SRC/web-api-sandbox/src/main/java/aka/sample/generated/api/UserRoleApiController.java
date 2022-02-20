package aka.sample.generated.api;

import aka.sample.generated.model.ErrorResponse;
import aka.sample.generated.model.UserRole;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.enums.ParameterIn;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.media.ArraySchema;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.constraints.*;
import javax.validation.Valid;
import javax.servlet.http.HttpServletRequest;
import java.util.Optional;
import java.io.IOException;
import java.util.List;
import java.util.Map;

@RestController
public class UserRoleApiController implements UserRoleApi {

    private static final Logger log = LoggerFactory.getLogger(UserRoleApiController.class);

    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;

    @org.springframework.beans.factory.annotation.Autowired
    public UserRoleApiController(ObjectMapper objectMapper, HttpServletRequest request) {
        this.objectMapper = objectMapper;
        this.request = request;
    }

    @Override
    public Optional<ObjectMapper> getObjectMapper() {
        return Optional.ofNullable(objectMapper);
    }

    @Override
    public Optional<HttpServletRequest> getRequest() {
        return Optional.ofNullable(request);
    }

    public ResponseEntity<Void> createUserRole(@Parameter(in = ParameterIn.PATH, description = "", required=true, schema=@Schema()) @PathVariable("username") String username,@Parameter(in = ParameterIn.PATH, description = "", required=true, schema=@Schema()) @PathVariable("rolename") String rolename) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> deleteUserRole(@Parameter(in = ParameterIn.PATH, description = "", required=true, schema=@Schema()) @PathVariable("username") String username,@Parameter(in = ParameterIn.PATH, description = "", required=true, schema=@Schema()) @PathVariable("rolename") String rolename) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<UserRole> getUserRoleByName(@Parameter(in = ParameterIn.PATH, description = "", required=true, schema=@Schema()) @PathVariable("username") String username) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<UserRole>(objectMapper.readValue("{\r\n  \"user_id\" : \"user_id\",\r\n  \"role_id\" : \"role_id\"\r\n}", UserRole.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<UserRole>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<UserRole>(HttpStatus.NOT_IMPLEMENTED);
    }

}
