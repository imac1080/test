package ArrayList;

import java.util.ArrayList;

public class ArrayListReverse {
	public static void main(String[] args) {
		ArrayList<String> nombre = new ArrayList();
		ArrayList<String> nombre2 = new ArrayList();
		nombre.add("Antonio");
		nombre.add("Antonio");
		nombre.add("Manolo");
		for (int i = nombre.size()-1; 0 <= i; i--) {
			nombre2.add(nombre.get(i));
		}
		
	}
}
