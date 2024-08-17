CREATE USER 'x_user'@'localhost' IDENTIFIED BY '1q2w3e4r';
GRANT ALL PRIVILEGES ON x_management.* TO 'x_user'@'localhost';
FLUSH PRIVILEGES;