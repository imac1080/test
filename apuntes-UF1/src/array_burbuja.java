import java.util.Scanner;

public class array_burbuja{
	public static void main(String[] args) {
		Scanner lector = new Scanner(System.in);
		int[] array = {10,4,3,4,33,4,10};
		lector.close();
		int numDerechaIzquierda = 1;
		int semafor = 3;
		int auxiliar = 0;
		while (semafor != 0) {
			semafor = 0;
			for (int j = numDerechaIzquierda-1; j < (array.length-numDerechaIzquierda); j++) {
				if (array[j] > array[j + 1]) {
					auxiliar = array[j];
					array[j] = array[j + 1];
					array[j + 1] = auxiliar;
					semafor++;
				}
			}
			for (int j = array.length-numDerechaIzquierda; j > (numDerechaIzquierda-1); j--) {
				if (array[j] < array[j - 1]) {
					auxiliar = array[j];
					array[j] = array[j- 1];
					array[j - 1] = auxiliar;
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
