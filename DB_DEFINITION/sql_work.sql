# Memos group by groups 
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


# Memos group by groups and specified user_id
select
  mst_user.user_name,
  mst_user.image_path,
  mst_user.bio,
  mst_group.group_name,
  trn_thread.thread_title,
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
where
  trn_memo.update_datetime = t2.latest
  and trn_memo.user_id = 'c6a5ce92-c026-73c5-2bf6-ee383468d1bc'
order by mst_group.group_name asc, trn_memo.update_datetime desc
;

# user
select
  user_id,
  user_name,
  bio,
  update_datetime,
  image_path
from 
  mst_user
where
  user_id = 'c6a5ce92-c026-73c5-2bf6-ee383468d1bc'
;


select
  mst_group.group_id,
  mst_group.group_name,
  trn_thread.thread_id,
  trn_thread.thread_title,
  mst_user.user_id,
  mst_user.user_name,
  mst_user.image_path,
  trn_memo.memo_id,
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
where
  trn_memo.update_datetime = t2.latest
  and trn_memo.user_id = 'c6a5ce92-c026-73c5-2bf6-ee383468d1bc'
  and trn_memo.thread_id = '80d59aff-96c9-5c39-3e9b-98102d891857'
order by mst_group.group_name asc, trn_memo.update_datetime desc
;
