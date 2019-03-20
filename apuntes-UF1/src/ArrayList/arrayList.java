package ArrayList;
import java.util.ArrayList;
import java.util.Iterator;


public class arrayList {
	public static void main(String[] args) {
		ArrayList a = new ArrayList();
		a.add("hola");
		a.add(35);
		a.add("adios");
		a.add(25);
		System.out.println(a);
		ArrayList<Integer> b = new ArrayList();
		b.add(25);
		System.out.println(a.size());
		System.out.println(a.get(2));
		a.remove(2);
		System.out.println(a);
		a.clear();
		System.out.println(a);
		a.add(25);
		a.set(0,"posicion 0");
		a.add("posicion 1");
		a.add("posicion 2");
		System.out.println(a);
		System.out.println(a.contains("posicion 0"));
		System.out.println(a.indexOf("posicion 0"));
		for (int i = 0; i < a.size(); i++) {
			System.out.println(a.get(i));
		}
		for (Object o: a) {
			System.out.println(o);
		}
		Iterator it = a.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
	}
}
