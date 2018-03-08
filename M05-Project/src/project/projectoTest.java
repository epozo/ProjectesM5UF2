package projectom5;

import static org.junit.Assert.*;

import org.junit.Test;

public class projectoTest {

	@Test
	public void testCalcularminutos() {
		int res=projecto.calcularminutos(12,123,345);
		assertEquals("ha fallado el metodo",480,res);
		//fail("Not yet implemented");
	}

	@Test
	public void testLeerhoras() {
		//fail("Not yet implemented");
		int res=projecto.leerhoras(12);
		assertEquals("ha fallado el metodo",720,res);
	}

	@Test
	public void testLeerdia() {
		//fail("Not yet implemented");
		int res=projecto.leerdia(12);
		assertEquals("ha fallado el metodo",17280,res);
	}

}
