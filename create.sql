DROP TABLE IF EXISTS hotelTabela;
CREATE TABLE IF NOT EXISTS hotelTabela
(
    id int auto_increment primary key,
    nomeFilial VARCHAR(64),
    rua VARCHAR(50),
    numero int,
    cidade VARCHAR(32),
    estado VARCHAR(32),
    hotel5estrelas0false1true BIT,
    numeroDeEstrelas int
);


//pode ser um TINYINT no lugar do BIT



