package ProyectoM5;

import java.util.Scanner;

/**
 * 
 * @author Alex <alexmoralescasado@gmail.com>
 * @version 1.0
 * @since 22-2-2018
 */

public class SolucionDoc {

	static Scanner reader = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int prov, pal,x=0;
		int [] let = new int[26];
		prov=reader.nextInt();
		/**
		 * Inicia les variables prov, pal i x
		 * @param prov Llegeix els casos de prova
		 * @param pal Llegeix les paraules a introduir
		 * @param x Un contador per llegir les paraules
		 * @param let Un vector de 26 posicions per representar l'abecedari
		 * <p>
		 * La variable let s'utilitza per guardar les lletres que es repeteixen i 
		 * l'index representa cada lletra. Es a dir, si a la posició 0 hi ha un 1
		 * significa que es repeteix la lletra a, si a la posició 4 hi ha un 1 es repeteix la e etc.
		 * </p>
		 */
		do {
			let=Limpiar(let);
			/**
			 * La funció Limpiar, com el seu nom indica, posa tot el vector del abecedari a 0 per tornar-lo a utilitzar
			 * @see let Vector abecedari
			 */
			pal=reader.nextInt();
			/**
			 * Ara llegim el numero de paraules
			 * @see pal
			 */
			String [] vec= new String[pal];
			reader.nextLine();
			/**
			 * Gràcies a que sabem el número de paraules, podem iniciar un vector de Strings
			 * @see vec Vector de Strings on guardem les paraules
			 */
			while(x<pal) {
				vec[x]=reader.nextLine();
				x++;
			}
			/**
			 * Ara llegim les paraules
			 */
			let=Comprovar(vec, pal, let);
			/**
			 * Aqui comprobem tots els parametres per veure quines lletres son iguals
			 * @see let
			 */
			Print(let, pal);
			prov--;
			/**
			 * Un cop acabat cada cas de proves, es resta 1 a la variable @param prov
			 * 
			 */
			x=0;
		}while(prov>0);
	}
	public static int[] Limpiar (int[] vec) {
		int x=0;
		while(x<26) {
			vec[x]=0;
			x++;
		}
		/**
		 * Funció que posa a 0 tot el vector del abecedari
		 * @see let
		 * @return Vector vec a 0
		 */
		return vec;
	}
	public static int[] Comprovar(String [] vec, int pal, int[] letras) {
		int x=0, y=0, z=0;
		while(y<vec[x].length()) {
			while(z<vec[x+1].length()) {
				if(vec[x].charAt(y)==vec[x+1].charAt(z)) {
					letras[(vec[x].charAt(y)-97)]=1;
				}
				z++;
			}
			y++;
			z=0;
		}
		x=2;
		y=0;
		z=0;
		while (x<pal) {
			while(z<26) {
				if(letras[z]>0){
					y=0;
					while(y<vec[x].length()) {
						if(vec[x].charAt(y)==(char)(z+97)) {
							letras[z]++;
						}
						y++;
					}
					
				}
				z++;
			}
			z=0;
			x++;
		}
		/**
		 * Funció que comprova les paraules i busca les lletres que es repeteixen en totes les paraules
		 * @param vec Vector de Strings on es troben les paraules
		 * @param pal Numero de paraules que hi ha en el vector vec, s'utilitza com a límit en els bucles
		 * @param letras Vector abecedari on cada cop que es troba una lletra repetida es suma 1
		 * @return Vector letras modificat amb les lletres repetides
		 */
		
		return letras;
	}
	public static void Print(int[] let, int pal) {
		int x=0;
		while (x<26) {
			if(let[x]>=(pal-1)) {
				System.out.print((char)(x+97));
			}
			x++;
		}
		/**
		 * Funció que comprova en quin index de la variable letras hi ha com a mínim un número igual a el número de paraules introduides menys 
		 * 1, quan troba una posició que compleix la condició, agafa el index i li suma 97, amb això aconseguim un caracter de la taula
		 * ASCII
		 * @return Les lletres repetides
		 */
		System.out.println();
	}

}
