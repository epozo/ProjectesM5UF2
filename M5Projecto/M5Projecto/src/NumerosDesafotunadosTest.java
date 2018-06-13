import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

public class NumerosDesafotunadosTest {

	@Test
	public void testCrearlista() {

		ArrayList<Integer> listtest = new ArrayList<Integer>();
		listtest.add(1);listtest.add(2);listtest.add(3);listtest.add(4);
		
		assertEquals(listtest,NumerosDesafotunados.crearlista(4));
	}

	@Test
	public void testEliminar() {
		
		ArrayList<Integer> listtest = new ArrayList<Integer>();
		listtest.add(2);listtest.add(4);
		
		assertEquals(listtest,NumerosDesafotunados.eliminar(4));

		
	}

	@Test
	public void testMain() {
		testCrearlista();

	}

}

