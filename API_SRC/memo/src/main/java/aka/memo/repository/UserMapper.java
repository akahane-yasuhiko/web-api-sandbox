package aka.memo.repository;

import org.apache.ibatis.annotations.Mapper;
import aka.memo.repository.entity.UserEntity;

@Mapper
public interface UserMapper {
  
  UserEntity selectById(String userId);

}
