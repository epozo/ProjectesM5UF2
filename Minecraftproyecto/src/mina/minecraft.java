package mina;

import java.util.Scanner;
/**
 * *
 * @author Jose Ramon Sendin
 *
 */

/**
 * @main En el main se encuentra el bucle for, que nos permitira introducir el numero de casos que tiene,que seran las veces que se ejecutara el programa.
 * 
 *
 */

public class minecraft{
	static Scanner teclado = new Scanner(System.in);
	public static void main(String[] args) {
		int resultado= 0;
		int casos=0;
		casos = teclado.nextInt();
		for (int i = 0; i < casos; i++) {
		String mina;
		mina= teclado.nextLine();
		
		
		resultado=tunel(mina);
		}
		/**
		 * He puesto variables fijas para detectar los caracteres que estamos buscando de manera mas facil
		 */
	}
    private static final char TANCAT = '}'; 
    private static final char OBERT = '{'; 
	/**
	 * 
	 * @param mina nombre de tipo String
	 * @return diamonds, nos dara la salida, que son los numeros de diamantes que hay en la mina
	 */
    public static int tunel(String mina) 
    { 
    	/**
    	 * AnteriorObert, es un puntero para ir contando los caracteres que nos interesan
    	 * longitud, utilizamos la funciona lenght, que nos cuenta automaticamente la longitud de caracteres
    	 * La funciona toChararray nos sirve  para copiar los caracteres en una matriz de caracteres
    	 */
        if (null == mina) return 0; 
        
        int diamants = 0; 
        //Controlem l'ultim caracter obert que ha trobat
        int anteriorObert = -1; 
        final int longitud = mina.length(); 
        final char[] arrayMina = mina.toCharArray(); 
 
       
     /**
      * En este trozo de codigo pasamos caracter a caracter gracias a los punteros, y los va comparando, hasta que si coincide Un Obert y despues un cerrado diamantes ++
      */
 
        //Pasem per la mina caracter a caracter. 
        for (int posActual = 0; posActual < longitud; posActual++) { 
            if (arrayMina[posActual] == TANCAT) { 
                if (anteriorObert >= 0) { 
                    if (arrayMina[anteriorObert] == OBERT) { 
                        diamants++; 
                        anteriorObert--; 
                    }  
                    else anteriorObert = posActual; 
                } 
            }  
            else  
                if (arrayMina[posActual] == OBERT) 
                    anteriorObert = posActual; 
        } 
        System.out.println(diamants); 
        
        return diamants; 
    } 
} 