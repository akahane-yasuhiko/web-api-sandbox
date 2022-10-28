package aka.memo.repository.entity;

import java.time.OffsetDateTime;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
public class MemoEntity {
  String groupId;
  String groupName;
  String threadId;
  String threadTitle;
  String userId;
  String userName;
  String imagePath;
  String memoId;
  String memoBody;
  OffsetDateTime updateDatetime;
}
