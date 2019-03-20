import java.util.Scanner;

public class cajero221018 {
	public static void main(String[] args) {
		Scanner lector = new Scanner(System.in);
		int opcion=4;
		int contadorVueltas=0;
		int saldo=1000;
		boolean semafor=false;
		while (!(opcion==0)) {
			if (contadorVueltas>0) {
				System.out.println("ERROR-------");
			}
			System.out.println("1 - Ingresos");
			System.out.println("2 - Retirar");
			System.out.println("3 - Consulta Saldo");
			System.out.println("0 - Salir");
			System.out.println(" ");
			System.out.println("Opcio: ");
			if (lector.hasNextInt()) {
				opcion=lector.nextInt();
				if (opcion==1) {
					System.out.println("Ponga la cantidad: ");
					if (lector.hasNextInt()) {
						opcion=lector.nextInt();
						if (opcion==1) {
							System.out.println("Ponga la cantidad: ");
						}
					}else {
						lector.nextLine();
					}
				}
			}else {
				lector.nextLine();
			}
			contadorVueltas++;
		}

		System.out.println("Se ha acabado el programa");
		lector.close();
	}
}
