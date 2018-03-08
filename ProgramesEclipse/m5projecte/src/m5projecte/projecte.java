package m5projecte;

import java.util.Scanner;

public class projecte {
	
	static Scanner reader = new Scanner (System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String frase;
		int voc, con, para, sigPun, vocAcc;
		frase = reader.nextLine();
		frase = frase.toLowerCase();
		voc = contarVocals(frase);
		con = contarConsonants(frase);
		vocAcc = contarAccents(frase);
		para = contarParaules(frase);
		sigPun = contarSignes(frase);
		System.out.println(voc+" "+vocAcc+" "+con+" "+para+" "+sigPun);
	}
	
	public static int contarAccents(String frase) {
		int res=0;
		for (int i=0;i<frase.length();i++) {
			if (frase.charAt(i)=='à' ||frase.charAt(i)=='é' ||frase.charAt(i)=='è' ||frase.charAt(i)=='í' ||frase.charAt(i)=='ò' ||frase.charAt(i)=='ó' ||frase.charAt(i)=='ú')
				res++;
	}
		return res;
	}

	public static int contarSignes(String frase) {
		int res=0;
		for (int i=0;i<frase.length();i++) {
			if (String.valueOf(frase.toString().charAt(i)).matches("[{}'/<>:«»“”„().!¡?¿·;_—,]"))
				res++;
			else if (frase.toString().charAt(i)=='\\' || frase.toString().charAt(i)=='[' || frase.toString().charAt(i)==']' || frase.toString().charAt(i)=='"' || frase.toString().charAt(i)=='-' || frase.toString().charAt(i)==' ')
				res++;
		}
	return res;
	}
	
	public static int contarParaules(String frase) {
		int res=0;
		int fiLinia = frase.length() - 1;
		boolean paraula = false;
		for (int i=0;i<frase.length();i++) {
			if (Character.isLetter(frase.charAt(i)) && i != fiLinia)
				paraula=true;
			else if (!Character.isLetter(frase.charAt(i)) && paraula) {
				if (frase.toString().charAt(i)!='\'' && frase.toString().charAt(i)!='-') {
				res++;
				paraula=false;
				}
			}
			else if (Character.isLetter(frase.charAt(i)) && i == fiLinia)
				res++;
		}
		return res;
	}
	
	public static int contarConsonants(String frase) {
		int res=0;
		for (int i=0;i<frase.length();i++) {
			if (String.valueOf(frase.toString().toLowerCase().charAt(i)).matches("[bcçdfghjklmnñqpkrstvwxyz]"))
				res++;
			}
		return res;
	}
	
	public static int contarVocals(String frase) {
		int res=0;
		for (int i=0;i<frase.length();i++) {
			if (frase.charAt(i)=='a' || frase.charAt(i)=='e' || frase.charAt(i)=='i' || frase.charAt(i)=='o' || frase.charAt(i)=='u' || frase.charAt(i)=='à' ||frase.charAt(i)=='é' ||frase.charAt(i)=='è' ||frase.charAt(i)=='í' ||frase.charAt(i)=='ò' ||frase.charAt(i)=='ó' ||frase.charAt(i)=='ú')
				res++;
		}
		return res;
	}
}