select
    t1.user_id,
    t1.user_name,
    t3.role_id,
    t3.role_name,
    t5.menu_id,
    t5.menu_name
from mst_user as t1
    left join user_role as t2
        on t2.user_id = t1.user_id
    left join mst_role as t3
        on t3.role_id = t2.role_id
    left join role_menu as t4
        on t4.role_id = t3.role_id
    left join mst_menu as t5
        on t5.menu_id = t4.menu_id
order by
    t1.user_id asc,
    t3.role_id asc,
    t5.menu_id asc
;
