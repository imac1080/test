
public class sumarArrayrecursividad {
	public static void main(String[] args) {
		sumarArrayrecursividad programa = new sumarArrayrecursividad();
		int[] A = { 3, 4, 6, 2, 8, 9 };
		int pos = 0;
		int resultat = programa.inici(A, pos);
		System.out.println(resultat);
		resultat = programa.busqueda(A, pos, 2);
		System.out.println(resultat);
	}

	public int inici(int[] A, int pos) {
		int resultat = 0;
		if (pos < A.length) {
				resultat = A[pos] + inici(A, pos + 1);
		}
		return resultat;
	}

	public int busqueda(int[] A, int pos, int numero) {
		int resultat = -1;
		if (pos < A.length) {
			if (A[pos] == numero) {
				resultat = pos;
			} else {
				resultat = busqueda(A, pos + 1,numero);
			}
		}
		return resultat;
	}
}
