import java.util.Scanner;

public class exerciciOrdenarNumerosArray {
	public static void main(String[] args) {
		Scanner lector = new Scanner(System.in);
		int[] array = new int[6];
		int i = 0;
		while (i < array.length) {
			System.out.println("Ponga un numero en la posicion "+i);
			if (lector.hasNextInt()) {
				array[i] = lector.nextInt();
				i++;
			} else {
				System.out.println("ERROR");
				lector.nextLine();
			}
		}
		lector.close();
		int semafor = 3;
		int auxiliar = 0;
		while (semafor != 0) {
			semafor = 0;
			for (int j = 0; j < (array.length-1); j++) {
				if (array[j] > array[j + 1]) {
					auxiliar = array[j];
					array[j] = array[j + 1];
					array[j + 1] = auxiliar;
					semafor++;
				}
			}
		}
		System.out.println("LLISTA");
		for (int j = 0; j < array.length; j++) {
			System.out.println(array[j]);
		}
	}
}
