/**
 * NOTE: This class is auto generated by the swagger code generator program (3.0.31).
 * https://github.com/swagger-api/swagger-codegen
 * Do not edit the class manually.
 */
package aka.sample.generated.api;

import java.util.Optional;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.fasterxml.jackson.databind.ObjectMapper;

import aka.sample.generated.model.ErrorResponse;
import aka.sample.generated.model.RoleMenu;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.enums.ParameterIn;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;

@Validated
public interface RoleMenuApi {

    Logger log = LoggerFactory.getLogger(RoleMenuApi.class);

    Optional<ObjectMapper> getObjectMapper();

    Optional<HttpServletRequest> getRequest();

    

    @Operation(summary = "Create role and menu relationsip", description = "", tags={ "role-menu" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "204", description = "successful operation"),
        
        @ApiResponse(responseCode = "400", description = "Invalid rolename or menuname supplied", content = @Content(mediaType = "application/json", schema = @Schema(implementation = ErrorResponse.class))),
        
        @ApiResponse(responseCode = "404", description = "User or role not found", content = @Content(mediaType = "application/json", schema = @Schema(implementation = ErrorResponse.class))) })
    @RequestMapping(value = "/role-menu/{rolename}/{menuname}",
        produces = { "application/json" }, 
        method = RequestMethod.PUT)
    ResponseEntity<Void> createRoleMenu(@Parameter(in = ParameterIn.PATH, description = "", required=true, schema=@Schema()) @PathVariable("rolename") String rolename, @Parameter(in = ParameterIn.PATH, description = "", required=true, schema=@Schema()) @PathVariable("menuname") String menuname);


    @Operation(summary = "Delete role and menu relationship", description = "", tags={ "role-menu" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "204", description = "successful operation"),
        
        @ApiResponse(responseCode = "400", description = "Invalid username or rolename supplied", content = @Content(mediaType = "application/json", schema = @Schema(implementation = ErrorResponse.class))),
        
        @ApiResponse(responseCode = "404", description = "Relationship not found", content = @Content(mediaType = "application/json", schema = @Schema(implementation = ErrorResponse.class))) })
    @RequestMapping(value = "/role-menu/{rolename}/{menuname}",
        produces = { "application/json" }, 
        method = RequestMethod.DELETE)
    ResponseEntity<Void> deleteUserRole(@Parameter(in = ParameterIn.PATH, description = "", required=true, schema=@Schema()) @PathVariable("rolename") String rolename, @Parameter(in = ParameterIn.PATH, description = "", required=true, schema=@Schema()) @PathVariable("menuname") String menuname);


    @Operation(summary = "Get role-menu relationships by role name", description = "", tags={ "role-menu" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "successful operation", content = @Content(mediaType = "application/json", schema = @Schema(implementation = RoleMenu.class))),
        
        @ApiResponse(responseCode = "400", description = "Invalid rolename supplied", content = @Content(mediaType = "application/json", schema = @Schema(implementation = ErrorResponse.class))),
        
        @ApiResponse(responseCode = "404", description = "Role not found", content = @Content(mediaType = "application/json", schema = @Schema(implementation = ErrorResponse.class))) })
    @RequestMapping(value = "/role-menu/{rolename}",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    ResponseEntity<RoleMenu> getRoleMenuByName(@Parameter(in = ParameterIn.PATH, description = "", required=true, schema=@Schema()) @PathVariable("rolename") String rolename);

}

