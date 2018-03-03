import java.util.Scanner;

public class Projecte {
	static Scanner reader = new Scanner(System.in);
	/**
	 * <h2>clase Main, se utiliza para calcular y mostrar el precio que tienes que pagar en tu gumnasio a traves de los dias que has ido, dependiendo de si has ido dias entre semana o sabados. </h2>
	 * @version 2-2018
	 * @author Sergi Cano
	 * @since 2-3-2018
	 */


	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Dias Entre semana
		/**
		 * Atributo dias entre semana
		 */

		int diesn = 0;
		//Dias Sabados
		/**
		 * Atributo Sabados
		 */

		int diess = 0;
		// Suma Dias
		/**
		 * Atributo Sumar los dias
		 */

		int sumardies = 0;
		// Aplicar descuento
		/**
		 * Atributo Aplicar descuento
		 */

		int descompte = 0;
		// Sumar precio
		/**
		 * Atributo Sumar precio final
		 */

		int preufinal = 0;
		

		diesn = demanardiesnormals(diesn);
		diess = demanardissabte(diess);
		sumardies = sumardies(sumardies, diesn, diess);
		diesn = aplicardescompte(sumardies, diesn);
		preufinal = calcularpreu(diesn, diess);
		dirpreu(preufinal);

	}

	// Aplicar descuento
	
	/**
	 * Aplica un descuento segun los dias que ha ido.
	 * @param sumardies Sumar los dias.
	 * @param diesn Sabados.
	 * @since 2-3-2018
	 */
	public static int aplicardescompte(int sumardies, int diesn) {
		// TODO Auto-generated method stub

		
		int gratis = 0;

		if (sumardies > 0 && sumardies <= 30) {
			gratis = 3;
		} else if (sumardies > 30 && sumardies <= 60) {
			gratis = 6;
		} else if (sumardies > 30 && sumardies <= 90) {
			gratis = 9;
		} else if (sumardies > 90 && sumardies <= 120) {
			gratis = 12;
		} else if (sumardies > 120 && sumardies <= 150) {
			gratis = 15;
		} else if (sumardies > 150 && sumardies <= 180) {
			gratis = 18;
		} else if (sumardies > 180 && sumardies <= 210) {
			gratis = 21;
		} else if (sumardies > 210 && sumardies <= 230) {
			gratis = 23;
		} else if (sumardies > 230 && sumardies <= 250) {
			gratis = 25;
		} else if (sumardies > 250 && sumardies <= 280) {
			gratis = 28;
		} else if (sumardies > 280 && sumardies <= 310) {
			gratis = 31;
		}
		diesn = diesn - gratis;

		return diesn;


		

	}

	// Dice el precio
	/**
	 * Dice el precio total a pagar.
	 * @param preufinal Sumar precio final.
	 * @since 2-3-2018
	 */
	public static void dirpreu(int preufinal) {

		System.out.println(preufinal);
	}
	// TODO Auto-generated method stub
	// Calcular precio
	/**
	 * Calcula el precio a pagar dependiendo de los dias que has ido.
	 * @param diess Sumar los dias.
	 * @param diesn Sabados.
	 * @since 2-3-2018
	 */
	public static int calcularpreu(int diess, int diesn) {

		int preudiesnormal = 0;
		int preudiesdissabte = 0;
		int preufinal = 0;
		preudiesnormal = diess * 3;
		preudiesdissabte = diesn * 5;
		preufinal = preudiesnormal + preudiesdissabte;

		return preufinal;

	}
	// Sumar dias
	/**
	 * Suma los dias totales para saber la cantidad exacta de dias que has ido, independientemente de si es entre semana o sabado.
	 * @param diess Sumar los dias.
	 * @param diesn Sabados.
	 * @param sumardies Sumar los dias.
	 * @since 2-3-2018
	 */
	public static int sumardies(int diess, int diesn, int sumardies) {


		sumardies = diess + diesn;
		return sumardies;
	}

	// Pide los sabados
	/**
	 * Pide el numero total de sabados que has ido al gimnasio.
	 * @param diess Sumar los dias.
	 * @since 2-3-2018
	 */
	public static int demanardissabte(int diess) {

		
		diess = reader.nextInt();

		return diess;
	}
	// Pide los dias entre semana
	/**
	 * Pide el numero total de dias entre semana que has ido al gimnasio.
	 * @param diesn Sabados.
	 * @since 2-3-2018
	 */
	public static int demanardiesnormals(int diesn) {


		
		diesn = reader.nextInt();

		return diesn;

	}

}
