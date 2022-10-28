package aka.memo.repository.entity;

import java.time.OffsetDateTime;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
public class MemoEntity {
  String groupName;
  String threadTitle;
  String userName;
  String imagePath;
  String memoBody;
  OffsetDateTime updateDatetime;
}
