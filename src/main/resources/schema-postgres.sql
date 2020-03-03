-- DROP TABLE IF EXISTS AudioClips;
-- CREATE TABLE audioclips(id serial PRIMARY KEY, name VARCHAR(100), description VARCHAR(500), link VARCHAR(255));
DROP TABLE IF EXISTS calculations;
CREATE TABLE calculations(id serial PRIMARY KEY, equation VARCHAR(100), result DECIMAL);
DROP TABLE IF EXISTS dicerolls;
CREATE TABLE "dicerolls" (id serial PRIMARY KEY, rolls VARCHAR(100), result DECIMAL);

DROP TABLE IF EXISTS "session" CASCADE;
CREATE TABLE "session" (
  id serial PRIMARY KEY,
  name VARCHAR(100),
  number INT
);

DROP TABLE IF EXISTS "npc" CASCADE;
CREATE TABLE "npc" (
  "id" SERIAL PRIMARY KEY,
  "session_id" INT REFERENCES session(id),
  "class" VARCHAR(100),
  "age" INT,
  "height_feet" INT,
  "height_inches" INT,
  "weight" INT,
  "eye_color" VARCHAR(100),
  "skin_color" VARCHAR(100),
  "hair" VARCHAR(100),
  "important" boolean,
  "notes" VARCHAR(500)
);

DROP TABLE IF EXISTS "stats" CASCADE;
CREATE TABLE "stats" (
  "id" SERIAL PRIMARY KEY,
  "npc_id" INT REFERENCES npc(id),
  "health" INT,
  "armor_class" INT,
  "speed" INT,
  "proficiency" INT,
  "strength" INT,
  "dexterity" INT,
  "constitution" INT,
  "intelligence" INT,
  "wisdom" INT,
  "charisma" INT
);

DROP TABLE IF EXISTS "proficiencies" CASCADE;
CREATE TABLE "proficiencies" (
  "id" SERIAL PRIMARY KEY,
  "npc_id" INT REFERENCES npc(id),
  "strength" boolean,
  "dexterity" boolean,
  "constitution" boolean,
  "intelligence" boolean,
  "wisdom" boolean,
  "charisma" boolean,
  "acrobatics" boolean,
  "animal_handling" boolean,
  "arcana" boolean,
  "athletics" boolean,
  "deception" boolean,
  "history" boolean,
  "insight" boolean,
  "intimidation" boolean,
  "investigation" boolean,
  "medicine" boolean,
  "nature" boolean,
  "perception" boolean,
  "performance" boolean,
  "persuasion" boolean,
  "religion" boolean,
  "sleight_of_hand" boolean,
  "stealth" boolean,
  "survival" boolean
);

DROP TABLE IF EXISTS "spell" CASCADE;
CREATE TABLE "spell" (
  "id" SERIAL PRIMARY KEY,
  "name" VARCHAR(100),
  "damage" VARCHAR(100),
  "description" VARCHAR(500)
);

DROP TABLE IF EXISTS "npc_spell_junction" CASCADE;
CREATE TABLE "npc_spell_junction" (
  "id" SERIAL PRIMARY KEY,
  "npc_id" INT REFERENCES npc(id),
  "spell_id" INT REFERENCES spell(id)
);