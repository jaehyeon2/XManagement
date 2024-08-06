CREATE TABLE if NOT EXISTS x_management.users(
	user_no INTEGER NOT NULL AUTO_INCREMENT,
	user_name VARCHAR(100) NOT NULL,
	user_email VARCHAR(100) NOT NULL,
	user_phone VARCHAR(100) NOT NULL,
	user_auth VARCHAR(10) NOT NULL,
	user_position VARCHAR(10) NOT NULL,
	user_responsibility VARCHAR(50) NOT NULL,
	user_class VARCHAR(10) NOT NULL,
	user_id VARCHAR(100) NOT NULL,
	user_domain VARCHAR(100) NOT NULL,
	company_no INTEGER NOT NULL,
	department_no INTEGER NOT NULL,
	admin_id VARCHAR(100) NOT NULL,
	insert_date TIMESTAMP NOT NULL,
	update_date TIMESTAMP NOT NULL,
	user_temp CHAR(1) NULL,
	user_delete CHAR(1) NOT NULL,
	PRIMARY KEY (user_no)
)ENGINE=InnoDB default CHARSET=utf8;

CREATE TABLE if NOT EXISTS x_management.company(
	company_no INTEGER NOT NULL AUTO_INCREMENT,
	company_name VARCHAR(100) NOT NULL,
	company_address VARCHAR(1000) NOT NULL,
	company_zip VARCHAR(10) NOT NULL,
	company_code VARCHAR(100) NOT NULL,
	insert_date TIMESTAMP NOT NULL,
	update_date TIMESTAMP NOT NULL,
	company_temp CHAR(1) NULL,
	company_delete CHAR(1) NOT NULL,
	PRIMARY KEY (company_no)
)ENGINE=InnoDB default CHARSET=utf8;

CREATE TABLE if NOT EXISTS x_management.department(
	department_no INTEGER NOT NULL AUTO_INCREMENT,
	department_name VARCHAR(100) NOT NULL,
	department_code VARCHAR(100) NOT NULL,
	department_parent_no INTEGER NOT NULL,
	company_no INTEGER NOT NULL,
	admin_id VARCHAR(100) NOT NULL,
	insert_date TIMESTAMP NOT NULL,
	update_date TIMESTAMP NOT NULL,
	department_temp CHAR(1) NULL,
	department_delete CHAR(1) NOT NULL,
	PRIMARY KEY (department_no)
)ENGINE=InnoDB default CHARSET=utf8;