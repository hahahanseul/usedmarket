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

SELECT COUNT(*) AS count FROM Item;

SELECT * FROM Item;
DROP TABLE Item;

INSERT INTO Item(item_seq,title, writer, photo, content, regdate)
VALUES (item_seq.nextval, '빨간구두', '안데르센', 'item.jpg', '춤을 멈출 수가 없는 빨간구두~',SYSDATE);

INSERT INTO Item(item_seq,title, writer, photo, content, regdate)
VALUES (item_seq.nextval, '블러셔', '공듀님', 'item.jpg', '생기넘치는 볼을 만들어봐',SYSDATE);

INSERT INTO Item(item_seq,title, writer, photo, content, regdate)
VALUES (item_seq.nextval, '넥타이', '아저씨', 'item.jpg', '목을 갑갑하게 조여주는 넥타이~',SYSDATE);

INSERT INTO Item(item_seq,title, writer, photo, content, regdate)
VALUES (item_seq.nextval, '스케이트', '김연아', 'item.jpg', '이제 필요없어서 싸게 내놓습니다.',SYSDATE);

INSERT INTO Item(item_seq,title, writer, photo, content, regdate)
VALUES (item_seq.nextval, '글러브', '류현진', 'item.jpg', '미국물먹은 글러브입니다.',SYSDATE);

INSERT INTO Item(item_seq,title, writer, photo, content, regdate)
VALUES (item_seq.nextval, '수분크림', '김건성', 'item.jpg', '촉촉한 피부를 만드세요',SYSDATE);

INSERT INTO Item(item_seq,title, writer, photo, content, regdate)
VALUES (item_seq.nextval, '아보카도', '엘레나킴', 'item.jpg', '미용에 좋은 아보카도 드세여',SYSDATE);

INSERT INTO Item(item_seq,title, writer, photo, content, regdate)
VALUES (item_seq.nextval, '부채', '이우기', 'item.jpg', '시원한 부채',SYSDATE);

INSERT INTO Item(item_seq,title, writer, photo, content, regdate)
VALUES (item_seq.nextval, '전자촛불', '노동자', 'item.jpg', '당분간 쓸 일 없어 내놓아요.',SYSDATE);

INSERT INTO Item(item_seq,title, writer, photo, content, regdate)
VALUES (item_seq.nextval, '글러브', '류현진', 'item.jpg', '미국물먹은 글러브입니다.',SYSDATE);

INSERT INTO Item(item_seq,title, writer, photo, content, regdate)
VALUES (item_seq.nextval, '수분크림', '김건성', 'item.jpg', '촉촉한 피부를 만드세요',SYSDATE);

INSERT INTO Item(item_seq,title, writer, photo, content, regdate)
VALUES (item_seq.nextval, '아보카도', '엘레나킴', 'item.jpg', '미용에 좋은 아보카도 드세여',SYSDATE);

INSERT INTO Item(item_seq,title, writer, photo, content, regdate)
VALUES (item_seq.nextval, '부채', '이우기', 'item.jpg', '시원한 부채',SYSDATE);

INSERT INTO Item(item_seq,title, writer, photo, content, regdate)
VALUES (item_seq.nextval, '전자촛불', '노동자', 'item.jpg', '당분간 쓸 일 없어 내놓아요.',SYSDATE);

INSERT INTO Item(item_seq,title, writer, photo, content, regdate)
VALUES (item_seq.nextval, '소파', '김욕창', 'item.jpg', '일어나기 싫은 소파예요',SYSDATE);

INSERT INTO Item(item_seq,title, writer, photo, content, regdate)
VALUES (item_seq.nextval, 'TV', '드라마퀸', 'item.jpg', '드라마는 큰 티비로 봐야 제맛이죠',SYSDATE);


SELECT t2.*
FROM(SELECT rownum rnum, t.*
FROM(SELECT i.* FROM ITEM i ORDER BY rownum desc) t)t2
WHERE t2.rnum between 6 and 10;






SELECT i.* FROM ITEM i ORDER BY rownum desc;












