-- Project Name : ÉÜÅ[ÉUÅ[ä«óù
-- Date/Time    : 2022/02/13 12:03:47
-- Author       : aka
-- RDBMS Type   : PostgreSQL
-- Application  : A5:SQL Mk-2

-- ROLE_MENU
drop table if exists ROLE_MENU cascade;

create table ROLE_MENU (
  ROLE_ID character varying not null
  , MENU_ID character varying not null
  , constraint ROLE_MENU_PKC primary key (ROLE_ID,MENU_ID)
) ;

-- USER_ROLE
drop table if exists USER_ROLE cascade;

create table USER_ROLE (
  USER_ID character varying not null
  , ROLE_ID character varying not null
  , constraint USER_ROLE_PKC primary key (USER_ID,ROLE_ID)
) ;

-- MST_MENU
drop table if exists MST_MENU cascade;

create table MST_MENU (
  MENU_ID character varying not null
  , MENU_NAME character varying
  , constraint MST_MENU_PKC primary key (MENU_ID)
) ;

-- MST_ROLE
drop table if exists MST_ROLE cascade;

create table MST_ROLE (
  ROLE_ID character varying not null
  , ROLE_NAME character varying
  , constraint MST_ROLE_PKC primary key (ROLE_ID)
) ;

-- MST_USER
drop table if exists MST_USER cascade;

create table MST_USER (
  USER_ID character varying not null
  , USER_NAME character varying
  , constraint MST_USER_PKC primary key (USER_ID)
) ;

alter table ROLE_MENU
  add constraint ROLE_MENU_FK1 foreign key (MENU_ID) references MST_MENU(MENU_ID)
  on delete cascade
  on update cascade;

alter table ROLE_MENU
  add constraint ROLE_MENU_FK2 foreign key (ROLE_ID) references MST_ROLE(ROLE_ID)
  on delete cascade
  on update cascade;

alter table USER_ROLE
  add constraint USER_ROLE_FK1 foreign key (ROLE_ID) references MST_ROLE(ROLE_ID)
  on delete cascade
  on update cascade;

alter table USER_ROLE
  add constraint USER_ROLE_FK2 foreign key (USER_ID) references MST_USER(USER_ID)
  on delete cascade
  on update cascade;

comment on table ROLE_MENU is 'ROLE_MENU';
comment on column ROLE_MENU.ROLE_ID is 'ROLE_ID';
comment on column ROLE_MENU.MENU_ID is 'MENU_ID';

comment on table USER_ROLE is 'USER_ROLE';
comment on column USER_ROLE.USER_ID is 'USER_ID';
comment on column USER_ROLE.ROLE_ID is 'ROLE_ID';

comment on table MST_MENU is 'MST_MENU';
comment on column MST_MENU.MENU_ID is 'MENU_ID';
comment on column MST_MENU.MENU_NAME is 'MENU_NAME';

comment on table MST_ROLE is 'MST_ROLE';
comment on column MST_ROLE.ROLE_ID is 'ROLE_ID';
comment on column MST_ROLE.ROLE_NAME is 'ROLE_NAME';

comment on table MST_USER is 'MST_USER';
comment on column MST_USER.USER_ID is 'USER_ID';
comment on column MST_USER.USER_NAME is 'USER_NAME';


