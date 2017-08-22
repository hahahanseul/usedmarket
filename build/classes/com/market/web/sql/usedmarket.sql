CREATE SEQUENCE item_seq
START WITH 1000
INCREMENT BY 1
NOCACHE
NOCYCLE;

CREATE TABLE Item (
	item_seq NUMBER,
	title VARCHAR2(30),
	writer VARCHAR2(15),
	photo VARCHAR2(15),
	content VARCHAR2(50),
	regdate	DATE,
	PRIMARY KEY(item_seq)
);

SELECT * FROM Item;
DROP TABLE Item;

INSERT INTO Item(item_seq,title, writer, photo, content, regdate)
VALUES (item_seq.nextval, '빨간구두', '안데르센', 'item.jpg', '춤을 멈출 수가 없는 빨간구두~',SYSDATE);

