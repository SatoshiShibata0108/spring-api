CREATE TABLE item(
    id serial NOT NULL,
    name TEXT,
    price integer,
    img_path TEXT,
    CONSTRAINT "PK" PRIMARY KEY (id)
);


INSERT INTO item(name, price, img_path) VALUES('りんご', 100,  'apple.jpg');
INSERT INTO item(name, price, img_path) VALUES('ばなな', 200, 'banana.jpg');
INSERT INTO item(name, price, img_path) VALUES('みかん', 300, 'mikan.jpg');
INSERT INTO item(name, price, img_path) VALUES('ぶどう', 400, 'glape.jpg');