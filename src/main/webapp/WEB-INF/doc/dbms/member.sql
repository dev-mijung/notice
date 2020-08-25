DROP TABLE member;
CREATE TABLE member (
  memberno      NUMBER(6) NOT NULL, 
  id            VARCHAR(20)   NOT NULL UNIQUE, 
  passwd        VARCHAR(60)   NOT NULL, 
  mname         VARCHAR(20)   NOT NULL,  
  PRIMARY KEY (memberno)                     
);

DROP SEQUENCE member_seq;
CREATE SEQUENCE member_seq
  START WITH 1              
  INCREMENT BY 1          
  MAXVALUE 9999999999 
  CACHE 2                       
  NOCYCLE;                    

--  등록
INSERT INTO member(memberno, id, passwd, mname) 
VALUES(member_seq.nextval, 'user1', '1234', '설현');

INSERT INTO member(memberno, id, passwd, mname) 
VALUES(member_seq.nextval, 'user2', '1234', '고은');

INSERT INTO member(memberno, id, passwd, mname) 
VALUES(member_seq.nextval, 'user3', '1234', '태연');

INSERT INTO member(memberno, id, passwd, mname) 
VALUES(member_seq.nextval, 'user4', '1234', '소진');

-- 목록
SELECT memberno, id, passwd, mname
FROM member;

-- 조회
SELECT memberno, id, passwd, mname
FROM member
WHERE memberno = 1;

-- 로그인
SELECT COUNT(memberno) as cnt
FROM member
WHERE id='user1' AND passwd='1234';


SELECT memberno, id, passwd, mname
FROM member
WHERE id = 'user2';

commit;
