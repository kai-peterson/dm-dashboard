-- DROP TABLE IF EXISTS AudioClips;
CREATE TABLE audioclips(id serial PRIMARY KEY, name VARCHAR(100), description VARCHAR(500), link VARCHAR(255));
CREATE TABLE calculations(id serial PRIMARY KEY, equation VARCHAR(100), result DECIMAL);
CREATE TABLE dicerolls(id serial PRIMARY KEY, rolls VARCHAR(100), result DECIMAL)