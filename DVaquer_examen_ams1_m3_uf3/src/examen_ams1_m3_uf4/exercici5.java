package examen_ams1_m3_uf4;

import java.io.File;
import java.io.RandomAccessFile;
import java.util.Scanner;

public class exercici5 {
	public static void main(String[] args) {
		//PARAMETRES
		int operador=7;
		int operand=9;
		File f = new File("taules_de_multiplicar.bin");
		int multiplicacio = 0;
		String frase = "";
		try {
			RandomAccessFile raf2 = new RandomAccessFile(f, "rw");
			raf2.setLength(0);
			for (int i = 1; i < 11; i++) {
				for (int k = 1; k < 11; k++) {
					multiplicacio = i * k;
					frase = String.valueOf(i) + "*" + String.valueOf(k) + "=" + multiplicacio + " ";
					if (i == 10 && k == 10) {
						frase = String.valueOf(i) + "*" + String.valueOf(k) + "=" + multiplicacio;
					}
					byte[] cadenaSplit = frase.getBytes();
					for (int j = 0; j < cadenaSplit.length; j++) {
						raf2.writeByte(cadenaSplit[j]);
					}
				}
			}
			raf2.close();
		} catch (Exception e) {
			System.out.println("Error: " + e);
		}
		exercici5 programa = new exercici5();
		programa.buscarMultiplicacio(operador, operand);
		System.out.println("Programa finalitzat.");
	}

	public void buscarMultiplicacio(int operador, int operand) {
		File f = new File("taules_de_multiplicar.bin");
		String text = "";
		String busqueda = String.valueOf(operador) + "*" + String.valueOf(operand);
		try {
			RandomAccessFile raf2 = new RandomAccessFile(f, "r");
			byte[] arrayBytes = new byte[(int) raf2.length()];
			for (int i = 0; i < arrayBytes.length; i++) {
				arrayBytes[i] = raf2.readByte();
			}
			text = new String(arrayBytes);
			String[] cadenaSplit = text.split(" ");
			String texto2 = "";
			for (int i = 0; i < cadenaSplit.length; i++) {
				String[] cadenaSplit2 = cadenaSplit[i].split("=");
				if (cadenaSplit2[0].equals(busqueda)) {
					System.out.println("El resultat de "+cadenaSplit2[0]+" es "+cadenaSplit2[1]);
				}
			}
			raf2.close();
		} catch (Exception e) {
			System.out.println("Error: " + e);
		}
	}
}
