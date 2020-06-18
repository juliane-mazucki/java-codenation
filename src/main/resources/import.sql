insert into User (id, name, username, password, active) values (1, 'Juliane Mazucki', 'juliane.mazucki', '$2a$10$K0acH/ojxdWpQnXTWv9g5.1FiGZeVpnK7kPzm4k9SmyGfO/LL/mgi', true);

insert into Permission (id, name) values (1, 'USER');

insert into User_Permissions (users_id, permissions_id) values (1, 1);