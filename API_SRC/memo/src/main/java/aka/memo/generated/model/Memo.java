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
  @JsonProperty("thread_id")
  private String threadId = null;

  @JsonProperty("thread_title")
  private String threadTitle = null;

  @JsonProperty("user_id")
  private String userId = null;

  @JsonProperty("user_name")
  private String userName = null;

  @JsonProperty("memo_id")
  private String memoId = null;

  @JsonProperty("memo_body")
  private String memoBody = null;

  @JsonProperty("update_datetime")
  private String updateDatetime = null;

  public Memo threadId(String threadId) {
    this.threadId = threadId;
    return this;
  }

  /**
   * Get threadId
   * @return threadId
   **/
  @Schema(description = "")
  
    public String getThreadId() {
    return threadId;
  }

  public void setThreadId(String threadId) {
    this.threadId = threadId;
  }

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

  public Memo userId(String userId) {
    this.userId = userId;
    return this;
  }

  /**
   * Get userId
   * @return userId
   **/
  @Schema(description = "")
  
    public String getUserId() {
    return userId;
  }

  public void setUserId(String userId) {
    this.userId = userId;
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

  public Memo memoId(String memoId) {
    this.memoId = memoId;
    return this;
  }

  /**
   * Get memoId
   * @return memoId
   **/
  @Schema(description = "")
  
    public String getMemoId() {
    return memoId;
  }

  public void setMemoId(String memoId) {
    this.memoId = memoId;
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
    return Objects.equals(this.threadId, memo.threadId) &&
        Objects.equals(this.threadTitle, memo.threadTitle) &&
        Objects.equals(this.userId, memo.userId) &&
        Objects.equals(this.userName, memo.userName) &&
        Objects.equals(this.memoId, memo.memoId) &&
        Objects.equals(this.memoBody, memo.memoBody) &&
        Objects.equals(this.updateDatetime, memo.updateDatetime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(threadId, threadTitle, userId, userName, memoId, memoBody, updateDatetime);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Memo {\n");
    
    sb.append("    threadId: ").append(toIndentedString(threadId)).append("\n");
    sb.append("    threadTitle: ").append(toIndentedString(threadTitle)).append("\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
    sb.append("    userName: ").append(toIndentedString(userName)).append("\n");
    sb.append("    memoId: ").append(toIndentedString(memoId)).append("\n");
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
