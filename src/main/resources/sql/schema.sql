DROP TABLE IF EXISTS konto;

CREATE TABLE IF NOT EXISTS konto (
  id int auto_increment PRIMARY KEY,
  kontonr                INTEGER      NOT NULL,
  navn                   VARCHAR(60) NOT NULL,
  adresse                VARCHAR(60),
  postnr                 VARCHAR(10),
  rentesats              INTEGER,
  saldo                  NUMERIC
);

CREATE TABLE IF NOT EXISTS transaksjon (
  id int auto_increment PRIMARY KEY,
  konto_id VARCHAR(60),
  dato DATE,
  belop NUMERIC
);

insert into konto values (1,111111111,'Test testesen','Testveien 10','5008',2,1000);