package aka.memo.generated.model;

import java.util.Objects;
import aka.memo.generated.model.MemoGroup;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * MemoView
 */
@Validated


public class MemoView   {
  @JsonProperty("user_name")
  private String userName = null;

  @JsonProperty("bio")
  private String bio = null;

  @JsonProperty("memo_groups")
  @Valid
  private List<MemoGroup> memoGroups = null;

  public MemoView userName(String userName) {
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

  public MemoView bio(String bio) {
    this.bio = bio;
    return this;
  }

  /**
   * Get bio
   * @return bio
   **/
  @Schema(description = "")
  
    public String getBio() {
    return bio;
  }

  public void setBio(String bio) {
    this.bio = bio;
  }

  public MemoView memoGroups(List<MemoGroup> memoGroups) {
    this.memoGroups = memoGroups;
    return this;
  }

  public MemoView addMemoGroupsItem(MemoGroup memoGroupsItem) {
    if (this.memoGroups == null) {
      this.memoGroups = new ArrayList<>();
    }
    this.memoGroups.add(memoGroupsItem);
    return this;
  }

  /**
   * Get memoGroups
   * @return memoGroups
   **/
  @Schema(description = "")
      @Valid
    public List<MemoGroup> getMemoGroups() {
    return memoGroups;
  }

  public void setMemoGroups(List<MemoGroup> memoGroups) {
    this.memoGroups = memoGroups;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MemoView memoView = (MemoView) o;
    return Objects.equals(this.userName, memoView.userName) &&
        Objects.equals(this.bio, memoView.bio) &&
        Objects.equals(this.memoGroups, memoView.memoGroups);
  }

  @Override
  public int hashCode() {
    return Objects.hash(userName, bio, memoGroups);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MemoView {\n");
    
    sb.append("    userName: ").append(toIndentedString(userName)).append("\n");
    sb.append("    bio: ").append(toIndentedString(bio)).append("\n");
    sb.append("    memoGroups: ").append(toIndentedString(memoGroups)).append("\n");
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
