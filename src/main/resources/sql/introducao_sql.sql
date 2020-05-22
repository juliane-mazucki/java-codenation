INSERT INTO cliente (numero_cliente, primeiro_nome, sobrenome, idade, empresa) VALUES (123, 'Juliane','Mazucki', 35, 'iFood');
insert into cliente values (456, 'Igor','Lema', 24, 'iFood');
insert into cliente values (789, 'João','Santos', 36, 'Ci&T');

ALTER TABLE cliente ADD PRIMARY KEY (numero_cliente);


SELECT * FROM cliente;

SELECT primeiro_nome, sobrenome FROM cliente;

SELECT DISTINCT empresa FROM cliente;

SELECT COUNT(numero_cliente) FROM cliente;

SELECT * FROM cliente WHERE idade >= 10 ORDER BY primeiro_nome, sobrenome;

SELECT MIN(idade), MAX(idade) FROM cliente;
SELECT SUM(idade), AVG(idade) FROM cliente;

SELECT * FROM cliente WHERE primeiro_nome LIKE 'J%';
SELECT * FROM cliente WHERE primeiro_nome LIKE '%r';
SELECT * FROM cliente WHERE primeiro_nome LIKE '%o%';

SELECT * FROM cliente LIMIT 2;

SELECT * FROM cliente WHERE location_id IS NULL;
SELECT * FROM cliente WHERE location_id IS NOT NULL;

SELECT * FROM cliente WHERE sobrenome IS NULL;
SELECT * FROM cliente WHERE sobrenome IS NOT NULL;

UPDATE cliente set primeiro_nome = 'JU', idade = 36 where numero_cliente = 123;

DELETE FROM cliente WHERE empresa = 'Ci&T';

	CREATE TABLE cliente (
		numero_cliente numeric NOT NULL,
		primeiro_nome varchar(20) NOT NULL,
		sobrenome varchar(20) NOT NULL,
		idade numeric NOT NULL,
		empresa varchar(30) NOT NULL,
		CONSTRAINT cliente_pkey PRIMARY KEY (numero_cliente)
	);

	CREATE INDEX cliente_idade_idx ON cliente (idade);

	CREATE OR REPLACE VIEW cliente_view
	AS SELECT primeiro_nome, sobrenome FROM cliente WHERE empresa = 'Ci&T';




	ALTER TABLE cliente RENAME COLUMN primeiro_nome TO nome;
	ALTER TABLE cliente ALTER COLUMN primeiro_nome TYPE varchar(30);
	ALTER TABLE cliente ALTER COLUMN empresa DROP NOT NULL;

	ALTER INDEX IF EXISTS i1 RENAME TO index1;

	ALTER  VIEW .cliente_view
	AS SELECT cliente.primeiro_nome,
	    cliente.sobrenome, 
	    cliente.idade
	   FROM cliente
	  WHERE cliente.empresa::text = 'Ci&T'::text;
	 
	DROP TABLE cliente;

	DROP VIEW cliente_view;
	
	DROP INDEX IF EXISTS i1;

	ALTER TABLE cargo ADD PRIMARY KEY (id);


delete from funcionario f;


insert into cargo (id, nome, inicio_faixa_salarial, fim_faixa_salarial) values (1, 'PRESIDENTE', 30000, null);

insert into cargo (id, nome, inicio_faixa_salarial, fim_faixa_salarial) values (2, 'DIRETOR', 20000, 25000);

insert into cargo (id, nome, inicio_faixa_salarial, fim_faixa_salarial) values (3, 'GERENTE', 15000, 20000);

insert into cargo (id, nome, inicio_faixa_salarial, fim_faixa_salarial) values (4, 'ANALISTA', 10000, 15000);

insert into cargo (id, nome, inicio_faixa_salarial, fim_faixa_salarial) values (5, 'ESTAGIARIO', 1000, 2000);

insert into funcionario (id, nome, fk_cargo_id, nascimento, salario) values (1, 'PAULA', 1, '1975-06-23', 32550);

insert into funcionario (id, nome, fk_cargo_id, nascimento, salario) values (2, 'ANDRÉ', 2, '1975-06-23', 23550);

