CREATE TABLE tb_usuario(
    ID_usuario INT AUTO_INCREMENT PRIMARY KEY,
    NM_usuario VARCHAR(255),
    EM_usuario VARCHAR(255) UNIQUE,
    TL_usuario VARCHAR(255) UNIQUE
);