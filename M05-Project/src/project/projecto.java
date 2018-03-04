package projectom5;

import java.util.Scanner;

public class projecto {
	static Scanner reader = new Scanner(System.in);
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		int dia=0;
		int minutos=0;
		int horas=0;
		int res=0;
		dia=leerdia(dia);//calculara cuantos minutos tiene un dia
		
		minutos=leerminutos(minutos);//  se guardaran los minutos
		
		horas=leerhoras(horas);// caluclara las horas que hay puestas a minutos
		res=calcularminutos(horas,minutos,dia);// sumara todo en minutos 
		System.out.print(res);
	
}

	public static int calcularminutos(int horas, int minutos, int dia) {
		// TODO Auto-generated method stub
	int res=0;
		res= minutos + horas + dia;// La suma
		
		return res;
		
	}

	public static int leerhoras(int horas) {
		// TODO Auto-generated method stub
		System.out.print("cuantas horas faltan?");
		horas=reader.nextInt();
		horas=horas*60;//la multiplicacion para pasar a minutos
		return horas;
	}

	public static int leerminutos(int minutos) {
		// TODO Auto-generated method stub
		System.out.print("cuantos minutos faltan?");
		minutos=reader.nextInt();
		return minutos;
	}

	public static int leerdia(int dia) {
		// TODO Auto-generated method stub
		System.out.print("cuantos dias faltan?");
		dia=reader.nextInt();
		dia=dia*24;//las operaciones para psar a minutos
		dia=dia*60;
		return dia;
	}
}


