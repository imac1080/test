package examen_ams1_m3_uf2_final;

import java.util.Arrays;
import java.util.Random;

public class daus {
	public static void main(String[] args) {
		double[] arrayFrequencies = new double[6];
		daus programa = new daus();
		programa.inici(arrayFrequencies);
		System.out.println(Arrays.toString(arrayFrequencies));
		programa.historiagrama(arrayFrequencies);

	}

	public void inici(double[] arrayFrequencies) {
		Random rand = new Random();
		int numeroRandom = rand.nextInt(7) + 1;
		for (int i = 0; i < 1000; i++) {
			if (numeroRandom == 1) {
				arrayFrequencies[0] = arrayFrequencies[0] + 1;
			} else if (numeroRandom == 2) {
				arrayFrequencies[1] = arrayFrequencies[1] + 1;
			} else if (numeroRandom == 3) {
				arrayFrequencies[2] = arrayFrequencies[2] + 1;
			} else if (numeroRandom == 4) {
				arrayFrequencies[3] = arrayFrequencies[3] + 1;
			} else if (numeroRandom == 5) {
				arrayFrequencies[4] = arrayFrequencies[4] + 1;
			} else if (numeroRandom == 6) {
				arrayFrequencies[5] = arrayFrequencies[5] + 1;
			}

			rand = new Random();
			numeroRandom = rand.nextInt(7) + 1;
		}

	}

	public void historiagrama(double[] array) {
		int iguales = 0;
		String igualesS = "";
		double maxArray = 0;
		for (int i = 0; i < array.length; i++) {
			if (array[i] > maxArray) {
				maxArray = array[i];
			}
		}
		for (int i = 0; i < array.length; i++) {
			iguales = (int) (array[i] * 70 / maxArray);
			for (int j = 0; j < iguales; j++) {
				igualesS = igualesS + "=";
			}
			System.out.printf("%-10f|%s\n", array[i], igualesS);
			igualesS = "";
		}
	}

}
