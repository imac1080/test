package examen_ams1_m3_uf2_final;

import java.util.Scanner;

public class ex4_base {
	public static void main(String[] args) {
		Scanner lector = new Scanner(System.in);
		boolean correcte = false;
		int base = 0;
		int numero = 0;
		// base
		while (!correcte) {
			System.out.println("Escriu una base de 1-9");
			while (!lector.hasNextInt()) {
				System.out.println("Posa un numero enter");
				lector.nextLine();
			}
			base = lector.nextInt();
			if (base > 0 && base < 10) {
				correcte = true;
			}
		}
		correcte = false;
		// numero
		while (!correcte) {
			System.out.println("Escriu un numero en base 10");
			while (!lector.hasNextInt()) {
				System.out.println("Posa un numero enter");
				lector.nextLine();
			}
			numero = lector.nextInt();
			correcte=true;
		}
		System.out.println("numero= "+numero+" base= "+base);
		ex4_base programa = new ex4_base();
		System.out.println(programa.inici(numero,base,""));
	}
	public String inici(int numero,int base,String numeroConvertit) {
		if (numero/base==0) {
			numeroConvertit=String.valueOf(numero%base)+numeroConvertit;
			return numeroConvertit;
		}else {
			numeroConvertit=String.valueOf(numero%base)+numeroConvertit;
			numeroConvertit=inici(numero/base,base,numeroConvertit);
		}
		return numeroConvertit;
	}
}
