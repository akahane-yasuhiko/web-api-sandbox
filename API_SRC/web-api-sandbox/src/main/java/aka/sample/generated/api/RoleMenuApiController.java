package aka.sample.generated.api;

import java.io.IOException;
import java.util.Optional;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.databind.ObjectMapper;

import aka.sample.generated.model.RoleMenu;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.enums.ParameterIn;
import io.swagger.v3.oas.annotations.media.Schema;

@RestController
public class RoleMenuApiController implements RoleMenuApi {

    private static final Logger log = LoggerFactory.getLogger(RoleMenuApiController.class);

    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;

    @org.springframework.beans.factory.annotation.Autowired
    public RoleMenuApiController(ObjectMapper objectMapper, HttpServletRequest request) {
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

    public ResponseEntity<Void> createRoleMenu(@Parameter(in = ParameterIn.PATH, description = "", required=true, schema=@Schema()) @PathVariable("rolename") String rolename,@Parameter(in = ParameterIn.PATH, description = "", required=true, schema=@Schema()) @PathVariable("menuname") String menuname) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> deleteUserRole(@Parameter(in = ParameterIn.PATH, description = "", required=true, schema=@Schema()) @PathVariable("rolename") String rolename,@Parameter(in = ParameterIn.PATH, description = "", required=true, schema=@Schema()) @PathVariable("menuname") String menuname) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<RoleMenu> getRoleMenuByName(@Parameter(in = ParameterIn.PATH, description = "", required=true, schema=@Schema()) @PathVariable("rolename") String rolename) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<RoleMenu>(objectMapper.readValue("{\r\n  \"role_id\" : \"role_id\",\r\n  \"menu_id\" : \"menu_id\"\r\n}", RoleMenu.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<RoleMenu>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<RoleMenu>(HttpStatus.NOT_IMPLEMENTED);
    }

}
