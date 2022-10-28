package aka.memo.repository;

import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import aka.memo.repository.entity.MemoEntity;

@Mapper
public interface MemosMapper {
  
  List<MemoEntity> findAll();

}
