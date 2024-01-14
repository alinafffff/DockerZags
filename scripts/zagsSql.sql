CREATE TABLE person(
	id int not null generated always as identity (increment by 1),
	name varchar(50) NOT NULL,
	surname varchar(50) NOT NULL,
	patronymic varchar(50) NOT NULL,
	birthday date NOT NULL,
	passport_series int NOT NULL,
	passport_number int NOT NULL,
	snils varchar(50) NOT NULL,
	email varchar(50) NOT NULL
);

CREATE TABLE facilities(
	id int not null generated always as identity (increment by 1),
	type varchar(50) NOT NULL,
	tariff int NOT NULL
);

CREATE TABLE certificates(
    id int not null generated always as identity (increment by 1),
    status varchar(50) NOT NULL,
    data date NOT NULL,
	act_number int NOT NULL,
    zags varchar(50) NOT NULL,
    id_person int NOT NULL,
	id_facilities int NOT NULL,
	checking int NOT NULL,
	FOREIGN KEY (id_person) REFERENCES person(id),
	FOREIGN KEY (id_facilities) REFERENCES facilities(id)
);


CREATE TABLE role(
	id int not null generated always as identity (increment by 1),
	role varchar(50) NOT NULL,
	login varchar(50) NOT NULL,
	password varchar(50) NOT NULL
);

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

