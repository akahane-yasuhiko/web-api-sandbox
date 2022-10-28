package aka.memo.repository.entity;

import java.time.OffsetDateTime;
import lombok.Data;

@Data
public class UserEntity {
  
  String userId;
  String userName;
  String bio;
  OffsetDateTime updateDatetime;
  String imagePath;

}
