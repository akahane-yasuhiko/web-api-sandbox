package aka.sample.generated.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Role
 */
@Validated


public class Role   {
  @JsonProperty("role_id")
  private String roleId = null;

  @JsonProperty("role_name")
  private String roleName = null;

  public Role roleId(String roleId) {
    this.roleId = roleId;
    return this;
  }

  /**
   * Get roleId
   * @return roleId
   **/
  @Schema(required = true, description = "")
      @NotNull

  @Size(min=5,max=5)   public String getRoleId() {
    return roleId;
  }

  public void setRoleId(String roleId) {
    this.roleId = roleId;
  }

  public Role roleName(String roleName) {
    this.roleName = roleName;
    return this;
  }

  /**
   * Get roleName
   * @return roleName
   **/
  @Schema(required = true, description = "")
      @NotNull

  @Size(min=1,max=2048)   public String getRoleName() {
    return roleName;
  }

  public void setRoleName(String roleName) {
    this.roleName = roleName;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Role role = (Role) o;
    return Objects.equals(this.roleId, role.roleId) &&
        Objects.equals(this.roleName, role.roleName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(roleId, roleName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Role {\n");
    
    sb.append("    roleId: ").append(toIndentedString(roleId)).append("\n");
    sb.append("    roleName: ").append(toIndentedString(roleName)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
