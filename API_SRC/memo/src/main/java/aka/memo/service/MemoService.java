package aka.memo.service;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import aka.memo.generated.model.Memo;
import aka.memo.generated.model.MemoGroup;
import aka.memo.generated.model.MemoView;
import aka.memo.repository.MemosMapper;
import aka.memo.repository.UserMapper;
import aka.memo.repository.entity.MemoEntity;
import aka.memo.repository.entity.UserEntity;
import aka.memo.util.MyMapperUtil;

@Service
public class MemoService {

  // @Autowired
  // private ModelMapper modelMapper;

  @Autowired
  private MemosMapper memosMapper;

  @Autowired
  private UserMapper userMapper;

  public MemoView getMemoView(String userId, String threadId) {

    //// List<MemoEntity> memos = memosMapper.findAll();
    // List<MemoEntity> memos = memosMapper.findByCond(userId, threadId);
    //
    // Map<String, List<MemoEntity>> memoGroupsMap =
    // memos.stream().collect(Collectors.groupingBy(MemoEntity::getGroupName));
    //
    // List<MemoGroup> a = memoGroupsMap.entrySet().stream().map(e -> {
    // MemoGroup mg = new MemoGroup();
    // mg.setGroupName(e.getKey());
    //
    // // List<MemoEntity> to List<Memo>
    // mg.setMemos(MyMapperUtil.mapList(e.getValue(),Memo.class));
    // return mg;
    // }).toList();



    MemoView res = new MemoView();
    res.setMemoGroups(getMemoGroups(userId, threadId));

    UserEntity user = getUser(userId);
    if (user == null) {
      return res;
    }

    res.setBio(user.getBio());
    res.setUserName(user.getUserName());

    return res;
  }

  private List<MemoGroup> getMemoGroups(String userId, String threadId) {
    // MemoEntityの配列を取得
    // List<MemoEntity> memos = memosMapper.findAll();
    List<MemoEntity> memos = memosMapper.findByCond(userId, threadId);

    // MemoEntityの配列をグループごとに分割し、Mapで持つ
    Map<String, List<MemoEntity>> memoGroupMap =
        memos.stream().collect(Collectors.groupingBy(MemoEntity::getGroupId));

    // MapからMemoGroupのリストを作り、返却
    return memoGroupMap.entrySet().stream().map(e -> {
      MemoGroup mg = new MemoGroup();
      mg.setGroupName(e.getKey());

      // List<MemoEntity>をList<Memo>に変換する
      mg.setMemos(MyMapperUtil.mapList(e.getValue(), Memo.class));
      return mg;
    }).toList();

  }

  private UserEntity getUser(String userId) {
    return (userId == null) ? null : userMapper.selectById(userId);

  }

}
