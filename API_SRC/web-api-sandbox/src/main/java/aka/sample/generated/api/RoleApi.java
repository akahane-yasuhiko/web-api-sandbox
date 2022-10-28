/**
 * NOTE: This class is auto generated by the swagger code generator program (3.0.31).
 * https://github.com/swagger-api/swagger-codegen
 * Do not edit the class manually.
 */
package aka.sample.generated.api;

import java.util.Optional;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.fasterxml.jackson.databind.ObjectMapper;

import aka.sample.generated.model.ErrorResponse;
import aka.sample.generated.model.Menu;
import aka.sample.generated.model.User;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.enums.ParameterIn;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;

@Validated
public interface RoleApi {

    Logger log = LoggerFactory.getLogger(RoleApi.class);

    Optional<ObjectMapper> getObjectMapper();

    Optional<HttpServletRequest> getRequest();

    

    @Operation(summary = "Create role", description = "", tags={ "role" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "201", description = "Created", content = @Content(mediaType = "application/json", schema = @Schema(implementation = User.class))),
        
        @ApiResponse(responseCode = "400", description = "Bad Request", content = @Content(mediaType = "application/json", schema = @Schema(implementation = ErrorResponse.class))),
        
        @ApiResponse(responseCode = "500", description = "Internal Server Error", content = @Content(mediaType = "application/json", schema = @Schema(implementation = ErrorResponse.class))) })
    @RequestMapping(value = "/role",
        produces = { "application/json" }, 
        consumes = { "*/*" }, 
        method = RequestMethod.POST)
    ResponseEntity<User> createMenu(@Parameter(in = ParameterIn.DEFAULT, description = "", required=true, schema=@Schema()) @Valid @RequestBody Menu body);


    @Operation(summary = "Delete role", description = "", tags={ "role" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "400", description = "Invalid username supplied", content = @Content(mediaType = "application/json", schema = @Schema(implementation = ErrorResponse.class))),
        
        @ApiResponse(responseCode = "404", description = "User not found", content = @Content(mediaType = "application/json", schema = @Schema(implementation = ErrorResponse.class))) })
    @RequestMapping(value = "/role/{rolename}",
        produces = { "application/json" }, 
        method = RequestMethod.DELETE)
    ResponseEntity<Void> deleteMenu(@Parameter(in = ParameterIn.PATH, description = "", required=true, schema=@Schema()) @PathVariable("Menuname") String menuname);


    @Operation(summary = "Get role by name", description = "", tags={ "role" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "successful operation", content = @Content(mediaType = "application/json", schema = @Schema(implementation = Menu.class))),
        
        @ApiResponse(responseCode = "400", description = "Invalid username supplied", content = @Content(mediaType = "application/json", schema = @Schema(implementation = ErrorResponse.class))),
        
        @ApiResponse(responseCode = "404", description = "User not found", content = @Content(mediaType = "application/json", schema = @Schema(implementation = ErrorResponse.class))) })
    @RequestMapping(value = "/role/{rolename}",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    ResponseEntity<Menu> getMenuByName(@Parameter(in = ParameterIn.PATH, description = "", required=true, schema=@Schema()) @PathVariable("rolename") String rolename);


    @Operation(summary = "Update role", description = "", tags={ "role" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "400", description = "Invalid user supplied", content = @Content(mediaType = "application/json", schema = @Schema(implementation = ErrorResponse.class))),
        
        @ApiResponse(responseCode = "404", description = "User not found", content = @Content(mediaType = "application/json", schema = @Schema(implementation = ErrorResponse.class))) })
    @RequestMapping(value = "/role/{rolename}",
        produces = { "application/json" }, 
        consumes = { "*/*" }, 
        method = RequestMethod.PUT)
    ResponseEntity<Void> updateMenu(@Parameter(in = ParameterIn.PATH, description = "", required=true, schema=@Schema()) @PathVariable("rolename") String rolename, @Parameter(in = ParameterIn.DEFAULT, description = "", required=true, schema=@Schema()) @Valid @RequestBody Menu body);

}

