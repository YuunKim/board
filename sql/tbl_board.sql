create sequence seq_board;

create table tbl_board (
  bno number(10,0), -- 번호 
  title varchar2(200) not null, -- 제목
  content varchar2(2000) not null, -- 내용
  writer varchar2(50) not null,  -- 작성자
  regdate date default sysdate,  -- 게시물 등록일
  updatedate date default sysdate, -- 게시물 수정일
  hit number default 0 -- 조회수 (기본값 : 0 )
);

alter table tbl_board add constraint pk_board 
primary key (bno);