package project;
import java.util.Scanner;

public class ElProfessor {

	final static Scanner reader = new Scanner (System.in);
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int casos;
		casos = inpInt();
		do {
			pro();
			casos--;
		}while(casos > 0);

	}
	
	/**
	 * El method <b>pro()</b> conte el conjunt del programa, és a dir, inicia les bariables, i crida a altres methods per realitzar les comprovacions, a més de demanar totes les entrades a l'usuari.
	 */
	public static void pro() {
		char[][] mat;
		int filaM;
		int colM;
		int filaP;
		int colP;
		int dir;
		int contAl; //indica el numero de alumnes atesos
		int metres;
		int aux;
		char car; //A indica que es alumne, O indica que es objecte, B indica que es el primer alumne
		boolean ok = false; //indica si és el primer alumne o no
		
		filaM = inpInt(); //indica la amplada de la matriu
		colM = inpInt(); //indica la alçada de la matriu
		mat = new char[filaM][colM];
		iniMat(mat, filaM, colM);
		do {
			filaP = inpInt();
			if(filaP > -1) {
				colP = inpInt();
				car = inpChar();
				if(car == 'A' && ok == false) {
					ok = true;
					car = 'B';
				}
				mat[filaP][colP] = car;
			} 
		}while(filaP > -1);
		ok = false; //a partir de aqui indica si ha resolt el dubte del primer alumne
		filaP = inpInt(); //de aqui cap a abaix indica la posicio del professor
		colP = inpInt();
		contAl = 0;
		metres = 0;
		do {
			dir = inpInt();
			if(dir > -1) {
				if(dir == 1 || dir == 0) {
					aux = colP;
					colP = vert(filaP, colP, dir, mat, filaM, colM); //mou al professor en vertical (0 dreta; 1 esquerra)
					if(colP != aux) {
						metres++;
					}
				}
				else {
					aux = filaP;
					filaP = hori(filaP, colP, dir, mat, filaM, colM); //mou el professor en horitzontal (2 = adalt de 9 a 0, 3 a baix de 0 a 9
					if(filaP != aux) {
						metres++;
					}
				}
				
				contAl = CompAl(mat, filaP, colP, filaM, colM, contAl); //comprova si ha alludat a un alumne
				if(ok != true) ok = CompPrimer(mat, filaP, colP, filaM, colM); //comprova si ha alludat al primer alumne
			}
		}while(dir > -1);
		if(ok == true) System.out.println(metres + " " + contAl + " Si");
		else System.out.println(metres + " " + contAl + " No");
	}
	/**
	 * El method <b>CompPrimer()</b> comrpova si a ajudat al primer alumne que a tingut algun dubte.
	 * @param mat Conte la matriu sobre la que treballa el method.
	 * @param filaP Conte la fila a on es troba el professor.
	 * @param colP Conte la columna a on es troba el professor.
	 * @param filaM Indica el numero de files que te la matriu.
	 * @param colM Indica el numero de columnes que te la matriu.
	 * @return Retorna un boolean.
	 * 	<ul>
	 * 		<li>True: Ha ajudat al primer alumne.</li>
	 * 		<li>False: No ha ajudat al primer alumne.</li>
	 * 	</ul>
	 */
	public static boolean CompPrimer(char[][] mat, int filaP, int colP, int filaM, int colM) {
		boolean ok = false;
		if(filaP == 0 && colP == 0) {
			if(mat[filaP + 1][colP] == 'B') ok = true;
			else {
				if(mat[filaP][colP + 1] == 'B') ok = true;
			}
		}
		else {
			if(filaP == filaM -1 && colP == 0) {
				if(mat[filaP - 1][colP] == 'B') ok = true;
				else {
					if(mat[filaP][colP + 1] == 'B') ok = true;
				}
			}
			else {
				if(filaP == 0 && colP == colM -1) {
					if(mat[filaP + 1][colP] == 'B') ok = true;
					else {
						if(mat[filaP][colP - 1] == 'B') ok = true;
					}
				}
				else {
					if(filaP == filaM - 1 && colP == colM -1) {
						if(mat[filaP - 1][colP] == 'B') ok = true;
						else {
							if(mat[filaP][colP - 1] == 'B') ok = true;
						}
					}
					else {
						if(filaP == 0) {
							if(mat[filaP + 1][colP] == 'B') ok = true;
							else {
								if(mat[filaP][colP + 1] == 'B') ok = true;
								else {
									if(mat[filaP][colP - 1] == 'B') ok = true;
								}
							}
						}
						else {
							if(filaP == filaM -1) {
								if(mat[filaP - 1][colP] == 'B') ok = true;
								else {
									if(mat[filaP][colP - 1] == 'B') ok = true;
									else {
										if(mat[filaP][colP + 1] == 'B') ok = true;
									}
								}
							}
							else {
								if(colP == 0) {
									if(mat[filaP + 1][colP] == 'B') ok = true;
									else {
										if(mat[filaP][colP + 1] == 'B') ok = true;
										else {
											if(mat[filaP - 1][colP] == 'B') ok = true;
										}
									}
								}
								else {
									if(colP == colM -1) {
										if(mat[filaP + 1][colP] == 'B') ok = true;
										else {
											if(mat[filaP][colP - 1] == 'B') ok = true;
											else {
												if(mat[filaP - 1][colP] == 'B') ok = true;
											}
										}
									}
									else {
										if(mat[filaP - 1][colP] == 'B') ok = true;
										else {
											if(mat[filaP + 1][colP] == 'B') ok = true;
											else {
												if(mat[filaP][colP - 1] == 'B') ok = true;
												else {
													if(mat[filaP][colP + 1] == 'B') ok = true;
												}
											}
										}
									}
								}
							}
						}
					}
				}
			}
		}
		return ok;
	}
	/**
	 * El method <b>CompAl()</b> comprova si el professor a ajudat a algun alumne.
	 * @param mat Conte la matriu sobre la que treballa.
	 * @param filaP	Conte la fila del professor.
	 * @param colP Conte la columna del professor.
	 * @param filaM	Conte el numero de files de la matriu.
	 * @param colM	Conte el numero de columnes de la matriu.
	 * @param contAl Conte el numero de alumnes que a ajudat el professor.
	 * @return Retorna el numero de alumnes que a ajudat el professor (contAl).
	 */
	public static int CompAl(char[][] mat, int filaP, int colP, int filaM, int colM, int contAl) {
		if(filaP == 0 && colP == 0) {
			if(mat[filaP + 1][colP] == 'A') contAl++;
			else {
				if(mat[filaP][colP + 1] == 'A') contAl++;
			}
		}
		else {
			if(filaP == filaM - 1 && colP == 0) {
				if(mat[filaP - 1][colP] == 'A') contAl++;
				else {
					if(mat[filaP][colP + 1] == 'A') contAl++;
				}
			}
			else {
				if(filaP == 0 && colP == colM - 1) {
					if(mat[filaP + 1][colP] == 'A') contAl++;
					else {
						if(mat[filaP][colP - 1] == 'A') contAl++;
					}
				}
				else {
					if(filaP == filaM - 1 && colP == colM - 1) {
						if(mat[filaP - 1][colP] == 'A') contAl++;
						else {
							if(mat[filaP][colP - 1] == 'A') contAl++;
						}
					}
					else {
						if(filaP == 0) {
							if(mat[filaP + 1][colP] == 'A') contAl++;
							else {
								if(mat[filaP][colP + 1] == 'A') contAl++;
								else {
									if(mat[filaP][colP - 1] == 'A') contAl++;
								}
							}
						}
						else {
							if(filaP == filaM - 1) {
								if(mat[filaP - 1][colP] == 'A') contAl++;
								else {
									if(mat[filaP][colP - 1] == 'A') contAl++;
									else {
										if(mat[filaP][colP + 1] == 'A') contAl++;
									}
								}
							}
							else {
								if(colP == 0) {
									if(mat[filaP + 1][colP] == 'A') contAl++;
									else {
										if(mat[filaP][colP + 1] == 'A') contAl++;
										else {
											if(mat[filaP - 1][colP] == 'A') contAl++;
										}
									}
								}
								else {
									if(colP == colM - 1) {
										if(mat[filaP + 1][colP] == 'A') contAl++;
										else {
											if(mat[filaP][colP - 1] == 'A') contAl++;
											else {
												if(mat[filaP - 1][colP] == 'A') contAl++;
											}
										}
									}
									else {
										if(mat[filaP - 1][colP] == 'A') contAl++;
										else {
											if(mat[filaP + 1][colP] == 'A') contAl++;
											else {
												if(mat[filaP][colP - 1] == 'A') contAl++;
												else {
													if(mat[filaP][colP + 1] == 'A') contAl++;
												}
											}
										}
									}
								}
							}
						}
					}
				}
			}
		}
		return contAl;
	}
	/**
	 * El method <b>hori()</b> de horitzontal, gestiona el desplaçament horitzontal.
	 * @param filaP Conte la fila del professor.
	 * @param colP Conte la columna del professor.
	 * @param dir Conte la direcció cap a on va el professor.
	 * @param mat Conte la matriu sobre la que treballa.
	 * @param filaM Conte el numero de files de la matriu.
	 * @param colM Conte el numero de files de la matriu.
	 * @return Retorna el valor de la filaP.
	 */
	public static int hori(int filaP, int colP, int dir, char[][] mat, int filaM, int colM) {
		if(dir == 2) {
			if(filaP > 0) {
				if(mat[filaP - 1][colP] != 'O' && mat[filaP - 1][colP] != 'A' && mat[filaP - 1][colP] != 'B') {
					filaP--;
				}
			}
		}
		else {
			if(filaP < filaM - 1) {
				if(mat[filaP + 1][colP] != 'O' && mat[filaP + 1][colP] != 'A' && mat[filaP + 1][colP] != 'B') {
					filaP++;
				}
			}
		}
		return filaP;
	}
	/**
	 * El method <b>vert()</b> de vertical, gestiona el desplaçament verticalment.
	 * @param filaP Conte la fila del professor.
	 * @param colP Conte la columna del professor.
	 * @param dir Conte la direcció cap a on va el professor.
	 * @param mat Conte la matriu sobre la que treballa.
	 * @param filaM Conte el numero de files de la matriu.
	 * @param colM Conte el numero de files de la matriu.
	 * @return Retorna el valor de la colP.
	 */
	public static int vert(int filaP, int colP, int dir, char[][] mat, int filaM, int colM) {
		if(dir == 0) {
			if(colP < colM - 1) {
				if(mat[filaP][colP + 1] != 'O' && mat[filaP][colP + 1] != 'A' && mat[filaP][colP + 1] != 'B') {
					colP++;
				}
			}
		}
		else {
			if(colP > 0) {
				if(mat[filaP][colP - 1] != 'O' && mat[filaP][colP - 1] != 'A' && mat[filaP][colP - 1] != 'B') {
					colP--;
				}
			}
		}
		return colP;
	}
	/**
	 * El method <b>iniMat()</b> inicia la matriu sobre la que treballarem amb un valor.
	 * @param mat Conte la matriu sobre la que treballem.
	 * @param fila Conte el numero de files que te la matriu.
	 * @param col Conte el numero de columnes que conte la matriu.
	 */
	public static void iniMat(char[][] mat, int fila, int col) {
		char car = 'C';
		for(int i = 0; i < fila; i++) {
			for(int p = 0; p < col; p++) {
				mat[i][p] = car;
			}
		}
	}
	/**
	 * El method <b>inpChar()</b> gestiona la entrada de caracters.
	 * @return Retorna el caracter lleguit per teclat.
	 */
	public static char inpChar() {
		char inp;
		inp = reader.next().charAt(0);
		return inp;
	}
	/**
	 * El method <b>inpInt()</b> gestiona la entrada de numeros enters.
	 * @return Retorna el numero enter llegit per teclat.
	 */
	public static int inpInt() {
		int input;
		input = reader.nextInt();
		return input;
	}
}
