package aka.sample.generated.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Menu
 */
@Validated


public class Menu   {
  @JsonProperty("menu_id")
  private String menuId = null;

  @JsonProperty("menu_name")
  private String menuName = null;

  public Menu menuId(String menuId) {
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

  public Menu menuName(String menuName) {
    this.menuName = menuName;
    return this;
  }

  /**
   * Get menuName
   * @return menuName
   **/
  @Schema(required = true, description = "")
      @NotNull

  @Size(min=1,max=2048)   public String getMenuName() {
    return menuName;
  }

  public void setMenuName(String menuName) {
    this.menuName = menuName;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Menu menu = (Menu) o;
    return Objects.equals(this.menuId, menu.menuId) &&
        Objects.equals(this.menuName, menu.menuName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(menuId, menuName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Menu {\n");
    
    sb.append("    menuId: ").append(toIndentedString(menuId)).append("\n");
    sb.append("    menuName: ").append(toIndentedString(menuName)).append("\n");
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
