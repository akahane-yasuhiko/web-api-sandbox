package aka.memo.repository;

import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import aka.memo.repository.entity.MemoEntity;

@Mapper
public interface MemosMapper {
  
  List<MemoEntity> findAll();
  List<MemoEntity> findByCond(@Param("userId") String userId, @Param("threadId") String threadId);

}