insert into funcionario (id, nome, fk_cargo_id, nascimento, salario) values (3, 'MADALENA', 3, '1975-06-23', 16000);

insert into funcionario (id, nome, fk_cargo_id, nascimento, salario) values (4, 'RICARDO', 3, '1975-06-23', 16000);

insert into funcionario (id, nome, fk_cargo_id, nascimento, salario) values (5, 'TERESA', 4, '1975-06-23', 11000);

insert into funcionario (id, nome, fk_cargo_id, nascimento, salario) values (6, 'RODRIGO', 4, '1975-06-23', 11000);

insert into funcionario (id, nome, fk_cargo_id, nascimento, salario) values (7, 'LEONARDO', 4, '1975-06-23', 11000);

insert into funcionario (id, nome, fk_cargo_id, nascimento, salario) values (8, 'MARIANA', 4, '1975-06-23', 11000);

insert into funcionario (id, nome, fk_cargo_id, nascimento, salario) values (9, 'HELENA', null, '1975-06-23', 1200);


select funcionario.nome, cargo.nome from funcionario inner join cargo on funcionario.fk_cargo_id = cargo.id; 
select funcionario.nome, cargo.nome from funcionario join cargo on funcionario.fk_cargo_id = cargo.id;

select funcionario.nome, cargo.nome from funcionario left outer join cargo on funcionario.fk_cargo_id = cargo.id;

select funcionario.nome, cargo.nome from funcionario right outer join cargo on funcionario.fk_cargo_id = cargo.id;

select funcionario.nome, cargo.nome from funcionario full outer join cargo on funcionario.fk_cargo_id = cargo.id;

delete from cliente where numero_cliente in (111,222);


INSERT INTO cliente (numero_cliente, primeiro_nome, sobrenome, idade, empresa) VALUES (222, 'Juliane','Silva', 35, 'iFood');



INSERT INTO cliente (numero_cliente, primeiro_nome, sobrenome, idade, empresa) VALUES (333, 'Paulo','Ferreira', 50, 'iFood');


INSERT INTO cliente (numero_cliente, primeiro_nome, sobrenome, idade, empresa) VALUES (4, 'Cintia',null, 43, 'CPqD');
update cliente set sobrenome = null where numero_cliente = 4;


SELECT * FROM cliente;

SELECT primeiro_nome, sobrenome FROM cliente;

SELECT DISTINCT empresa FROM cliente;

SELECT COUNT(numero_cliente) FROM cliente;

SELECT primeiro_nome || ' ' || sobrenome as "Nome completo" FROM cliente;

SELECT * FROM cliente WHERE empresa = 'Ci&T';

SELECT * FROM cliente WHERE primeiro_nome <> 'Juliane';

SELECT * FROM cliente WHERE idade > 40;

SELECT * FROM cliente WHERE numero_cliente <= 456;

SELECT * FROM cliente WHERE empresa IN ('Ci&T', 'iFood');

SELECT * FROM cliente WHERE empresa = 'Ci&T' AND sobrenome = 'Santos';
SELECT * FROM cliente WHERE empresa = 'Ci&T' OR sobrenome = 'Mazucki';
SELECT * FROM cliente WHERE primeiro_nome NOT IN ('Juliane', 'José');
SELECT * FROM cliente WHERE NOT numero_cliente = 456;
SELECT * FROM cliente WHERE empresa = 'Ci&T' OR (empresa = 'iFood' AND idade > 40);
SELECT * FROM cliente WHERE empresa = 'iFood' AND (sobrenome = 'Mazucki' OR idade < 40);

SELECT * FROM cliente ORDER BY numero_cliente desc;

SELECT MIN(idade), MAX(idade) FROM cliente;
SELECT SUM(idade), AVG(idade) FROM cliente;

SELECT * FROM cliente WHERE primeiro_nome LIKE 'J%';
SELECT * FROM cliente WHERE primeiro_nome LIKE '%r';
SELECT * FROM cliente WHERE primeiro_nome LIKE '%o%';

SELECT * FROM cliente LIMIT 2;

