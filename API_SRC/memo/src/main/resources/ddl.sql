--
-- PostgreSQL database dump
--

-- Dumped from database version 13.8
-- Dumped by pg_dump version 13.8


--
-- Name: memos_schema; Type: SCHEMA; Schema: -; Owner: -
--

CREATE SCHEMA memos_schema;


--
-- Name: mst_device; Type: TABLE; Schema: memos_schema; Owner: -
--

CREATE TABLE memos_schema.mst_device (
    device_token character varying(256) NOT NULL,
    disp_name character varying(256) NOT NULL,
    last_access timestamp without time zone,
    update_datetime timestamp without time zone NOT NULL
);


--
-- Name: mst_group; Type: TABLE; Schema: memos_schema; Owner: -
--

CREATE TABLE memos_schema.mst_group (
    group_id character varying(36) NOT NULL,
    group_name character varying(256),
    description character varying(2048),
    update_datetime timestamp without time zone NOT NULL
);


--
-- Name: mst_operation; Type: TABLE; Schema: memos_schema; Owner: -
--

CREATE TABLE memos_schema.mst_operation (
    operation_id character varying(36) NOT NULL,
    operation_name character varying(256),
    description character varying(2048),
    update_datetime timestamp without time zone
);


--
-- Name: mst_role; Type: TABLE; Schema: memos_schema; Owner: -
--

CREATE TABLE memos_schema.mst_role (
    role_id character varying(36) NOT NULL,
    role_name character varying(256),
    description character varying(2048),
    update_datetime timestamp without time zone NOT NULL
);


--
-- Name: mst_user; Type: TABLE; Schema: memos_schema; Owner: -
--

CREATE TABLE memos_schema.mst_user (
    user_id character varying(36) NOT NULL,
    user_name character varying(256),
    bio character varying(2048),
    update_datetime timestamp without time zone,
    image_path character varying
);


--
-- Name: rel_device; Type: TABLE; Schema: memos_schema; Owner: -
--

CREATE TABLE memos_schema.rel_device (
    device_token character varying NOT NULL,
    user_id character varying NOT NULL,
    update_datetime timestamp without time zone
);


--
-- Name: rel_group; Type: TABLE; Schema: memos_schema; Owner: -
--

CREATE TABLE memos_schema.rel_group (
    group_id character varying NOT NULL,
    user_id character varying NOT NULL,
    update_datetime timestamp without time zone
);


--
-- Name: rel_operation; Type: TABLE; Schema: memos_schema; Owner: -
--

CREATE TABLE memos_schema.rel_operation (
    operation_id character varying NOT NULL,
    role_id character varying NOT NULL,
    update_datetime timestamp without time zone NOT NULL
);


--
-- Name: rel_role; Type: TABLE; Schema: memos_schema; Owner: -
--

CREATE TABLE memos_schema.rel_role (
    role_id character varying NOT NULL,
    user_id character varying NOT NULL,
    group_id character varying NOT NULL,
    update_datetime timestamp without time zone
);


--
-- Name: trn_memo; Type: TABLE; Schema: memos_schema; Owner: -
--

CREATE TABLE memos_schema.trn_memo (
    memo_id character varying(36) NOT NULL,
    thread_id character varying(36) NOT NULL,
    user_id character varying(36) NOT NULL,
    memo_body character varying NOT NULL,
    update_datetime timestamp without time zone NOT NULL
);


--
-- Name: trn_thread; Type: TABLE; Schema: memos_schema; Owner: -
--

CREATE TABLE memos_schema.trn_thread (
    thread_id character varying(36) NOT NULL,
    group_id character varying(36) NOT NULL,
    thread_title character varying(256) NOT NULL,
    posted_datetime timestamp without time zone
);


