select
  trn_memo.memo_body,
  trn_thread.thread_title,
  mst_group.group_name,
  mst_user.user_name
from trn_memo
  left join trn_thread
    on trn_memo.thread_id = trn_thread.thread_id
  left join mst_group
    on trn_thread.group_id = mst_group.group_id
  left join mst_user
    on trn_memo.user_id = mst_user.user_id
;



select
  mst_group.group_name,
  trn_thread.thread_title,
  mst_user.user_name,
  mst_user.image_path,
  trn_memo.memo_body,
  trn_memo.update_datetime
from trn_memo
  inner join (
      select thread_id, max(update_datetime) as latest 
      from trn_memo group by thread_id)as t2
    on trn_memo.thread_id = t2.thread_id
  left join trn_thread
    on trn_memo.thread_id = trn_thread.thread_id
  left join mst_group
    on trn_thread.group_id = mst_group.group_id
  left join mst_user
    on trn_memo.user_id = mst_user.user_id
where trn_memo.update_datetime = t2.latest
order by mst_group.group_name asc, trn_memo.update_datetime desc
;
