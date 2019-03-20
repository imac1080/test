package examen_ams1_m3_uf2_final;

public class ex2_efecte_mirall {
	public static void main(String[] args) {
		String paraula = "hola";
		ex2_efecte_mirall programa = new ex2_efecte_mirall();
		System.out.println(programa.inici(paraula));
	}

	public String inici(String paraula) {
		String[] cadenaSplit = paraula.split("");
		for (int i = cadenaSplit.length - 2; i >= 0; i--) {
			paraula = paraula + cadenaSplit[i];
		}
		return paraula;
	}
}
