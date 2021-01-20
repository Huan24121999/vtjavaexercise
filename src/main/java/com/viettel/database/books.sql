create database ebookshop

create table books(
id int,
title varchar(50),
author varchar(50),
price float,
qty int,
primary key (id)
)

insert into books
values
(1,'Never eat alone','Keith Ferrazzi',4.5,1),
(2,'NLP','Philip Miller',2.3,1),
(3,'Hello my friend','Huan NT',2,2)

update books
set title='Hello, my brother'
where author like '%Huan%'

delete from books
where title like '%Hello%'

select *
from books
where id=1
