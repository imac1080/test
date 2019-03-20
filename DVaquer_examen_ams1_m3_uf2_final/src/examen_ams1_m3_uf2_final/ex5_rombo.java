package examen_ams1_m3_uf2_final;

import java.lang.reflect.Array;

public class ex5_rombo {
	public static void main(String[] args) {
		String[][] array1 = { { " ", "A", " " }, { "B", "A", "B" } };
		// String[][] array1 = { { " ", " ", "A", " ", " " }, { " ", "B", "A", "B", " "
		// }, { "C", "B", "A", "B", "C" } };
		// String[][] array1 = { { " ", " ", " ", "A", " ", " ", " " }, { " ", " ", "B",
		// "A", "B", " ", " " },
		// { " ", "C", "B", "A", "B", "C", " " }, { "D", "C", "B", "A", "B", "C", "D" }
		// };
		System.out.println("array1.lenght-1 "+(array1.length-1)+" array1[0].lenght "+array1[0].length);
		ex5_rombo programa = new ex5_rombo();
		programa.inici(0, 0, array1);

	}

	public void inici(int columna, int fila, String[][] array1) {
		if (columna == array1[0].length-1 && fila == array1.length-1 * 2) {
			System.out.print(array1[columna][fila]);
			System.out.println("");
			return;
		}
		if (columna == array1[0].length-1) {
			if (fila > array1.length-1) {
				System.out.print(array1[columna][array1.length-1 - (fila - array1.length-1)]);
			} else {
				System.out.print(array1[columna][fila]);
			}
			System.out.println("");
			inici(0, fila + 1, array1);
		} else {
			if (fila > array1.length-1) {
				System.out.print(array1[columna][array1.length-1 - (fila - array1.length-1)]);
			} else {
				System.out.print(array1[columna][fila]);
			}
			inici(columna + 1, fila, array1);
		}
	}
}
