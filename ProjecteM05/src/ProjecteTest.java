import static org.junit.Assert.*;

import org.junit.Test;

public class ProjecteTest {

	@Test
	public void testAplicardescompte() {
		int res = Projecte.aplicardescompte(30, 25);
		assertEquals(22,  res);
		//fail("Not yet implemented");
	}

	@Test
	public void testCalcularpreu() {
		int res = Projecte.calcularpreu(25, 5);
		assertEquals(100,  res);
		//fail("Not yet implemented");
	}

	@Test
	public void testSumardies() {
		int res = Projecte.sumardies(25,5,0);
		assertEquals(30,  res);
		//fail("Not yet implemented");
	}

}
