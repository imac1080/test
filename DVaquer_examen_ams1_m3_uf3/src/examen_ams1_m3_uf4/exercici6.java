package examen_ams1_m3_uf4;

import java.io.File;
import java.io.PrintStream;
import java.io.RandomAccessFile;
import java.util.Scanner;

public class exercici6 {
	public static void main(String[] args) {
		exercici6 programa = new exercici6();
		String origen = "fitxer.txt";
		String desti = "desti.txt";
		Boolean bandera=true;
		programa.buscarFitxerCarpeta(origen, desti,bandera);
	}
	
	public void buscarFitxerCarpeta(String origen, String desti, boolean bandera) {
		File fOrigen = new File(origen);
		File fDesti = new File(desti);
		if (fDesti.exists() && fDesti.isDirectory()) {
			File fDesti2 = new File(desti+"/"+fOrigen.getName());
			try {
				Scanner lector = new Scanner(fOrigen);
				PrintStream escriptorFitxer = new PrintStream(fDesti2);
				while (lector.hasNextLine()) {
					escriptorFitxer.println(lector.nextLine());
				}
				lector.close();
			} catch (Exception e) {
				System.out.println("Error: " + e);
			}
		}else if (bandera){
			try {
				Scanner lector = new Scanner(fOrigen);
				PrintStream escriptorFitxer = new PrintStream(fDesti);
				while (lector.hasNextLine()) {
					escriptorFitxer.println(lector.nextLine());
				}
				lector.close();
			} catch (Exception e) {
				System.out.println("Error: " + e);
			}
		}else if (!bandera && fDesti.exists()) {
			System.out.println("¡Execpcio! l'arxiu exsisteix i bandera = false");
		}
	}
}
