package aka.sample.generated.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * RoleMenu
 */
@Validated


public class RoleMenu   {
  @JsonProperty("role_id")
  private String roleId = null;

  @JsonProperty("menu_id")
  private String menuId = null;

  public RoleMenu roleId(String roleId) {
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

  public RoleMenu menuId(String menuId) {
    this.menuId = menuId;
    return this;
  }

  /**
   * Get menuId
   * @return menuId
   **/
  @Schema(required = true, description = "")
      @NotNull

  @Size(min=5,max=5)   public String getMenuId() {
    return menuId;
  }

  public void setMenuId(String menuId) {
    this.menuId = menuId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RoleMenu roleMenu = (RoleMenu) o;
    return Objects.equals(this.roleId, roleMenu.roleId) &&
        Objects.equals(this.menuId, roleMenu.menuId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(roleId, menuId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RoleMenu {\n");
    
    sb.append("    roleId: ").append(toIndentedString(roleId)).append("\n");
    sb.append("    menuId: ").append(toIndentedString(menuId)).append("\n");
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
