DROP TABLE IF EXISTS shop.sweets;
CREATE TABLE shop.sweets
(
    id INT AUTO_INCREMENT,
    sweets_name VARCHAR(50) NOT NULL,
    price INT NOT NULL,
    PRIMARY KEY (id)
);

INSERT INTO shop.sweets ( sweets_name, price ) VALUES("プリン", 250);
INSERT INTO shop.sweets ( sweets_name, price ) VALUES("ケーキ", 300);
INSERT INTO shop.sweets ( sweets_name, price ) VALUES("シュークリーム", 150);