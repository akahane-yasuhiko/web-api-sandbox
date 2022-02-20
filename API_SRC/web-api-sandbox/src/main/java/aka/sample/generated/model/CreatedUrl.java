package aka.sample.generated.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * CreatedUrl
 */
@Validated


public class CreatedUrl   {
  @JsonProperty("resource_url")
  private String resourceUrl = null;

  public CreatedUrl resourceUrl(String resourceUrl) {
    this.resourceUrl = resourceUrl;
    return this;
  }

  /**
   * Get resourceUrl
   * @return resourceUrl
   **/
  @Schema(description = "")
  
  @Size(max=2048)   public String getResourceUrl() {
    return resourceUrl;
  }

  public void setResourceUrl(String resourceUrl) {
    this.resourceUrl = resourceUrl;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreatedUrl createdUrl = (CreatedUrl) o;
    return Objects.equals(this.resourceUrl, createdUrl.resourceUrl);
  }

  @Override
  public int hashCode() {
    return Objects.hash(resourceUrl);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreatedUrl {\n");
    
    sb.append("    resourceUrl: ").append(toIndentedString(resourceUrl)).append("\n");
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
