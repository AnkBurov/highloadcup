DROP TABLE IF EXISTS USER;
DROP TABLE IF EXISTS LOCATION;
DROP TABLE IF EXISTS VISIT;


CREATE TABLE USER (
  ID         INTEGER   NOT NULL PRIMARY KEY,
  EMAIL      TEXT(100) NOT NULL,
  FIRST_NAME TEXT(50)  NOT NULL,
  LAST_NAME  TEXT(50)  NOT NULL,
  GENDER     TEXT(1)   NOT NULL,
  BIRTH_DATE TIMESTAMP NOT NULL
);

CREATE UNIQUE INDEX UQ_USER_EMAIL
  ON USER (EMAIL);

CREATE TABLE LOCATION (
  ID       INTEGER  NOT NULL PRIMARY KEY,
  PLACE    TEXT     NOT NULL,
  COUNTRY  TEXT(50) NOT NULL,
  CITY     TEXT(50) NOT NULL,
  DISTANCE INTEGER  NOT NULL
);

CREATE TABLE VISIT (
  ID          INTEGER   NOT NULL PRIMARY KEY,
  LOCATION_ID INTEGER   NOT NULL,
  USER_ID     INTEGER   NOT NULL,
  VISITED_AT  TIMESTAMP NOT NULL,
  MARK        INTEGER   NOT NULL,
  FOREIGN KEY (LOCATION_ID) REFERENCES LOCATION (ID),
  FOREIGN KEY (USER_ID) REFERENCES USER (ID)
);

CREATE INDEX IX_VISIT_LOCATION
  ON VISIT (LOCATION_ID);

CREATE INDEX IX_VISIT_USER
  ON VISIT (USER_ID);