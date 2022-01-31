package com.spring.board.mapper;

import com.spring.board.domain.BoardVO;

public interface boardMapper { // CRUD쿼리 메서드 리스트
	
	// - tbl_board테이블안의 데이터를 입력 = C
	// "매개변수"로 테이블에 입력할 "데이터(= 제목, 작성자, 내용)"를 넘겨준다. 
	// 1. bno(번호) 값을 알 필요 없는 경우
	public void insert(BoardVO board);
	
	// 2. bno(번호) 값을 알아야 하는 경우
	public void insertSelectKey(BoardVO board);
	
	// - tbl_board테이블안의 데이터 한 건 조회 = R
	// "매개변수"로 게시글 번호를 넘겨주면(요청한 데이터를 찾아야 하니깐)
	//  -> 한 건의 데이터를 리턴해주는 메서드
	public BoardVO read(Long bno);
	
	// - tbl_board테이블안의 모든 데이터 조회 = R
	
	// - tbl_board테이블안의 데이터 수정 = U
	
	// - tbl_board테이블안의 데이터 삭제 = D
	

}
