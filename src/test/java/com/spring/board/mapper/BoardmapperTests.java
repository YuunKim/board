package com.spring.board.mapper;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.spring.board.domain.BoardVO;

import lombok.extern.log4j.Log4j;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml")
@Log4j
public class BoardmapperTests {
	
	@Autowired
	private boardMapper mapper;
	
	@Test
	public void testInsert() {
		
		BoardVO board = new BoardVO();
		board.setTitle("insert title test");
		board.setContent("insert content");
		board.setWriter("tester");
		
		mapper.insert(board);
		
		log.info(board);

	}
	
	@Test
	public void testInsertSelectKey() {
		BoardVO board = new BoardVO();
		board.setTitle("insertSelectKey title test2");
		board.setContent("AFTER");
		board.setWriter("tester");
		
		mapper.insertSelectKey(board);
		
		log.info(board);
	}
	
	@Test
	public void testRead() {
		BoardVO board = mapper.read(1L);
		
		log.info(board);
	}
	
}
