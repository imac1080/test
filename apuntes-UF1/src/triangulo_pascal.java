import java.util.Arrays;
import java.util.Scanner;

public class triangulo_pascal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("escribe un numero");
		int numero = sc.nextInt();
		int[][] array = new int[numero + 1][numero + 1];
		triangulo_pascal programa = new triangulo_pascal();
		programa.inici(0, 0, array);
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array.length; j++) {
				System.out.print(array[i][j]);
			}
			System.out.println("");
		}
	}

	public void inici(int i, int j, int[][] array) {
		if (i == array.length + 1 && j == array.length + 1 || j == 0 || j == 1) {
			if (i == array.length + 1 && j == array.length + 1) {
				array[i][j] = 1;
				return;
			}
			if (j == i) {
				array[i][j] = 1;
				inici(i + 1, 0, array);
				return;
			}
			if (j == 0) {
				array[i][j] = 1;
				inici(i, j + 1, array);
				return;
			}
		} else {
			array[i][j] = array[i - 1][j - 1] + array[i - 1][j];
			inici(i, j + 1, array);
		}
	}
}
