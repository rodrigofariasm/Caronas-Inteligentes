# --- Created by Ebean DDL
# To stop Ebean DDL generation, remove this comment and start using Evolutions

# --- !Ups

create table carona (
  id                        bigint not null,
  origem                    varchar(255),
  destino                   varchar(255),
  vagas                     varchar(255),
  data                      timestamp,
  ponto_de_encontro         varchar(255),
  constraint pk_carona primary key (id))
;

create table solicitacao_carona (
  id                        bigint not null,
  origem                    varchar(255),
  destino                   varchar(255),
  data                      timestamp,
  ponto_de_encontro         varchar(255),
  constraint pk_solicitacao_carona primary key (id))
;

create table usuario (
  email                     varchar(255) not null,
  password                  varchar(255),
  constraint pk_usuario primary key (email))
;

create sequence carona_seq;

create sequence solicitacao_carona_seq;

create sequence usuario_seq;




# --- !Downs

SET REFERENTIAL_INTEGRITY FALSE;

drop table if exists carona;

drop table if exists solicitacao_carona;

drop table if exists usuario;

SET REFERENTIAL_INTEGRITY TRUE;

drop sequence if exists carona_seq;

drop sequence if exists solicitacao_carona_seq;

drop sequence if exists usuario_seq;

