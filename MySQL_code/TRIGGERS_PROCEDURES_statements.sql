
	delimiter $

	create procedure check_diaxirizetai()
	begin

	declare finishedflag int;
	declare temp_email varchar(255);
	declare temp_idiothta varchar(255);
	declare counter int;
	declare cursor1 cursor for
		select dia_email from diaxirizetai;
	declare continue handler for not found set finishedflag=1;
	open cursor1;
	set finishedflag=0;
	set counter=0;
	fetch cursor1 into temp_email;
	while(finishedflag=0) do
		select dim_idiothta into temp_idiothta
    		from dimosiografos where dim_email=temp_email;
    		if(temp_idiothta not like 'Arxisintakths') then
			set counter= counter+1;
		end if;
    		fetch cursor1 into temp_email;
	end while;
	close cursor1;
	if(counter=0) then
		select 'All managers are ok.';
	else
		select 'Something is wrong';
	end if;

	end$

	//CALCULATE MISTHOS FOR JOURNALISTS

	delimiter $
	create procedure procedureBforAll()
	begin
	declare temp_email varchar(255);
	declare finishedFlag int;
	declare cursor1 cursor for
		select dim_email from dimosiografos;
	declare continue handler for not found set finishedFlag=1;
	open cursor1;
	set finishedFlag=0;
	fetch cursor1 into temp_email;
	while(finishedFlag = 0) do
		call procedureB(temp_email);
    		fetch cursor1 into temp_email;
	end while;
	close cursor1;
	end$



	//CALCULATE MISTHOS FOR DIK


	delimiter $
	create procedure procedureBforAllDik()
	begin
	declare temp_email varchar(255);
	declare finishedFlag int;
	declare cursor1 cursor for
		select dik_email from dioikitikos;
	declare continue handler for not found set finishedFlag=1;
	open cursor1;
	set finishedFlag=0;
	fetch cursor1 into temp_email;
	while(finishedFlag = 0) do
		call procedureBDik(temp_email);
    		fetch cursor1 into temp_email;
	end while;
	close cursor1;
	end$
	
	//ZHTOUMENA PROCEDURES

	#procedureA

	delimiter $

	create procedure procedureA(in temp_fyllo int, in temp_efhmerida varchar(255))
	begin
	declare temp_path varchar(255);
	declare temp_email varchar(255);
	declare temp_diathesimes int(9);
	declare finishedflag int;
	declare cursor1 cursor for
		select ar_path from arthro
    		inner join ypovalei on ypo_path=ar_path
    		where ar_fyl_dim=temp_fyllo and ar_efhmerida=temp_efhmerida
    		order by ypo_hmer_ypovolhs;
	declare continue handler for not found set finishedflag=1;
	select fyl_diathesimes_sel into temp_diathesimes from fyllo
		where fyl_arithmos=temp_fyllo and fyl_efhmerida=temp_efhmerida;
	open cursor1;
	fetch cursor1 into temp_path;
	set finishedflag=0;
	while(finishedflag=0) do
		select ar_titlos as Titlos, dim_onoma as Onoma, dim_epitheto as Epitheto, ar_hmerominia as Egkrish,ar_arxh as Ksekinaei, ar_telos as Ektash
    		from arthro 
    		inner join ypovalei on ar_path=ypo_path
    		inner join dimosiografos on ypo_email=dim_email
   		where ar_path=temp_path;
    	fetch cursor1 into temp_path;
	end while;
	close cursor1;
	if(temp_diathesimes = 0)then
		select 'KAMIA DIATHESIMH' as Diathesimes_selides;
	else
		select temp_diathesimes as Diathesimes_selides;
	end if;
	end$

	//FOR JOURNALISTS
	#procedureB

	delimiter $

	create procedure procedureB(in dim_mail_temp varchar(255))

	begin
    	declare hmerominia_pro_temp date;
    	declare proi_temp int(9);
    	declare hmero_proslipsis_temp date;
    	declare xronos_ypi int(9);

    	select dim_proipiresia, dim_proslhpsh into proi_temp, hmero_proslipsis_temp
    	from dimosiografos where dim_email=dim_mail_temp;
    
    	set xronos_ypi=floor(DATEDIFF(current_date(), hmero_proslipsis_temp)/30)+proi_temp*12;
    	update dimosiografos
    	set dim_misthos=650 + (xronos_ypi * (0.005 * 650))
    	where dim_email=dim_mail_temp;
    
	end$

	// FOR ADMINISTRATORS
	delimiter $

	create procedure procedureBDik(in dik_mail_temp varchar(255))

	begin
    	declare hmerominia_pro_temp date;
    	declare proi_temp int(9);
    	declare hmero_proslipsis_temp date;
    	declare xronos_ypi int(9);

    	select dik_proipiresia, dik_proslhpsh into proi_temp, hmero_proslipsis_temp
    	from dioikitikos where dik_email=dik_mail_temp;
    
    	set xronos_ypi=floor(DATEDIFF(current_date(), hmero_proslipsis_temp)/30)+proi_temp*12;
    	update dioikitikos
    	set dik_misthos=650 + (xronos_ypi * (0.005 * 650))
    	where dik_email=dik_mail_temp;
    
	end

