-- -- UUID生成モジュール DBにID生成させない
-- CREATE EXTENSION IF NOT EXISTS "uuid-ossp";

-- DB管理/接続ユーザー作成
-- postgresで実行
CREATE ROLE udbadm WITH CREATEDB CREATEROLE LOGIN PASSWORD 'password'

-- DB作成
-- udbadm@postgresで実行
CREATE DATABASE udb OWNER = udbadm TEMPLATE = template0 ENCODING = 'UTF8' LC_COLLATE = 'ja_JP.UTF-8' LC_CTYPE = 'ja_JP.UTF-8';

-- スキーマ作成
-- udbadm@udbで実行
CREATE SCHEMA uscm;

-- デフォルトスキーマ設定
alter role udbadm set search_path to uscm,public;
