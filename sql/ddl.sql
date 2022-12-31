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