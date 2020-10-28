create table efhmerida(
	efh_syxnothta_ekdoshs int(9) default '7' not null,
	efh_idiokthths varchar(255) not null,
	efh_onoma varchar(255) not null,
	primary key(efh_onoma)
);

create table dimosiografos(
	dim_email varchar(255) not null,
	dim_onoma varchar(255) default 'unknown' not null,
	dim_epitheto varchar(255) default 'unknown' not null,
	dim_misthos float(9) default '600' not null,
	dim_proslhpsh date not null,
	dim_proipiresia int(9) default '0' not null,
	dim_bio text,
	dim_idiothta enum('Dimosiografos','Arxisintakths'),
	dim_efhmerida varchar(255) not null,
	primary key(dim_email),
	
	constraint DIM_WORKS_IN
	foreign key(dim_efhmerida) references efhmerida(efh_onoma)
	on update cascade on delete cascade
);

create table diaxirizetai(
	dia_onoma varchar(255) not null,
	dia_email varchar(255) not null,
	primary key(dia_onoma,dia_email),
	constraint DIA_EFH
	foreign key(dia_onoma) references efhmerida(efh_onoma)
	on update cascade on delete cascade,
	constraint DIA_ARXI
	foreign key(dia_email) references dimosiografos(dim_email)
	on update cascade on delete cascade

);

create table dioikitikos(
        dik_email varchar(255) not null,
	dik_onoma varchar(255) default 'unknown' not null,
	dik_epitheto varchar(255) default 'unknown' not null,
	dik_misthos float(9) default '600' not null,
	dik_proslhpsh date not null,
	dik_kathikonta enum('Secretary','Logistics'),
	dik_odos varchar(255)  default 'unknown',
	dik_number int(9),
	dik_city varchar(255)  default 'unknown',
	dik_efhmerida varchar(255) not null,
	dik_proipiresia int(9) default '0' not null,
	primary key(dik_email),

	constraint DIK_WORKS_IN
	foreign key(dik_efhmerida) references efhmerida(efh_onoma)
	on update cascade on delete cascade
);

create table thlefwna(
	dik_thlefwno bigint(16) not null,
	dik_email varchar(255) not null,
	primary key(dik_thlefwno,dik_email),

	constraint DIK_THLEFWNO
	foreign key(dik_email) references dioikitikos(dik_email)
	on update cascade on delete cascade
);

create table fyllo(
	fyl_efhmerida varchar(255) not null,
	fyl_arithmos int(9) not null,
  	fyl_selides int(9) not null,
  	fyl_kikloforia date not null,
  	fyl_diathesimes_sel int(9) not null,
  	fyl_antitypa int(9) not null,
  	fyl_epistramena_antit int(9) not null,
  	primary key(fyl_arithmos,fyl_efhmerida),

  	constraint FYL_EFI
  	foreign key(fyl_efhmerida) references efhmerida(efh_onoma)
  	on update cascade on delete cascade
);



create table kathgoria(
    	kat_id int(9) not null auto_increment,
    	kat_name varchar(255) not null,
    	kat_perigrafh text not null,
    	kat_parent_id int(9),
    	primary key(kat_id),
    	constraint KAT_TO_KAT
    	foreign key(kat_parent_id) references kathgoria(kat_id)
    	on update cascade on delete cascade
);

create table arthro(
	ar_path varchar(255) not null,
	ar_titlos varchar(255) not null,
	ar_perilipsh text,
	ar_eikones varchar(255) default 'unknown' not null,
	ar_arxh int(9) default '0' ,
	ar_telos int(9) not null,
	ar_katastash enum('accepted','rejected','resubmission'),
	ar_hmerominia date ,
	ar_fyl_dim int(9) DEFAULT '0',
	ar_kathgoria int(9) not null,
	ar_arxisintakths varchar(255) not null,
	ar_efhmerida varchar(255) not null,
	sxolia varchar(255),
	primary key(ar_path),
	
	constraint AR_FYL
	foreign key(ar_fyl_dim) references fyllo(fyl_arithmos)
	on update cascade on delete cascade,

	constraint AR_KATHGORIA
	foreign key(ar_kathgoria) references kathgoria(kat_id)
	on update cascade on delete cascade,
	
	constraint AR_ELEGXEI
	foreign key(ar_arxisintakths) references diaxirizetai(dia_email) 
	on update cascade on delete cascade,

	constraint AR_EFHMERIDA
	foreign key(ar_efhmerida) references fyllo(fyl_efhmerida)
	on update cascade on delete cascade
);


create table lexi_klidi(
  	lex_path varchar(255) not null,
  	lex_lexeis_klidia varchar(255) not null,
  	primary key(lex_path,lex_lexeis_klidia),
  	constraint PATH_TO_PATH
  	foreign key(lex_path) references arthro(ar_path)
  	on update cascade on delete cascade
);

