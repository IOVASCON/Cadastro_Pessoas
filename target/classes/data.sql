CREATE TABLE IF NOT EXISTS pessoa (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    nome VARCHAR(255),
    sobrenome VARCHAR(255)
);

INSERT INTO pessoa (nome, sobrenome) VALUES ('João', 'Silva');
INSERT INTO pessoa (nome, sobrenome) VALUES ('Maria', 'Fernandes');
