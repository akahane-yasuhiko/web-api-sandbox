package aka.memo.generated.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Memo
 */
@Validated


public class Memo   {
  @JsonProperty("thread_title")
  private String threadTitle = null;

  @JsonProperty("user_name")
  private String userName = null;

  @JsonProperty("memo_body")
  private String memoBody = null;

  @JsonProperty("update_datetime")
  private String updateDatetime = null;

  public Memo threadTitle(String threadTitle) {
    this.threadTitle = threadTitle;
    return this;
  }

  /**
   * Get threadTitle
   * @return threadTitle
   **/
  @Schema(description = "")
  
    public String getThreadTitle() {
    return threadTitle;
  }

  public void setThreadTitle(String threadTitle) {
    this.threadTitle = threadTitle;
  }

  public Memo userName(String userName) {
    this.userName = userName;
    return this;
  }

  /**
   * Get userName
   * @return userName
   **/
  @Schema(description = "")
  
    public String getUserName() {
    return userName;
  }

  public void setUserName(String userName) {
    this.userName = userName;
  }

  public Memo memoBody(String memoBody) {
    this.memoBody = memoBody;
    return this;
  }

  /**
   * Get memoBody
   * @return memoBody
   **/
  @Schema(description = "")
  
    public String getMemoBody() {
    return memoBody;
  }

  public void setMemoBody(String memoBody) {
    this.memoBody = memoBody;
  }

  public Memo updateDatetime(String updateDatetime) {
    this.updateDatetime = updateDatetime;
    return this;
  }

  /**
   * Get updateDatetime
   * @return updateDatetime
   **/
  @Schema(description = "")
  
    public String getUpdateDatetime() {
    return updateDatetime;
  }

  public void setUpdateDatetime(String updateDatetime) {
    this.updateDatetime = updateDatetime;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Memo memo = (Memo) o;
    return Objects.equals(this.threadTitle, memo.threadTitle) &&
        Objects.equals(this.userName, memo.userName) &&
        Objects.equals(this.memoBody, memo.memoBody) &&
        Objects.equals(this.updateDatetime, memo.updateDatetime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(threadTitle, userName, memoBody, updateDatetime);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Memo {\n");
    
    sb.append("    threadTitle: ").append(toIndentedString(threadTitle)).append("\n");
    sb.append("    userName: ").append(toIndentedString(userName)).append("\n");
    sb.append("    memoBody: ").append(toIndentedString(memoBody)).append("\n");
    sb.append("    updateDatetime: ").append(toIndentedString(updateDatetime)).append("\n");
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
