CREATE TABLE item(
    id serial NOT NULL,
    name TEXT,
    price integer,
    img_path TEXT,
    CONSTRAINT "PK" PRIMARY KEY (id)
);


INSERT INTO item(name, price, img_path) VALUES('Rakus', 100, 'test.jpg');
INSERT INTO item(name, price, img_path) VALUES('アドベント', 200, 'test.jpg');
INSERT INTO item(name, price, img_path) VALUES('カレンダー', 300, 'test.jpg');
