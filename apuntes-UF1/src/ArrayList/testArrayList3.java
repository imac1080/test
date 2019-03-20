package ArrayList;

import java.util.ArrayList;

public class testArrayList3 {
	public static void main(String[] args) {
		ArrayList<String> nombre = new ArrayList();
		nombre.add("Antonio");
		nombre.add("Antonio");
		nombre.add("Manolo");
		System.out.println(nombre.contains("Antonio"));
		System.out.println(nombre.contains("Juan"));
		System.out.println(nombre.indexOf("Antonio"));
		System.out.println(nombre.indexOf("Juan"));
		System.out.println(nombre.lastIndexOf("Antonio"));
		ArrayList<String> nombre1 = nombre;
		nombre.add("Paco");
		System.out.println(nombre1);
		//ARRAYLIST BIDIMENSIONAL
		ArrayList<ArrayList<String>> nombre3 = new ArrayList();
		nombre3.add(new ArrayList<String>());
		nombre3.get(0).add("hola");
		nombre3.get(0).add("hola2");
		nombre3.get(0).add("hola3");
		System.out.println(nombre3.size());
		System.out.println(nombre3.get(0).size());
		System.out.println(nombre3);
		System.out.println(nombre3.get(0));
	}
}