SELECT * FROM cliente WHERE sobrenome IS NULL;
SELECT * FROM cliente WHERE sobrenome IS NOT NULL;

SELECT * FROM cliente WHERE sobrenome is null or sobrenome <> 'Silva';


INSERT INTO cliente (numero_cliente, primeiro_nome, sobrenome, idade, empresa) VALUES (1, 'Leonardo', NULL, 27, 'iFood');

INSERT INTO cliente (primeiro_nome, idade, numero_cliente, empresa) VALUES ('Alexandre', 36, 3, 'iFood');

INSERT INTO cliente VALUES (1, 'Alex', null, 27, 'iFood');


UPDATE cliente SET primeiro_nome = 'JU', idade = 36 WHERE numero_cliente = 123;

UPDATE cliente SET empresa = 'IFOOD' WHERE empresa = 'iFood';

UPDATE cliente SET primeiro_nome = 'JU', idade = 36;


DELETE FROM cliente WHERE empresa = 'CPqD';

	CREATE TABLE cliente_1 (
		numero_cliente numeric NOT NULL,
		primeiro_nome varchar(20) NOT NULL,
		sobrenome varchar(20) NOT NULL,
		idade numeric NOT NULL,
		empresa varchar(30) NOT NULL,
		CONSTRAINT cliente_1_pkey PRIMARY KEY (numero_cliente)
	);

	CREATE INDEX cliente_nome_sobrenome_idx ON cliente (primeiro_nome, sobrenome);

	CREATE OR REPLACE VIEW cliente_view
	AS SELECT primeiro_nome, sobrenome FROM cliente WHERE idade < 30;

select * from cliente_view;


select * from cargo;

select * from funcionario;

delete from cargo where ID = 1;



ALTER TABLE public.funcionario ADD CONSTRAINT funcionario_fk FOREIGN KEY (fk_cargo_id) REFERENCES public.cargo(id);

DROP INDEX public.cargo_nome_idx;

CREATE UNIQUE INDEX cargo_nome_idx ON public.cargo (nome);

insert into cargo values (6, 'ESTAGIARIO', 1, NULL);



insert into produto values (1, 'COCA-COLA');
insert into produto values (2, 'GUARANÁ');
insert into produto values (3, 'FANTA UVA');

insert into estabelecimento values (1, 'CARREOUR');
insert into estabelecimento values (2, 'EXTRA');
insert into estabelecimento values (3, 'DIA');


insert into produto_estabelecimento values (1, 1);
insert into produto_estabelecimento values (1, 2);
insert into produto_estabelecimento values (3, 2);

select * from produto_estabelecimento where id_produto = 1;

select * from cargo;
select * from funcionario;

select
	func.nome,
	c.nome
from
	funcionario as func
inner join cargo as c on
	func.fk_cargo_id = c.id;
--where func.nome like 'M%'; 
SELECT funcionario.nome, cargo.nome FROM funcionario JOIN cargo on funcionario.fk_cargo_id = cargo.id;

SELECT funcionario.nome, cargo.nome FROM funcionario LEFT OUTER JOIN cargo on funcionario.fk_cargo_id = cargo.id;

SELECT funcionario.nome, cargo.nome FROM funcionario RIGHT OUTER JOIN cargo on funcionario.fk_cargo_id = cargo.id;

SELECT funcionario.nome, cargo.nome from funcionario FULL OUTER JOIN cargo on funcionario.fk_cargo_id = cargo.id;

select
	p.nome,
	e.nome
from
	produto p
join produto_estabelecimento pe on
	pe.id_produto = p.id
join estabelecimento e on
	pe.id_estabelecimento = e.id
where p.nome = 'COCA-COLA';


create or replace view venda_de_produtos
as select
	p.nome nome_produto,
	e.nome nome_estabelecimento
from
	produto p
join produto_estabelecimento pe on
	pe.id_produto = p.id
join estabelecimento e on
	pe.id_estabelecimento = e.id;

select * from venda_de_produtos where nome_estabelecimento = 'EXTRA';
select * from venda_de_produtos where nome_produto = 'FANTA UVA';
