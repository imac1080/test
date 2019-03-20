package apunts_herencia;

public class Principal {
	public static void main(String[] args) {
		Pis MiPis = new Pis("adreca", 500, "Nou", 500000, 16, 3);
		Local MiLocal = new Local("adreca", 500, "Nou", 500000, 16, 3);
		if (MiLocal instanceof Local) {
			System.out.println("MiLocal si es instanceof de Local");
		}
	}
}
