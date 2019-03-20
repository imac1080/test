
public class n_EXCLAMACION {
	public static void main(String[] args) {
		n_EXCLAMACION programa = new n_EXCLAMACION();
		System.out.println(programa.inici(4));
	}

	public int inici(int n) {
		int resultat = 1;		
		resultat=n*inici2(n-1);
		return resultat;
	}

	public int inici2(int n) {
		int resultat = 1;
		for (int i = n; i > 0; i--) {
			resultat = resultat * i;
		}
		return resultat;
	}
}
