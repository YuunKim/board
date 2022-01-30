package com.spring.board.domain;

import lombok.Data;

@Data
public class BoardVO { // 게시글 테이블 구조 객체화
	
	private Long bno;        // 번호
	private String title;    // 제목
	private String content;  // 내용
	private String writer;   // 작성자
	private Data regdate;    // 등록일
	private Data updateDate; // 수정일
	private Long hit;        // 조회수
}
