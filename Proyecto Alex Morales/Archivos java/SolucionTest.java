package ProyectoM5;

import static org.junit.Assert.*;

import org.junit.Test;
import java.util.Arrays;
import java.util.Collection;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class SolucionTest {
	
	private static String[] vec2={"hola","hola"};
	private static int[] let2= {1,0,0,0,0,0,0,1,0,0,0,1,0,0,1,0,0,0,0,0,0,0,0,0,0,0};
	
	private static String[] vec3= {"hola","hola","sde"};
	private static int[] let3= {1,0,0,0,0,0,0,1,0,0,0,1,0,0,1,0,0,0,0,0,0,0,0,0,0,0};
	
	private static String[] vec4= {"alex","hola","lugar","lago"};
	private static int[] let4= {3,0,0,0,0,0,0,0,0,0,0,3,0,0,0,0,0,0,0,0,0,0,0,0,0,0};
	
	private static String[] vec5= {"macho","loco","alex"};
	private static int[] let5= {0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,0,0,0,0,0,0,0,0,0,0,0};
	
		private String[] vec;
		private int pal;
		private int[] letras;
		
		public SolucionTest(String[] vec, int pal, int[]letras) {
			this.vec=vec;
			this.pal=pal;
			this.letras=letras;
		}

		
		@Parameters
		public Collection<Object[]> numeros(){
			return Arrays.asList(new Object[][]{
				{vec2, 2, let2},
				{vec3, 3, let3},
				{vec4, 4, let4},
				{vec5, 3, let5}
			});
		}
		@Test
		public void test() {
			int[] res = Solucion.Comprovar(vec, pal, letras);
			assertEquals(letras,res);
		}
		
	}