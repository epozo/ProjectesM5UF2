package project;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

import project.ActJudge;

class ActJudgeProva {

	@Test
	public void test1() {
		int res = ActJudge.contarPiedras("<<<><><<");
		assertEquals(2, res);
		
	}
	
	@Test
	public void test2() {
		int res = ActJudge.contarPiedras("<<<><><<><<<>><<<>>>>><<>><<>><><>");
		assertEquals(9, res);
		
	}
	
	@Test
	public void test3() {
		int res = ActJudge.contarPiedras("<<<><><<>>>>>>>>>>>>>>>>>>>>><>>><><>");
		assertEquals(6, res);
		
	}
	
	@Test
	public void test4() {
		int res = ActJudge.contarPiedras("<>");
		assertEquals(6, res);
		
	}
	
	@Test
	public void test5() {
		int res = ActJudge.contarPiedras("<><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><>");
		assertEquals(6, res);
		
	}

}










