create table user (
	seq INT not null auto_increment,
	name varchar(20),
	email varchar(100),
	title varchar(200),
	primary key(seq)
);
-- dummy data
insert into user(name, email, title) values ('Rourke', 'rgallgher0@wikipedia.org', 'Phantom');
insert into user(name, email, title) values ('Trstram', 'tsloper1@1688.com', 'Sweet Movie');
insert into user(name, email, title) values ('Bettine', 'bbuxton2@icq.com', 'Next Day Air');
insert into user(name, email, title) values ('Elaine', 'eanthill3@barnesandnoble.com', 'Police Academy 3: Back in Training');
insert into user(name, email, title) values ('Caritta', 'cshute4@unesco.org', 'Along the Great Divide (Travelers, The)');
insert into user(name, email, title) values ('Loren', 'lsephton5@dot.gov', 'Howards of Virginia, The');
insert into user(name, email, title) values ('Hanni', 'hlegrand6@google.it', 'Model Shop');
insert into user(name, email, title) values ('Micheline', 'mhuckfield7@netlog.com', 'O.C. and Stiggs');