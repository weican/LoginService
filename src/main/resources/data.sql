CREATE TABLE IF NOT EXISTS EMPLOYEE  (
  USERNAME varchar(50) NOT NULL,
  EMAIL varchar(100) NOT NULL,
  PASSWORD varchar(65) NOT NULL,
  ROLE varchar(15) NOT NULL,
  ENABLED boolean NOT NULL,
  LAST_PASSWORD_RESET_DATE datetime NOT NULL
  );


INSERT INTO EMPLOYEE VALUES ('john.wang', 'john@demo.com','$2a$10$5e3dB36HeRcozRgp8xQfw.tfD3Qsut8xu/NT9g/DSpVKg9Kzuitrq','USER', true, now());