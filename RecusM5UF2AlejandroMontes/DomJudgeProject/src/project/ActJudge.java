package project;

import java.util.Scanner;
/**
 * 
 * Projecte de recuperació - M05 UF2
 * 
 * @author Alejandro Montes de Oca
 * @version 2.0
 *
 */
public class ActJudge {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		
		String cadena = reader.nextLine();
		
		int piedras = 0;
		
		piedras = contarPiedras(cadena);
		
		System.out.print(piedras);
		
		reader.close();
	}
	/**
	 * Calcula el número de pedres que n'hi han al String introduït per l'usuari
	 * @param cadena El String introduït per l'usuari
	 * @return piedras
	 * 		
	 */

	public static int contarPiedras(String cadena) {
		int piedras = 0;
		int max = cadena.length();
		int n = 0;
			do {
				if(max <= 2) {
					if(cadena.charAt(n) == '<' && cadena.charAt(n+1) == '>'){ 
						piedras++;
						n++;
					}
				}else if(n>0 && n<max-1) {
					if(cadena.charAt(n) == '<' && cadena.charAt(n+1) == '>'){
						piedras++;
						n++;
					}else if(cadena.charAt(n) == '>' && cadena.charAt(n-1) == '<') {
						piedras++;
						n++;
					}
					
				}else if(n == 0 && max > 2){
					if(cadena.charAt(n) == '<' && cadena.charAt(n+1) == '>') { 
						piedras++;
						n++;
					}
				}else if (n == max) {
					if(cadena.charAt(n) == '>' && cadena.charAt(n - 1) == '<') { 
						piedras++;
						n++;
					}
				}
				
				n++;
			}while(n<max);
		
		return piedras;
	}
	
	
	

}