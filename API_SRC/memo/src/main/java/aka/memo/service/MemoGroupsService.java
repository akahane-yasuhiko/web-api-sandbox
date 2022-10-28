package aka.memo.service;

import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import aka.memo.generated.model.Memo;
import aka.memo.generated.model.MemoGroup;
import aka.memo.generated.model.MemoGroups;
import aka.memo.repository.MemosMapper;
import aka.memo.repository.entity.MemoEntity;
import aka.memo.util.MyMapperUtil;

@Service
public class MemoGroupsService {

  @Autowired
  ModelMapper modelMapper;

  @Autowired
  MemosMapper memosMapper;

  public MemoGroups getMemoGroups() {

    List<MemoEntity> memos = memosMapper.findAll();

    Map<String, List<MemoEntity>> memoGroupsMap =
        memos.stream().collect(Collectors.groupingBy(MemoEntity::getGroupName));

    List<MemoGroup> a = memoGroupsMap.entrySet().stream().map(e -> {
      MemoGroup mg = new MemoGroup();
      mg.setGroupName(e.getKey());

      // List<MemoEntity> to List<Memo>
      mg.setMemos(MyMapperUtil.mapList(e.getValue(),Memo.class));
      return mg;
    }).toList();

    MemoGroups res = new MemoGroups();
    res.addAll(a);

    return res;
  }

}
