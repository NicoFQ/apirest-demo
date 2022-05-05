DROP TABLE IF EXISTS tarifas;

CREATE TABLE tarifas (

    id IDENTITY NOT NULL PRIMARY KEY,
    id_cadena INTEGER NOT NULL,
    fecha_inicio DATETIME NOT NULL,
    fecha_fin DATETIME NOT NULL,
    id_producto INTEGER NOT NULL,
    prioridad INTEGER NOT NULL,
    precio DECIMAL(6,2) NOT NULL,
    moneda CHAR(4) NOT NULL

);