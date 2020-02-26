-- DROP TABLE IF EXISTS AudioClips;
CREATE TABLE audioclips(id serial PRIMARY KEY, link VARCHAR(255), description VARCHAR(500));
CREATE TABLE dicerolls(id serial PRIMARY KEY, equation VARCHAR(100), result DECIMAL);