package examen_ams1_m3_uf2_final;

import java.util.Arrays;

public class ex3_suma_arrays {
	public static void main(String[] args) {
		int[][] array = { { 1, 2, 3, 4, 5 }, { 1, 2, 3, 4, 5 } };
		int[][] array2 = { { 1, 2, 3, 4, 5 }, { 1, 2, 3, 4, 5 } };
		ex3_suma_arrays programa = new ex3_suma_arrays();
		int[][]array3=programa.inici(array,array2);
		for (int i = 0; i < array3.length; i++) {
			for (int j = 0; j < array3[i].length; j++) {
				System.out.print(array3[i][j]+",");
			}
			System.out.println("");
		}
	}
	
	public int[][] inici(int[][]array,int[][]array2) {
		int[][]array3=array;
		for (int i = 0; i < array3.length; i++) {
			for (int j = 0; j < array3[i].length; j++) {
				array3[i][j]=array[i][j]+array2[i][j];
			}
		}
		return array3;
	}
}
