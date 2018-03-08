package m5projecte;

import static org.junit.Assert.*;

import org.junit.Test;

public class projecteTest {

	@Test
	public void testContarAccents() {
		int res = projecte.contarAccents("Hola, bon día! S'ha decit ja?");
		assertEquals(1, res);
		//fail("Not yet implemented");
	}

	@Test
	public void testContarSignes() {
		int res = projecte.contarSignes("Hola, bon día! S'ha decit ja?");
		assertEquals(9, res);
		//fail("Not yet implemented");
	}

	@Test
	public void testContarParaules() {
		int res = projecte.contarParaules("Hola, bon día! S'ha decit ja?");
		assertEquals(6, res);
		//fail("Not yet implemented");
	}

	@Test
	public void testContarConsonants() {
		int res = projecte.contarConsonants("Hola, bon día! S'ha decit ja?");
		assertEquals(11, res);
		//fail("Not yet implemented");
	}

	@Test
	public void testContarVocals() {
		int res = projecte.contarVocals("Hola, bon día! S'ha decit ja?");
		assertEquals(9, res);
		//fail("Not yet implemented");
	}

}
