import java.util.Random;
import java.lang.Math;

public class exercici4 {
	public static void main(String[] args) {
		Random rand = new Random();
		int numeroRandom = rand.nextInt(9) + 1;
		int numeroRandomVoltes = (rand.nextInt(6) + 1) + 4;
		int[] tablaNumeroAleatorios = new int[20];
		int[] arrayDistancias = new int[10];
		for (int i = 0; i < tablaNumeroAleatorios.length; i++) {
			tablaNumeroAleatorios[i] = numeroRandom;
			rand = new Random();
			numeroRandom = rand.nextInt(9) + 1;
		}
		for (int i = 0; i < numeroRandomVoltes; i++) {
			for (int j = 0; j < tablaNumeroAleatorios.length; j++) {
				arrayDistancias[0] = arrayDistancias[0] + Math.abs(0 - tablaNumeroAleatorios[j]);
				arrayDistancias[1] = arrayDistancias[1] + Math.abs(1 - tablaNumeroAleatorios[j]);
				arrayDistancias[2] = arrayDistancias[2] + Math.abs(2 - tablaNumeroAleatorios[j]);
				arrayDistancias[3] = arrayDistancias[3] + Math.abs(3 - tablaNumeroAleatorios[j]);
				arrayDistancias[4] = arrayDistancias[4] + Math.abs(4 - tablaNumeroAleatorios[j]);
				arrayDistancias[5] = arrayDistancias[5] + Math.abs(5 - tablaNumeroAleatorios[j]);
				arrayDistancias[6] = arrayDistancias[6] + Math.abs(6 - tablaNumeroAleatorios[j]);
				arrayDistancias[7] = arrayDistancias[7] + Math.abs(7 - tablaNumeroAleatorios[j]);
				arrayDistancias[8] = arrayDistancias[8] + Math.abs(8 - tablaNumeroAleatorios[j]);
				arrayDistancias[9] = arrayDistancias[9] + Math.abs(9 - tablaNumeroAleatorios[j]);
			}
		}
		for (int i = 0; i < arrayDistancias.length; i++) {
			System.out.println(arrayDistancias[i]);
		}
	}
}