create table ypovalei(
	ypo_email varchar(255) not null,
	ypo_path  varchar(255) not null,
	ypo_hmer_ypovolhs date,
	primary key(ypo_email,ypo_path),

	constraint DIM_YPO
	foreign key(ypo_email) references dimosiografos(dim_email)
	on update cascade on delete cascade,

	constraint YPO_AR
	foreign key(ypo_path) references arthro(ar_path)
	on update cascade on delete cascade
);

create table Login(
	Username varchar(255) not null,
	L_Password varchar(255) not null,
	property Enum('Publisher','Chief','Journalist','Administrator'),
	email varchar(255) default 'unknown',
	company varchar(255) not null,
	primary key(Username),
	constraint LOG_WORKS
	foreign key(company) references efhmerida(efh_onoma)
	on update cascade on delete cascade
);



%INSERT STATEMENTS


insert into efhmerida values
(7,'apostolos kontarinis','ELEFTHEROTYPIA'),
(1,'giannis sina','TO VHMA'),
(28,'giorgos sotirakopoulos','KATHIMERHNH'),
(14,'andreas vasilopoulos','TO THEMA');


insert into dimosiografos values
('ggeorgiou@yahoo.gr','giorgos','georgiou',1500,'2019-03-01',2,'ptixio agglikwn,ptixio panteio','Dimosiografos','ELEFTHEROTYPIA'),
('aathanasiou@gmail.gr','anastasis','athanasiou',5000,'2019-03-01',10,'ptixio agglikwn,germanikwn,ptixio panteio,harvard,st.uni.new york','Arxisintakths','ELEFTHEROTYPIA'),

('tasosdim@hotmail.gr','tasos','dimopoulos',1300,'2019-3-24',1,'ptixio gallikwn,ptixio EKPA','Dimosiografos','TO VHMA'),
('nkonstantinou@gmail.com','natalia','konstantinou',3000,'2018-08-01',12,'ptixio agglikwn,ptixio Harvard','Arxisintakths','TO VHMA'),

('katerinapapa@yahoo.gr','katerina','papadopoulou',1700,'2018-01-01',2,'ptixio agglikwn,germanikwn,ptixio oxford','dimosiografos','KATHIMERHNH'),
('amikroutsikos@gmail.com','alexandros','mikroutsikos',2200,'2018-01-01',9,'ptixio agglikwn,ptixio Aristotelio','Arxisintakths','KATHIMERHNH'),

('nikoskap@gmail.com','nikos','kapadoglou',1700,'2019-01-01',3,'ptixio agglikwn,ispanikwn ptixio PA.patrwn','dimosiografos','TO THEMA'),
('pxiotis@gmai.gr','panos','xiotis',1800,'2019-01-01',17,'ptixio agglikwn,ptixio Iwanniwn','Arxisintakths','TO THEMA');



insert into diaxirizetai values
('ELEFTHEROTYPIA','aathanasiou@gmail.gr'),
('TO VHMA','nkonstantinou@gmail.com'),
('KATHIMERHNH','amikroutsikos@gmail.com'),
('TO THEMA','pxiotis@gmai.gr');



insert into dioikitikos values
('aalafouzos@gmail.com','antreas','alafouzos',1200,'2017-3-10','Secretary','panepistimiou',162,'patra','ELEFTHEROTYPIA',10),
('pakridas@yahoo.com','panagiotis','akridas',1300,'2018-6-20','Logistics','karolou',49,'patra','ELEFTHEROTYPIA',15),

('xaleksiou@gmail.com','xristos','aleksiou',1200,'2019-3-10','Secretary','ermou',30,'athina','KATHIMERHNH',10),
('kvenizelos@hotmail.com','kwstas','venizelos',1400,'2017-3-10','Logistics','panepistimiou',130,'athina','KATHIMERHNH',15),

('xgalani@gmail.com','xristina','galani',1400,'2015-6-29','Secretary','ag.dhmhtrh',160,'patra','TO THEMA',10),
('ggianou@gmail.com','giannis','gianou',1100,'2018-4-10','Logistics','panepistimiou',130,'patra','TO THEMA',15),

('oiliadhs@gmail.com','odiseas','iliadhs',1500,'2017-3-10','Secretary','zaimi',120,'patra','TO VHMA',10),
('akabouris@yahoo.com','axilleas','kabouris',1400,'2018-3-10','Logistics','panepistimiou',180,'patra','TO VHMA',15);



