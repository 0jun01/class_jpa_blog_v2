
-- 사용자 데이터 삽입
insert into user_tb(username, password, email, created_at) values('길동', '1234', 'a@nate.com', NOW());
insert into user_tb(username, password, email, created_at) values('둘리', '1234', 'b@nate.com', NOW());
insert into user_tb(username, password, email, created_at) values('마이콜', '1234', 'c@nate.com', NOW());

-- 게시글 데이터 삽입
insert into board_tb(title, content, user_id, created_at) values('제목1', '내용1', 1, NOW());
insert into board_tb(title, content, user_id, created_at) values('제목2', '내용2', 1, NOW());
insert into board_tb(title, content, user_id, created_at) values('제목3', '내용3', 2, NOW());
insert into board_tb(title, content, user_id, created_at) values('제목4', '내용4', 3, NOW());
