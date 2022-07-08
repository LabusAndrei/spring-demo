create table t_store(
  id integer auto_increment,
  name varchar(50),
  address varchar(50),
  primary key(id)
);

create table t_items(
  id integer auto_increment,
  name varchar(50),
  price double,
  company varchar(50),
  gender varchar(50),
  color varchar(50),
  material varchar(50),
  storecode integer,
  primary key(id)
);