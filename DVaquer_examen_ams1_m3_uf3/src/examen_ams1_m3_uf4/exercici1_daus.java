package examen_ams1_m3_uf4;

import java.io.File;
import java.io.PrintStream;
import java.util.Random;
import java.util.Scanner;

public class exercici1_daus {
	public static void main(String[] args) {
		exercici1_daus programa = new exercici1_daus();
		String[][] arrayJugadors = programa.demanarArray();
		programa.guardarFitxer(arrayJugadors);
		String[][] parellaRecuperada = new String[3][2];
		int[][] resultatsParellaRecuperada = new int[3][2];
		for (int i = 1; i < 5; i++) {
			parellaRecuperada = programa.recuperarAparellaments(i);
			resultatsParellaRecuperada = programa.tiradesAleatories(parellaRecuperada);
			programa.guardarResultats(resultatsParellaRecuperada, parellaRecuperada, i);
			// programa.actualizarClasificacio(parellaRecuperada,
			// resultatsParellaRecuperada, arrayJugadors);
		}
		programa.buscarFitxersResultats();
	}

	public void buscarFitxersResultats() {
		String[][] parellaRecuperada = new String[3][2];
		int[][] resultatsParellaRecuperada = new int[3][2];
		File fResultats1 = new File("resultat01.txt");
		File fResultats2 = new File("resultat02.txt");
		File fResultats3 = new File("resultat03.txt");
		File fResultats4 = new File("resultat04.txt");
		if (!fResultats1.exists()) {
			parellaRecuperada = recuperarAparellaments(1);
			resultatsParellaRecuperada = tiradesAleatories(parellaRecuperada);
			guardarResultats(resultatsParellaRecuperada, parellaRecuperada, 1);
		}
		if (!fResultats2.exists()) {
			parellaRecuperada = recuperarAparellaments(2);
			resultatsParellaRecuperada = tiradesAleatories(parellaRecuperada);
			guardarResultats(resultatsParellaRecuperada, parellaRecuperada, 2);
		}
		if (!fResultats3.exists()) {
			parellaRecuperada = recuperarAparellaments(3);
			resultatsParellaRecuperada = tiradesAleatories(parellaRecuperada);
			guardarResultats(resultatsParellaRecuperada, parellaRecuperada, 3);
		}
		if (!fResultats4.exists()) {
			parellaRecuperada = recuperarAparellaments(4);
			resultatsParellaRecuperada = tiradesAleatories(parellaRecuperada);
			guardarResultats(resultatsParellaRecuperada, parellaRecuperada, 4);
		}
	}

//NO HE FET EL DE ACTUALIZAR LES CLASIFICACIONS
	/*
	 * public void actualizarClasificacio(String[][] parellaRecuperada, int[][]
	 * resultatsParellaRecuperada, String[][] arrayJugadors) { for (int i = 0; i <
	 * 3; i++) { if
	 * (resultatsParellaRecuperada[i][0]>resultatsParellaRecuperada[i][1]) {
	 * arrayJugadors } } }
	 */

	public void guardarResultats(int[][] resultatsParellaRecuperada, String[][] parellaRecuperada, int i) {
		String file = "resultats0" + i + ".txt";
		File fResultats = new File(file);
		try {
			PrintStream escriptorFitxer = new PrintStream(fResultats);
			for (int j = 0; j < resultatsParellaRecuperada.length; j++) {
				for (int j2 = 0; j2 < resultatsParellaRecuperada[j].length; j2++) {
					escriptorFitxer.print(parellaRecuperada[j][j2] + " ");
				}
				for (int j2 = 0; j2 < resultatsParellaRecuperada[j].length; j2++) {
					escriptorFitxer.print(resultatsParellaRecuperada[j][j2]);
					if (j2 == 0) {
						escriptorFitxer.print(" ");
					}
				}
				if (j != resultatsParellaRecuperada.length - 1) {
					escriptorFitxer.println(" ");
				}
			}
			escriptorFitxer.close();
		} catch (Exception e) {
			System.out.println("Error: " + e);
		}
	}

	public int[][] tiradesAleatories(String[][] parellaRecuperada) {
		int[][] resultatsArray = new int[3][2];
		Random rand = new Random();
		int numeroRandom = rand.nextInt(11) + 2;
		for (int i = 0; i < resultatsArray.length; i++) {
			for (int j = 0; j < resultatsArray[i].length; j++) {
				resultatsArray[i][j] = numeroRandom;
				rand = new Random();
				numeroRandom = rand.nextInt(11) + 2;
			}
		}
		return resultatsArray;
	}

	public String[][] recuperarAparellaments(int i) {
		String[][] arrayJugadors = new String[3][2];
		String jornada = "jornada0" + i + ".txt";
		File fjornada = new File(jornada);
		try {
			Scanner jornadaLector = new Scanner(fjornada);
			for (int j = 0; j < 3; j++) {
				for (int j2 = 0; j2 < 2; j2++) {
					arrayJugadors[j][j2] = jornadaLector.next();
				}
			}
			jornadaLector.close();
		} catch (Exception e) {
			System.out.println("Error: " + e);
		}
		return arrayJugadors;
	}

	public String[][] demanarArray() {
		String[][] arrayJugadors = new String[6][2];
		Scanner lector = new Scanner(System.in);
		for (int i = 0; i < 6; i++) {
			System.out.println("Posa el nom del jugador: " + i);
			arrayJugadors[i][0] = lector.nextLine();
			arrayJugadors[i][1] = "0";
		}
		return arrayJugadors;
	}

	public void guardarFitxer(String[][] arrayJugadors) {
		File fClassificacio = new File("classificacio.txt");
		try {
			PrintStream escriptorFitxer = new PrintStream(fClassificacio);
			for (int i = 0; i < arrayJugadors.length; i++) {
				for (int j = 0; j < arrayJugadors[i].length; j++) {
					escriptorFitxer.print(arrayJugadors[i][j]);
					if (j == 0) {
						escriptorFitxer.print(" ");
					}
				}
				if (i != arrayJugadors.length - 1) {
					escriptorFitxer.println("");
				}
			}
			escriptorFitxer.close();
		} catch (Exception e) {
			System.out.println("Error: " + e);
		}
	}
}
