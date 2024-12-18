create sequence bm_id_seq start with 1 increment by 50;

create table bookmarks(
id bigint default nextval('bm_id_seq') not null,
created_at timestamp(6) with time zone,
title varchar(255) not null,
url varchar(255) not null,
primary key (id)
);