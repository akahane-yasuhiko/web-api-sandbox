# superuserで実施
CREATE ROLE memosadmin WITH CREATEDB CREATEROLE LOGIN PASSWORD 'memosadmin';


# sandboxで実施
CREATE DATABASE memos_db
  TEMPLATE template0 ENCODING 'UTF-8'
  LC_COLLATE 'ja_JP.UTF-8' LC_CTYPE 'ja_JP.UTF-8';


GRANT ALL PRIVILEGES ON groupmemos TO groupmemos;

CREATE SCHEMA memos_schema;


