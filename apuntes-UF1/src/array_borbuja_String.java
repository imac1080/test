
public class array_borbuja_String {
	public static void main(String[] args) {
		String[] array = { "jjj","aaa", "ccc", "bbb","aab" };
		System.out.println(array[0].compareTo(array[1]));
		int numDerechaIzquierda = 1;
		int semafor = 3;
		String auxiliar = "";
		while (semafor != 0) {
			semafor = 0;
			for (int j = numDerechaIzquierda - 1; j < (array.length - numDerechaIzquierda); j++) {
				if (array[j].compareTo(array[j+1])>0) {
					auxiliar = array[j];
					array[j] = array[j + 1];
					array[j + 1] = auxiliar;
					semafor++;
				}
			}
			for (int j = array.length - numDerechaIzquierda; j > (numDerechaIzquierda - 1); j--) {
				if (array[j].compareTo(array[j-1])<0) {
					auxiliar = array[j];
					array[j] = array[j - 1];
					array[j - 1] = auxiliar;
					semafor++;
				}
			}
		}
		System.out.println("LLISTA");
		for (int j = 0; j < array.length; j++) {
			System.out.println(array[j]);
		}
		
	}
}
