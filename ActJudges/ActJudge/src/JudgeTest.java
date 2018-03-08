import static org.junit.Assert.*;

import org.junit.Test;

import java.util.Arrays;
import java.util.Collection;

import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;


public class JudgeTest {

	/*@Test
	public void test() {
		fail("Not yet implemented");
	}
	*/
	/* @Test
	public void test1() {
		int res = ActJudge.calculo(80, 100);
		assertEquals(48,  res);
	//	fail("Not yet implemented");
	} */
	
	@RunWith(Parameterized.class)
	public static class DomJudgeTest {

		private int num1;
		private int num2;
		private int resul;
		
		public DomJudgeTest (int num1, int num2, int resul) {
			this.num1 = num1;
			this.num2 = num2;
			this.resul = resul;
		}
		
		@Parameters
		public static Collection<Object[]> numeros() {
			return Arrays.asList(new Object[][] {
				{80, 100, 48},
				{150, 100, 90},
				{500, 100, 300},
				{10, 100, 6},
				{90000, 100, 54000},
				{153, 100, 91},
				{2, 100, 1},
				{86, 100, 51},
				{10000353, 100, 6000211},
				{203, 100, 121},
			});
			
		}
		@Test
		public void testSuma() {
			int res = ActJudge.calculo(num1,  num2);
			assertEquals(resul,  res);
		}
	}



}