//TRIGGERS
	
	//OUR TRIGGERS


	#Checkarei an o diaxirisths einai arxisintakths

	delimiter $

	create trigger if_Arxisintakths
	before insert 
	on diaxirizetai
	for each row
	begin
	declare temp_idiothta enum('Dimosiografos','Arxisintakths');

	select dim_idiothta into temp_idiothta
	from dimosiografos
	where dim_email=new.dia_email;

	if(temp_idiothta not like 'Arxisintakths') then
		signal sqlstate value '45000'
		set message_text='Manager must be Arxisintakths.';
	end if;
	end$

	#accept_trigger

	delimiter $

	create trigger accept_trigger
	before update
	on arthro
	for each row
	begin
	if (new.ar_katastash='accepted')
		then set new.ar_hmerominia=current_date();
	end if;
	end 

	#findStart and fix synolika

	delimiter $ 

	create trigger trigger_start_arthro
	before insert 
	on arthro
	for each row
	begin
	declare temp_diathesimes int(9);
	declare temp_synolika int(9);
	select fyl_selides, fyl_diathesimes_sel into temp_synolika, temp_diathesimes
	from fyllo where fyl_efhmerida=new.ar_efhmerida and fyl_arithmos=new.ar_fyl_dim;
	set new.ar_arxh=temp_synolika-temp_diathesimes;

	update fyllo
	set fyl_diathesimes_sel=temp_diathesimes-new.ar_telos
	where fyl_efhmerida=new.ar_efhmerida and fyl_arithmos=new.ar_fyl_dim;

	end

	#sets chief current chief for arthro

	delimiter $
	create trigger setArxisintakths
	before insert on arthro
	for each row

	begin 
	declare temp_arxi varchar(255);
	select dia_email into temp_arxi from diaxirizetai where dia_onoma=new.ar_efhmerida;
	set new.ar_arxisintakths = temp_arxi;
	end  


	#sets hmerominia ypovolhs current date

	delimiter $
	create trigger setYpo_date
	before insert 
	on ypovalei
	for each row
	begin
	set new.ypo_hmer_ypovolhs = current_date();
	end


	#sets the start page of an article

	delimiter $
	create trigger setArxh
	before update 
	on arthro
	for each row 

	begin 
	declare temp_diathesimes int(9);
	declare temp_synolika int(9);
	if(new.ar_katastash='aacepted') then
		set new.ar_hmerominia = current_date();
    		select fyl_selides, fyl_diathesimes_sel into temp_synolika, temp_diathesimes
		from fyllo where fyl_efhmerida=new.ar_efhmerida and fyl_arithmos=new.ar_fyl_dim;
		set new.ar_arxh=temp_synolika-temp_diathesimes;

	end if;
	end



	#fixes availdable pages on paper after delete

	delimiter $
	create trigger fix_diathesimes_on_delete
	before delete on arthro
	for each row

	begin
	declare temp_diathesimes int(9);
	if(old.ar_fyl_dim != 0) then
		select fyl_diathesimes_sel into temp_diathesimes from fyllo where fyl_efhmerida=old.ar_efhmerida and fyl_arithmos=old.ar_fyl_dim;
    		SET temp_diathesimes = temp_diathesimes + old.ar_telos;
    		update fyllo set fyl_diathesimes_sel=temp_diathesimes where fyl_efhmerida=old.ar_efhmerida and fyl_arithmos=old.ar_fyl_dim;
	end if;
	end




	#TIGGER THAT AFTER SETTING A JOURNALIST FOR CHIEF UPDATES HIS ARTICLES AND ACCEPTS THEM
	delimiter $
	create trigger triggerAccept
	before update 
	on dimosiografos
	for each row
	begin
	declare finishedFlag int;
	declare temp_path varchar(255);
	declare cursor1 cursor for
		select ypo_path from ypovalei where ypo_email=new.dim_email;
	declare continue handler for not found set finishedFlag=1;
	open cursor1;
	set finishedFlag =0;

	if(new.dim_idiothta='Arxisintakths') then
		fetch cursor1 into temp_path;
    		while(finishedFlag=0) do
			update arthro
        		set ar_katastash = 'accepted'
        		where ar_path = temp_path;
        		fetch cursor1 into temp_path;
		end while;
	end if;
	close cursor1;
	end



	#SET FYLLO DATE AND NO

	delimiter $

	create trigger set_date_NO_paper
	before insert on fyllo
	for each row

	begin
	declare temp_NO int(9);
	declare temp_syxnothta int(9);
	declare temp_date date;

	select max(fyl_kikloforia),max(fyl_arithmos) into temp_date,temp_NO from fyllo where fyl_efhmerida=new.fyl_efhmerida;
	select efh_syxnothta_ekdoshs into temp_syxnothta from efhmerida where efh_onoma=new.fyl_efhmerida;
	set new.fyl_kikloforia = temp_date + INTERVAL temp_syxnothta DAY;
	set new.fyl_arithmos = temp_No + 1;

	end

	//ZHTOUMENA TRIGGERS

	#tiggerc1

	delimiter $ 

	create trigger triggerC1
	before insert
	on dimosiografos
	for each row
	begin
	set new.dim_misthos=650;
	end

	#triggerc2

	delimiter $ 

	create trigger triggerC2
	before insert
	on dioikitikos
	for each row
	begin
	set new.dik_misthos=650;
	end

	#triggerD

	delimiter $ 

	create trigger tiggerD
	after insert 
	on ypovalei
	for each row
	begin
	declare temp_idiothta enum('Dimosiografos','Arxisintakths');
	select dim_idiothta into temp_idiothta from dimosiografos 
	where dim_email=new.ypo_email;

	if(temp_idiothta ='Arxisintakths') then
		update arthro
		set ar_katastash='accepted'
    		where ar_path=new.ypo_path;
	end if;
	end


	#triggerE


	delimiter $

	create trigger triggerE
	before insert
	on arthro
	for each row 
	begin
	declare temp_diathesimes int(9);
	select fyl_diathesimes_sel into temp_diathesimes
	from fyllo where fyl_efhmerida=new.ar_efhmerida and fyl_arithmos = new.ar_fyl_dim;

	if(new.ar_telos>temp_diathesimes) then
		signal sqlstate value '45000'
		set message_text='Not enough space.';
	end if;

	end;
