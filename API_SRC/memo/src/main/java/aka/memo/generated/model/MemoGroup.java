package aka.memo.generated.model;

import java.util.Objects;
import aka.memo.generated.model.Memo;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * MemoGroup
 */
@Validated


public class MemoGroup   {
  @JsonProperty("group_id")
  private String groupId = null;

  @JsonProperty("group_name")
  private String groupName = null;

  @JsonProperty("memos")
  @Valid
  private List<Memo> memos = null;

  public MemoGroup groupId(String groupId) {
    this.groupId = groupId;
    return this;
  }

  /**
   * Get groupId
   * @return groupId
   **/
  @Schema(description = "")
  
    public String getGroupId() {
    return groupId;
  }

  public void setGroupId(String groupId) {
    this.groupId = groupId;
  }

  public MemoGroup groupName(String groupName) {
    this.groupName = groupName;
    return this;
  }

  /**
   * Get groupName
   * @return groupName
   **/
  @Schema(description = "")
  
    public String getGroupName() {
    return groupName;
  }

  public void setGroupName(String groupName) {
    this.groupName = groupName;
  }

  public MemoGroup memos(List<Memo> memos) {
    this.memos = memos;
    return this;
  }

  public MemoGroup addMemosItem(Memo memosItem) {
    if (this.memos == null) {
      this.memos = new ArrayList<>();
    }
    this.memos.add(memosItem);
    return this;
  }

  /**
   * Get memos
   * @return memos
   **/
  @Schema(description = "")
      @Valid
    public List<Memo> getMemos() {
    return memos;
  }

  public void setMemos(List<Memo> memos) {
    this.memos = memos;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MemoGroup memoGroup = (MemoGroup) o;
    return Objects.equals(this.groupId, memoGroup.groupId) &&
        Objects.equals(this.groupName, memoGroup.groupName) &&
        Objects.equals(this.memos, memoGroup.memos);
  }

  @Override
  public int hashCode() {
    return Objects.hash(groupId, groupName, memos);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MemoGroup {\n");
    
    sb.append("    groupId: ").append(toIndentedString(groupId)).append("\n");
    sb.append("    groupName: ").append(toIndentedString(groupName)).append("\n");
    sb.append("    memos: ").append(toIndentedString(memos)).append("\n");
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
