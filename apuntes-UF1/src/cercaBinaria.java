
public class cercaBinaria {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] v = { 4, 55, 555, 999 };
		int inf = 0, sup = v.length - 1, med, valor = 999;
		boolean trobat = false;
		while ((inf <= sup) && !trobat) {
			med = (sup + inf) / 2;
			if (v[med] == valor)
				trobat = true;
			if (valor < v[med])
				sup = med - 1;
			else
				inf = med + 1;
		}
		if (trobat)
			System.out.println("S'ha trobat");
		else
			System.out.println(" no S'ha trobat");
	}
}