package project;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class ElProfesorV2Test4J {
	private int filaP;
	private int colP;
	private int filaM;
	private int colM;
	private int movNum;
	private String Resul;
	private int[] vector;
	private char[][] matt;
	
	
	private static int[] mov1 = new int[] {0, 0, 2, 0, 3, 0};
	private static char[][] mat1 = new char[][] {{'C', 'C', 'C', 'C', 'C'}, {'C', 'O', 'A', 'C', 'C'}, {'C', 'C', 'C', 'C', 'C'}, {'C', 'C', 'O', 'B', 'C'}, {'C', 'C', 'C', 'C', 'C'}};
	private static int[] mov2 = new int[] {2, 2, 2, 0, 1, 3, 0, 0, 3, 0, 0, 2};
	private static char[][] mat2 = new char[][] 
			{{'C', 'O', 'A', 'C', 'C', 'C'}, 
		 	 {'C', 'C', 'C', 'O', 'C', 'O'}, 
		 	 {'C', 'C', 'C', 'C', 'C', 'B'}, 
		 	 {'C', 'C', 'C', 'C', 'C', 'C'}, 
		 	 {'C', 'C', 'C', 'C', 'C', 'C'}, 
		 	 {'C', 'C', 'C', 'C', 'C', 'C'}};
	private static int[] mov3 = new int[] {2, 0, 1, 3, 3, 3, 3, 1, 0, 0};
	private static char[][] mat3 = new char[][] 
			{{'C','C','C'}, 
			 {'C','C','O'}, 
			 {'C','C','A'},
			 {'O','C','C'},
			 {'C','O','B'}};
	private static int[] mov4 = new int[] {1, 2, 3, 0, 0, 0, 3, 3, 3, 1, 1, 3};
	private static char[][] mat4 = new char[][] 
			 {{'C','C','C'},
			  {'O','O','C'},
			  {'B','A','C'},
			  {'O','C','C'}};
	private static int[] mov5 = new int[] {3, 3, 1, 1, 1, 0, 0, 0, 0, 2, 2, 2, 0, 2, 2, 1, 1, 1, 1, 1, 1, 3, 3, 3, 0, 0, 0, 0, 0, 0, 0, 0, 0, 2, 2, 2};
	private static char[][] mat5 = new char[][] 
			{{'C','C','C','C','C','C','A','C','C'},
			 {'C','C','A','O','C','C','O','C','C'},
			 {'C','C','C','C','C','C','C','C','C'},
			 {'O','C','C','C','C','O','C','C','O'},
			 {'A','C','C','C','C','A','C','C','B'}};
	private static int[] mov6 = new int[] {1,2,2,3,0,3,2,0,0,0,3,3,3,};
	private static char[][] mat6 = new char[][]
			{{'C','B','O','C'},
			 {'C','C','C','C'},
			 {'O','C','A','C'},
			 {'A','O','C','C'},};
	
	
	public ElProfesorV2Test4J(int filaM, int colM, int[] mav, char[][] mot, int filaP, int colP, int movNum, String Resul) {
		this.filaM = filaM;
		this.colM = colM;
		this.vector = mav;
		this.matt = mot;
		this.filaP = filaP;
		this.colP = colP;
		this.movNum = movNum;
		this.Resul = Resul;
	}
	
	@Parameters
	public static Collection<Object[]> numeros(){
		return Arrays.asList(new Object[][] {
			{5, 5, mov1, mat1, 2, 0, 6, "4 2 Si"},
			{6, 6, mov2, mat2, 2, 0, 12, "9 1 Si"},
			{5, 3, mov3, mat3, 0, 2, 10, "5 3 Si"},
			{4, 3, mov4, mat4, 0, 0, 12, "6 4 No"},
			{5, 9, mov5, mat5, 3, 3, 36, "28 8 No"},
			{4, 4, mov6, mat6, 1, 0, 13, "9 3 Si"}
		});
	}
	
	
	
	@Test
	public void testCurro() {
		String Resull = ElProfesorV2.curro(filaM, colM, vector, matt, filaP, colP, movNum);
		assertEquals("No igual", Resul, Resull);
		//fail("Not yet implemented");
		
	}
}
