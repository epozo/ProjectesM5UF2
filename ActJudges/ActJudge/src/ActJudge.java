import java.util.Scanner;

/**
 * <h2>Activitat de DomJudge de Alejandro Montes de Oca </h2>
 * @see <a href="http://agora.xtec.cat/ies-sabadell/">Ies Sabadell</a>
 * @version 1-2018
 * @author amontes
 * @since 1-3-2018
 */

public class ActJudge {
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		/**
		 * Atribut de distància.
		 */
		int x = 0;
		/**
		 * Atribut de resultat (mins)
		 */
		int y = 0;
		/**
		 * Velocitat predeterminada (100km/h)
		 */
		int vel = 100;
		/**
		 * Llegir la distància que introdueix l'usuari
		 */
		x = reader.nextInt();
		/**
		 * Crida a calculo que retorna el temps en minuts (Resultat final)
		 */
		y = calculo(x, vel);
		/**
		 * Crida a cltemps
		 */		
		cltemps(y);
		
		reader.close();
	}
	
	private static void cltemps(int y) {
		int hores = 0, segons = 0, milisegons = 0;
		/** 
		 * Calcula el temps que tarda (Hores, segons i milisegons)
		 * @param hores Valor en hores del temps que tarda el cotxe
		 * @param segons Valor en segons del temps que tarda el cotxe
		 * @param milisegons Valor en milisegons del temps que tarda el cotxe
		 */
		/**
		 * Calcula el temps en segons
		 */
		segons = y * 60;
		/**
		 * Calcula el temps en hores
		 */
		hores = y / 60;
		/**
		 * Calcula el temps en milisegons
		 */
		milisegons = y * 60000;
		
		/**
		 * Mostra els diferents resultats en: hores, minuts, segons i milisegons
		 */
		System.out.println("Hores: " + hores + "h");
		System.out.println("Minuts: " + y + "m");
		System.out.println("Segons: " + segons + "s");
		System.out.println("Milisegons: " + milisegons + "ms");
	}
	
	static int calculo(int x, int vel) {
		/**
		 * Calcula el temps en minuts que és el resultat final
		 * @param x Aquest parametre ve directament desde el main (valor que introdueix l'usuari)
		 * @param vel Aquest valor és predeterminat com 100 km/h
		 * @param res És la variable on es guarda el resultat
		 * @return Resultat de multiplicar la X per 60 (per calcular pasarlo a minuts) i divit entre vel (100km/h).
		 */
		int res = 0;
		res = (60 * x)/vel;
		return res;
	}
	
	

}