insert into thlefwna values 
(6912345678,'aalafouzos@gmail.com'),
(2100000000,'aalafouzos@gmail.com'),
(6911111111,'akabouris@yahoo.com'),
(6912344444,'ggianou@gmail.com'),
(6912999999,'kvenizelos@hotmail.com'),
(6900000000,'oiliadhs@gmail.com'),
(6912341274,'pakridas@yahoo.com'),
(6912345584,'xaleksiou@gmail.com'),
(6912345000,'xgalani@gmail.com'),
(2101010101,'xgalani@gmail.com');


insert into fyllo values
('TO VHMA', 0, 30, "2020-1-1", 30, 100, -1),
('TO THEMA', 0, 30, "2020-1-1", 30, 100, -1),
('KATHIMERHNH', 0, 30, "2020-1-1", 30, 100, -1),
('ELEFTHEROTYPIA', 0, 30, "2020-1-1", 30, 100, -1);


insert into kathgoria values
(NULL,'Athlitika','podosfairo,basket',null),
(NULL,'Olimpiakoi agwnes','pekino',1),
(NULL, "Oikonomika", "Oikonomikoi Deiktes", NULL),
(NULL, "Koinwnika", "Koinwnikes Synthikes", NULL),
(NULL, "Kosmika", "Reality Shows", NULL);


insert into arthro values
('C:\Users\Articles\Submitted\Article1a.doc','Barcelona vs Real','Talking about the goals','C:\Users\images\football.jpeg',NULL,4,'rejected',NULL,NULL,1,'tasosdim@hotmail.gr','TO VHMA',NULL),
('C:\Users\Articles\Submitted\Article2a.doc','Mitsotakhs en drash','Mhtsotakis speach','C:\Users\images\mitso.jpeg',NULL,3,'resubmission',NULL,NULL,3,'pxiotis@gmail.gr','TO THEMA',NULL),
('C:UsersArticlesSubmittedArticle6b.doc','DIMOPSIFISMA','apopseis peri tou thematos','C:Users\Article\meros.png',NULL,5,'resubmission',NULL,NULL,2,'pxiotis@gmail.gr','TO THEMA',NULL),
('C:UsersArticlesSubmittedArticle6g.doc','Tourkoi hackers','Epithesh tourkwn','*',NULL,5,'rejected',NULL,NULL,3,'tasosdim@hotmail.gr','TO VHMA',NULL);


insert into lexi_klidi values
('C:UsersArticlesSubmittedArticle1a.doc','messi'),
('C:UsersArticlesSubmittedArticle2a.doc','voulh');



insert into ypovalei values
('tasosdim@hotmail.gr','C:UsersArticlesSubmittedArticle1a.doc',NULL),
('nikoskap@gmail.com','C:UsersArticlesSubmittedArticle2a.doc',NULL),
('nikoskap@gmail.com','C:UsersArticlesSubmittedArticle6b.doc',NULL),
('tasosdim@hotmail.gr','C:UsersArticlesSubmittedArticle6g.doc',NULL);



insert into Login values
("aathanasiou","1999","Chief","aathanasiou@gmail.gr","ELEFTHEROTYPIA"),
("mikroutsikos","1999","Chief","amikroutsikos@gmail.com","KATHIMERHNH"),
("georgiou","1999","Journalist","ggeorgiou@yahoo.gr","ELEFTHEROTYPIA"),
("katpap","1999","Journalist","katerinapapa@yahoo.gr","KATHIMERHNH"),
("nikos","1999","Journalist","nikoskap@gmail.com","TO THEMA"),
("natalia","1999","Chief","nkonstantinou@gmail.com","TO VHMA"),
("xiotis","1999","Chief","pxiotis@gmail.gr","TO THEMA"),
("dimopoulos","1999","Journalist","tasosdim@hotmail.gr","TO VHMA"),

("alafouzos","1999","Administrator","aalafouzos@gmail.com","ELEFTHEROTYPIA"),
("akridas","1999","Administrator","pakridas@yahoo.com","ELEFTHEROTYPIA"),
("venizelos","1999","Administrator","kvenizelos@hotmail.com","KATHIMERHNH"),
("aleksiou","1999","Administrator","xaleksiou@gmail.com","KATHIMERHNH"),
("gianou","1999","Administrator","ggianou@gmail.com","TO THEMA"),
("galani","1999","Administrator","xgalani@gmail.com","TO THEMA"),
("kavourhs","1999","Administrator","akabouris@yahoo.com","TO VHMA"),
("iliadhs","1999","Administrator","oiliadhs@gmail.com","TO VHMA"),

("kontarinis","1999","Publisher",NULL,"ELEFTHEROTYPIA"),
("sotirakopoulos","1999","Publisher",NULL,"KATHIMERHNH"),
("vasilopoulos","1999","Publisher",NULL,"TO THEMA"),
("sina","1999","Publisher",NULL,"TO VHMA");
