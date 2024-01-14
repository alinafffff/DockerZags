CREATE TABLE certificates(
    id serial PRIMARY KEY,
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

CREATE TABLE facilities(
	id serial PRIMARY KEY,
	type varchar(50) NOT NULL,
	tariff int NOT NULL
);

CREATE TABLE person(
	id serial PRIMARY KEY,
	name varchar(50) NOT NULL,
	surname varchar(50) NOT NULL,
	patronymic varchar(50) NOT NULL,
	birthday date NOT NULL,
	passport_series int NOT NULL,
	passport_number int NOT NULL,
	snils varchar(50) NOT NULL,
	email varchar(50) NOT NULL
);

CREATE TABLE role(
	id serial PRIMARY KEY,
	role varchar(50) NOT NULL,
	login varchar(50) NOT NULL,
	password varchar(50) NOT NULL
);

INSERT INTO role(role, login, password)
VALUES('admin', 'alina', 12345678);

INSERT INTO facilities(type, tariff)
VALUES('����������� �����', 350),
('����������� ����������� �����', 350),
('����������� ��������', 250),
('����������� ������', 250),
('����������� ����� �����', 450),
('����������� ������������ ���������', 250),
('����������� �����������/����������', 250);
