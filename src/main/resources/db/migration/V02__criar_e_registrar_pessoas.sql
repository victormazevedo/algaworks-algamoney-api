CREATE TABLE pessoa (
  codigo BIGINT(20) PRIMARY KEY AUTO_INCREMENT,
  nome VARCHAR(50) NOT NULL,
  logradouro VARCHAR(50),
  numero VARCHAR(6),
  complemento VARCHAR(20),
  bairro VARCHAR(30),
  cep VARCHAR(9),
  cidade VARCHAR(40),
  estado VARCHAR(30),
  ativo BOOLEAN
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

INSERT INTO pessoa (nome, logradouro, numero, complemento, bairro, cep, cidade, estado, ativo)
values ('Victor Moura Azevedo', 'Rua Heitor Chiarello', '105', 'ap122', 'Jd.Irajá', '14020520', 'Ribeirão Preto', 'São Paulo', true);

INSERT INTO pessoa (nome, logradouro, numero, complemento, bairro, cep, cidade, estado, ativo)
values ('Serena Mazzi Bruzadin', 'Rua Major Maragliano', '334', 'ap52', 'Vila Mariana', '04017030', 'São Paulo', 'São Paulo', true);

INSERT INTO pessoa (nome, logradouro, numero, complemento, bairro, cep, cidade, estado, ativo)
values ('Marilia Moura', 'Rua Heitor Chiarello', '105', 'ap122', 'Jd.Irajá', '14020520', 'Ribeirão Preto', 'São Paulo', true);

INSERT INTO pessoa (nome, logradouro, numero, complemento, bairro, cep, cidade, estado, ativo)
values ('Izaias Azevedo', 'Rua Heitor Chiarello', '105', 'ap122', 'Jd.Irajá', '14020520', 'Ribeirão Preto', 'São Paulo', true);

INSERT INTO pessoa (nome, logradouro, numero, complemento, bairro, cep, cidade, estado, ativo)
values ('Bibou', 'Estrada de Terra Guariroba', 'SN', 'Chácara', 'Taquaritinga', '15000000', 'Taquaritinga', 'São Paulo', true);

INSERT INTO pessoa (nome, logradouro, numero, complemento, bairro, cep, cidade, estado, ativo)
values ('Marizinha', 'Estrada de Terra Guariroba', 'SN', 'Chácara', 'Taquaritinga', '15000000', 'Taquaritinga', 'São Paulo', true);