create table user (
	id INT not null auto_increment,
	name varchar(20),
	email varchar(100),
	likes varchar(200),
	primary key(id)
);
-- dummy data
insert into user(name, email) values ('Rourke', 'rgallgher0@wikipedia.org');
insert into user(name, email) values ('Trstram', 'tsloper1@1688.com');
insert into user(name, email) values ('Bettine', 'bbuxton2@icq.com');
insert into user(name, email) values ('Elaine', 'eanthill3@barnesandnoble.com');
insert into user(name, email) values ('Caritta', 'cshute4@unesco.org');
insert into user(name, email) values ('Loren', 'lsephton5@dot.gov');
insert into user(name, email) values ('Hanni', 'hlegrand6@google.it');
insert into user(name, email) values ('Micheline', 'mhuckfield7@netlog.com');

create table board (
  id INT not null auto_increment,
  title varchar(100),
  file varchar(100),
  likeCount int(11),
  primary key(id)
);

-- dummy data
insert into board (title, file, likeCount) values ('Editor', 'SapienCumSociis.ppt', 72);
insert into board (title, file, likeCount) values ('Product Engineer', 'VestibulumRutrum.xls', 96);
insert into board (title, file, likeCount) values ('Accounting Assistant I', 'IntegerAcNeque.ppt', 93);
insert into board (title, file, likeCount) values ('Analog Circuit Design manager', 'CurabiturConvallisDuis.avi', 30);
insert into board (title, file, likeCount) values ('Analyst Programmer', 'OdioIn.jpeg', 13);
insert into board (title, file, likeCount) values ('Assistant Media Planner', 'AliquamAugueQuam.avi', 37);
insert into board (title, file, likeCount) values ('Product Engineer', 'Et.png', 13);
insert into board (title, file, likeCount) values ('Biostatistician II', 'Imperdiet.tiff', 11);
insert into board (title, file, likeCount) values ('Research Assistant II', 'Morbi.png', 54);
insert into board (title, file, likeCount) values ('Account Executive', 'NullamPorttitor.avi', 69);