package examen_ams1_m3_uf2_final;

public class Misteri {
	//a) A =1842 B =2134511782 C =-1399321380 D = 735120344
	//b) A =1629 B =-7159470 C =192112879 D = 184883593
	//c) A =1509 B =726799640 C =-1140658792 D = -413928659
	
	public static void main(String[] args) {
		System.out.println(metodoMisterioso(0, 10, 12, 13));
	}

	public static int metodoMisterioso(int A, int B, int C, int D) {
		int resultado = 0;
		System.out.println("A =" + A + " B =" + B + " C =" + C + " D = " + D);
		if (A < 3000) {
			if (D != 0) {
				resultado = metodoMisterioso(A + 1, B * C / D + C, C + B, D - 1 + C);
			} else {
				resultado = metodoMisterioso(A + 1, B * C / 1 + C, C + B, D - 1 + C);
			}
		}
		return resultado;
	}
}
