package ProyectoM5;

import java.util.Scanner;

public class Solucion {
	static Scanner reader = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int prov, pal,x=0;
		int [] let = new int[26];
		prov=reader.nextInt();
		
		do {
			let=Limpiar(let);
			pal=reader.nextInt();
			String [] vec= new String[pal];
			reader.nextLine();
			while(x<pal) {
				vec[x]=reader.nextLine();
				x++;
			}
			let=Comprovar(vec, pal, let);
			Print(let, pal);
			prov--;
			x=0;
		}while(prov>0);
	}
	public static int[] Limpiar (int[] vec) {
		int x=0;
		while(x<26) {
			vec[x]=0;
			x++;
		}
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
		System.out.println();
	}

}
