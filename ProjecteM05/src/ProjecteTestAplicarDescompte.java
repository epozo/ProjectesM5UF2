

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;
	
@RunWith(Parameterized.class)
public class ProjecteTestAplicarDescompte {
	
	@Test
	public void testSuma() {
		int res = Projecte.aplicardescompte(10, 20);
		assertEquals(30,  res);
	//	fail("Not yet implemented");
	}

	}
