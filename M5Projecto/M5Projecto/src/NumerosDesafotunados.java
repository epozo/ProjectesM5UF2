import java.util.ArrayList;
import java.util.Scanner;

public class NumerosDesafotunados {
	public static ArrayList<Integer> crearlista(int numero) {//Creara los numeros para la arrays list 
		ArrayList<Integer> salida = new ArrayList<Integer>();
		for (int i = 1; i <= numero; i++) {//se añadiran los numeros  desde el 1 hasta el numero maximo
			salida.add(i);;//usare el add para poder añadir lso numeros a la arraylist es una de las cosas que un array normal no permite ya que en array tendrias que numero[i]=i;
		}
		return salida;
	}

	public static ArrayList<Integer> eliminar(int numero) {// eliminara de la lista creada 
		ArrayList<Integer> Listado = crearlista(numero);// usara el crear lista para crear los numeros desde el numero hasta el 1
		int orden = 1;
		while (orden < Listado.size()) {
			for (int b = 0; b < Listado.size(); b++) {//ara que b avanze 
				if (b % orden == 0) {
					
				}
				else {
					Listado.remove(b);//eliminara el numero de al arraylist
				}
			}
			orden++;
		}
		return Listado;
	}

	public static void imprimir(int entrada, ArrayList<Integer> Listado) {// imprimira el resultado
		System.out.print(entrada + ": ");
		for (int i = (Listado.size() - 1); i >= 0; i--) {
			if (i != 0) {
				System.out.print(Listado.get(i) + " ");
			} else {
				System.out.println(Listado.get(i));
			}
		}
	}

	



	public static void main(String[] args) {//el menu 
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		int entrada=0;
		 entrada = teclado.nextInt();
		boolean casos=false;
		while (!casos) {
			if (entrada != 0) {
				ArrayList<Integer> Listado = eliminar(entrada);// creara el listado desde eliminar para asi usar directamente la entrada 
				imprimir(entrada, Listado);// IMprime
				casos = true;
			} else {
				casos = false;
			}
		}
	}



	}


