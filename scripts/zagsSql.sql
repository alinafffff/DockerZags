--CREATE TABLE person(
--	id se,
--	name varchar(50) NOT NULL,
--	surname varchar(50) NOT NULL,
--	patronymic varchar(50) NOT NULL,
--	birthday date NOT NULL,
--	passport_series int NOT NULL,
--	passport_number int NOT NULL,
--	snils varchar(50) NOT NULL,
--	email varchar(50) NOT NULL
--);
--
--CREATE TABLE facilities(
--	id int not null generated always as identity (increment by 1),
--	type varchar(50) NOT NULL,
--	tariff int NOT NULL
--);
--
--CREATE TABLE certificates(
--    id int not null generated always as identity (increment by 1),
--    status varchar(50) NOT NULL,
--    data date NOT NULL,
--	act_number int NOT NULL,
--    zags varchar(50) NOT NULL,
--    id_person int NOT NULL,
--	id_facilities int NOT NULL,
--	checking int NOT NULL,
--	FOREIGN KEY (id_person) REFERENCES person(id),
--	FOREIGN KEY (id_facilities) REFERENCES facilities(id)
--);
--
--
--CREATE TABLE role(
--	id int not null generated always as identity (increment by 1),
--	role varchar(50) NOT NULL,
--	login varchar(50) NOT NULL,
--	password varchar(50) NOT NULL
--);

--
--DROP TABLE IF EXISTS certificates;
--DROP TABLE IF EXISTS facilities;
--DROP TABLE IF EXISTS person;
--DROP TABLE IF EXISTS role;
--
--CREATE TABLE IF NOT EXISTS public.role
--(
--    id integer NOT NULL GENERATED ALWAYS AS IDENTITY ( INCREMENT 1 START 1 MINVALUE 1 MAXVALUE 2147483647 CACHE 1 ),
--    role character varying(50) COLLATE pg_catalog."default" NOT NULL,
--    login character varying(50) COLLATE pg_catalog."default" NOT NULL,
--    password character varying(50) COLLATE pg_catalog."default" NOT NULL,
--    CONSTRAINT role_pkey PRIMARY KEY (id)
--);
--
--CREATE TABLE IF NOT EXISTS public.facilities
--(
--    id integer NOT NULL GENERATED ALWAYS AS IDENTITY ( INCREMENT 1 START 1 MINVALUE 1 MAXVALUE 2147483647 CACHE 1 ),
--    type character varying(50) COLLATE pg_catalog."default" NOT NULL,
--    tariff integer NOT NULL,
--    CONSTRAINT facilities_pkey PRIMARY KEY (id)
--);
--
--CREATE TABLE IF NOT EXISTS public.person
--(
--    id integer NOT NULL GENERATED ALWAYS AS IDENTITY ( INCREMENT 1 START 1 MINVALUE 1 MAXVALUE 2147483647 CACHE 1 ),
--    name character varying(50) COLLATE pg_catalog."default" NOT NULL,
--    surname character varying(50) COLLATE pg_catalog."default" NOT NULL,
--    patronymic character varying(50) COLLATE pg_catalog."default" NOT NULL,
--    birthday date NOT NULL,
--    passport_series integer NOT NULL,
--    passport_number integer NOT NULL,
--    snils character varying(50) COLLATE pg_catalog."default" NOT NULL,
--    email character varying(50) COLLATE pg_catalog."default" NOT NULL,
--    CONSTRAINT person_pkey PRIMARY KEY (id)
--);
--
--CREATE TABLE IF NOT EXISTS public.certificates
--(
--    id integer NOT NULL GENERATED ALWAYS AS IDENTITY ( INCREMENT 1 START 1 MINVALUE 1 MAXVALUE 2147483647 CACHE 1 ),
--    status character varying(50) COLLATE pg_catalog."default" NOT NULL,
--    data date NOT NULL,
--    act_number integer NOT NULL,
--    zags character varying(50) COLLATE pg_catalog."default" NOT NULL,
--    id_person integer NOT NULL,
--    id_facilities integer NOT NULL,
--    checking integer NOT NULL,
--    CONSTRAINT certificates_pkey PRIMARY KEY (id),
--    CONSTRAINT certificates_id_facilities_fkey FOREIGN KEY (id_facilities)
--        REFERENCES public.facilities (id) MATCH SIMPLE
--        ON UPDATE NO ACTION
--        ON DELETE NO ACTION,
--    CONSTRAINT certificates_id_person_fkey FOREIGN KEY (id_person)
--        REFERENCES public.person (id) MATCH SIMPLE
--        ON UPDATE NO ACTION
--        ON DELETE NO ACTION
--);

INSERT INTO role(role, login, password)
VALUES('admin', 'alina', 12345678);

INSERT INTO facilities(type, tariff)
VALUES('Регистрация брака', 350),
('Регистрация расторжения брака', 350),
('Регистрация рождения', 250),
('Регистрация смерти', 250),
('Регистрация смены имени', 450),
('Регистрация установления отцовства', 250),
('Регистрация усыновления/удочерения', 250);

