-- Project Name : Group-Memos
-- Date/Time    : 2022/10/26 11:49:45
-- Author       : aka
-- RDBMS Type   : PostgreSQL
-- Application  : A5:SQL Mk-2

-- TRN_MEMO
drop table if exists TRN_MEMO cascade;

create table TRN_MEMO (
  MEMO_ID character varying(36) not null
  , THREAD_ID character varying(36) not null
  , USER_ID character varying(36) not null
  , MEMO_BODY character varying not null
  , UPDATE_DATETIME timestamp not null
  , constraint TRN_MEMO_PKC primary key (MEMO_ID)
) ;

-- TRN_THREAD
drop table if exists TRN_THREAD cascade;

create table TRN_THREAD (
  THREAD_ID character varying(36) not null
  , GROUP_ID character varying(36) not null
  , THREAD_TITLE character varying(256) not null
  , POSTED_DATETIME timestamp
  , constraint TRN_THREAD_PKC primary key (THREAD_ID)
) ;

-- REL_GROUP
drop table if exists REL_GROUP cascade;

create table REL_GROUP (
  GROUP_ID character varying not null
  , USER_ID character varying not null
  , UPDATE_DATETIME timestamp
  , constraint REL_GROUP_PKC primary key (GROUP_ID,USER_ID)
) ;

-- MST_GROUP
drop table if exists MST_GROUP cascade;

create table MST_GROUP (
  GROUP_ID character varying(36) not null
  , GROUP_NAME character varying(256)
  , DESCRIPTION character varying(2048)
  , UPDATE_DATETIME timestamp not null
  , constraint MST_GROUP_PKC primary key (GROUP_ID)
) ;

-- REL_DEVICE
drop table if exists REL_DEVICE cascade;

create table REL_DEVICE (
  DEVICE_TOKEN character varying not null
  , USER_ID character varying not null
  , UPDATE_DATETIME timestamp
  , constraint REL_DEVICE_PKC primary key (DEVICE_TOKEN,USER_ID)
) ;

-- MST_DEVICE
drop table if exists MST_DEVICE cascade;

create table MST_DEVICE (
  DEVICE_TOKEN character varying(256) not null
  , DISP_NAME character varying(256) not null
  , LAST_ACCESS timestamp
  , UPDATE_DATETIME timestamp not null
  , constraint MST_DEVICE_PKC primary key (DEVICE_TOKEN)
) ;

-- REL_OPERATION
drop table if exists REL_OPERATION cascade;

create table REL_OPERATION (
  OPERATION_ID character varying not null
  , ROLE_ID character varying not null
  , UPDATE_DATETIME timestamp not null
  , constraint REL_OPERATION_PKC primary key (OPERATION_ID,ROLE_ID)
) ;

-- REL_ROLE
drop table if exists REL_ROLE cascade;

create table REL_ROLE (
  ROLE_ID character varying not null
  , USER_ID character varying not null
  , GROUP_ID character varying not null
  , UPDATE_DATETIME timestamp
  , constraint REL_ROLE_PKC primary key (ROLE_ID,USER_ID,GROUP_ID)
) ;

-- MST_OPERATION
drop table if exists MST_OPERATION cascade;

create table MST_OPERATION (
  OPERATION_ID character varying(36) not null
  , OPERATION_NAME character varying(256)
  , DESCRIPTION character varying(2048)
  , UPDATE_DATETIME timestamp
  , constraint MST_OPERATION_PKC primary key (OPERATION_ID)
) ;

-- MST_ROLE
drop table if exists MST_ROLE cascade;

create table MST_ROLE (
  ROLE_ID character varying(36) not null
  , ROLE_NAME character varying(256)
  , DESCRIPTION character varying(2048)
  , UPDATE_DATETIME timestamp not null
  , constraint MST_ROLE_PKC primary key (ROLE_ID)
) ;

-- MST_USER
drop table if exists MST_USER cascade;

create table MST_USER (
  USER_ID character varying(36) not null
  , USER_NAME character varying(256)
  , BIO character varying(2048)
  , UPDATE_DATETIME timestamp
  , IMAGE_PATH character varying
  , constraint MST_USER_PKC primary key (USER_ID)
) ;

alter table TRN_THREAD
  add constraint TRN_THREAD_FK1 foreign key (GROUP_ID) references MST_GROUP(GROUP_ID)
  on delete cascade
  on update cascade;

alter table TRN_MEMO
  add constraint TRN_MEMO_FK1 foreign key (USER_ID) references MST_USER(USER_ID)
  on delete cascade
  on update cascade;

alter table TRN_MEMO
  add constraint TRN_MEMO_FK2 foreign key (THREAD_ID) references TRN_THREAD(THREAD_ID)
  on delete cascade
  on update cascade;

alter table REL_ROLE
  add constraint REL_ROLE_FK1 foreign key (GROUP_ID) references MST_GROUP(GROUP_ID)
  on delete cascade
  on update cascade;

alter table REL_GROUP
  add constraint REL_GROUP_FK1 foreign key (GROUP_ID) references MST_GROUP(GROUP_ID)
  on delete cascade
  on update cascade;

alter table REL_GROUP
  add constraint REL_GROUP_FK2 foreign key (USER_ID) references MST_USER(USER_ID)
  on delete cascade
  on update cascade;

