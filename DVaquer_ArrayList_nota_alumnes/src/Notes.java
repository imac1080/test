import java.util.ArrayList;
import java.util.Scanner;

public class Notes {
	public static void main(String[] args) {
		ArrayList<String> notes = new ArrayList();
		notes.add("Daniel");
		notes.add("Laura");
		notes.add("Paco");
		notes.add("Jesus");
		notes.add("Andres");
		notes.add("Manolo");
		notes.add("David");
		notes.add("Carlos");
		notes.add("Juan");
		notes.add("Josu");
		Notes programa = new Notes();
		programa.inici(notes);
	}

	public void inici(ArrayList<String> noms) {
		Scanner lector = new Scanner(System.in);
		int nota = 0;
		ArrayList<ArrayList<String>> notes = new ArrayList();
		for (int i = 0; i < 10; i++) {
			System.out.println("Pon les notes de l'alumne "+i);
			notes.add(new ArrayList<String>());
			nota = lector.nextInt();
			while (nota > 0) {
				notes.get(i).add(String.valueOf(nota));
			}
		}
		for (int i = 0; i < 10; i++) {
			System.out.print(noms.get(i) + " ");
			for (int j = 0; j < notes.get(i).size(); j++) {
				System.out.print(notes.get(i).get(j) + " ");
			}
		}
	}
}