alter table REL_DEVICE
  add constraint REL_DEVICE_FK1 foreign key (DEVICE_TOKEN) references MST_DEVICE(DEVICE_TOKEN)
  on delete cascade
  on update cascade;

alter table REL_DEVICE
  add constraint REL_DEVICE_FK2 foreign key (USER_ID) references MST_USER(USER_ID)
  on delete cascade
  on update cascade;

alter table REL_OPERATION
  add constraint REL_OPERATION_FK1 foreign key (OPERATION_ID) references MST_OPERATION(OPERATION_ID)
  on delete cascade
  on update cascade;

alter table REL_OPERATION
  add constraint REL_OPERATION_FK2 foreign key (ROLE_ID) references MST_ROLE(ROLE_ID)
  on delete cascade
  on update cascade;

alter table REL_ROLE
  add constraint REL_ROLE_FK2 foreign key (ROLE_ID) references MST_ROLE(ROLE_ID)
  on delete cascade
  on update cascade;

alter table REL_ROLE
  add constraint REL_ROLE_FK3 foreign key (USER_ID) references MST_USER(USER_ID)
  on delete cascade
  on update cascade;

comment on table TRN_MEMO is 'TRN_MEMO';
comment on column TRN_MEMO.MEMO_ID is 'MEMO_ID';
comment on column TRN_MEMO.THREAD_ID is 'THREAD_ID';
comment on column TRN_MEMO.USER_ID is 'USER_ID';
comment on column TRN_MEMO.MEMO_BODY is 'MEMO_BODY';
comment on column TRN_MEMO.UPDATE_DATETIME is 'POSTED_DATETIME';

comment on table TRN_THREAD is 'TRN_THREAD';
comment on column TRN_THREAD.THREAD_ID is 'THREAD_ID';
comment on column TRN_THREAD.GROUP_ID is 'GROUP_ID';
comment on column TRN_THREAD.THREAD_TITLE is 'THREAD_TITLE';
comment on column TRN_THREAD.POSTED_DATETIME is 'POSTED_DATETIME';

comment on table REL_GROUP is 'REL_GROUP';
comment on column REL_GROUP.GROUP_ID is 'GROUP_ID';
comment on column REL_GROUP.USER_ID is 'USER_ID';
comment on column REL_GROUP.UPDATE_DATETIME is 'UPDATE_DATETIME';

comment on table MST_GROUP is 'MST_GROUP';
comment on column MST_GROUP.GROUP_ID is 'GROUP_ID';
comment on column MST_GROUP.GROUP_NAME is 'GROUP_NAME';
comment on column MST_GROUP.DESCRIPTION is 'DESCRIPTION';
comment on column MST_GROUP.UPDATE_DATETIME is 'UPDATE_DATETIME';

comment on table REL_DEVICE is 'REL_DEVICE';
comment on column REL_DEVICE.DEVICE_TOKEN is 'DEVICE_TOKEN';
comment on column REL_DEVICE.USER_ID is 'USER_ID';
comment on column REL_DEVICE.UPDATE_DATETIME is 'UPDATE_DATETIME';

comment on table MST_DEVICE is 'MST_DEVICE';
comment on column MST_DEVICE.DEVICE_TOKEN is 'DEVICE_TOKEN';
comment on column MST_DEVICE.DISP_NAME is 'DISP_NAME';
comment on column MST_DEVICE.LAST_ACCESS is 'LAST_ACCESS';
comment on column MST_DEVICE.UPDATE_DATETIME is 'UPDATE_DATETIME';

comment on table REL_OPERATION is 'REL_OPERATION';
comment on column REL_OPERATION.OPERATION_ID is 'OPERATION_ID';
comment on column REL_OPERATION.ROLE_ID is 'ROLE_ID';
comment on column REL_OPERATION.UPDATE_DATETIME is 'UPDATE_DATETIME';

comment on table REL_ROLE is 'REL_ROLE';
comment on column REL_ROLE.ROLE_ID is 'ROLE_ID';
comment on column REL_ROLE.USER_ID is 'USER_ID';
comment on column REL_ROLE.GROUP_ID is 'GROUP_ID';
comment on column REL_ROLE.UPDATE_DATETIME is 'UPDATE_DATETIME';

comment on table MST_OPERATION is 'MST_OPERATION';
comment on column MST_OPERATION.OPERATION_ID is 'OPERATION_ID';
comment on column MST_OPERATION.OPERATION_NAME is 'OPERATION_NAME';
comment on column MST_OPERATION.DESCRIPTION is 'DESCRIPTION';
comment on column MST_OPERATION.UPDATE_DATETIME is 'UPDATE_DATETIME';

comment on table MST_ROLE is 'MST_ROLE';
comment on column MST_ROLE.ROLE_ID is 'ROLE_ID';
comment on column MST_ROLE.ROLE_NAME is 'ROLE_NAME';
comment on column MST_ROLE.DESCRIPTION is 'DESCRIPTION';
comment on column MST_ROLE.UPDATE_DATETIME is 'UPDATE_DATETIME';

comment on table MST_USER is 'MST_USER';
comment on column MST_USER.USER_ID is 'USER_ID';
comment on column MST_USER.USER_NAME is 'USER_NAME';
comment on column MST_USER.BIO is 'BIO';
comment on column MST_USER.UPDATE_DATETIME is 'UPDATE_DATETIME';
comment on column MST_USER.IMAGE_PATH is 'IMAGE_PATH';

