package apunts_herencia;

public class Local extends Inmobles {

	private int numeroFinestres;

	public Local(String adreca, int metresQuadrats, String condicioNouSegonaMa, int preuBase, int anys,
			int numeroFinestres) {
		super(adreca, metresQuadrats, condicioNouSegonaMa, preuBase, anys);
		this.numeroFinestres = numeroFinestres;
	}

	@Override
	public float calcularPreu() {
		float preuImmoble=0;
		if (anys<15) {
			preuImmoble=preuBase-(preuBase/100);
		}else
			preuImmoble=preuBase-((preuBase/100)*2);
		if (50<metresQuadrats) {
			preuImmoble=preuImmoble+(preuBase/100);
		}
		if (numeroFinestres==1 || numeroFinestres==0) {
			preuImmoble=preuImmoble-((preuBase/100)*2);
		}else if (4<numeroFinestres) {
			preuImmoble=preuImmoble+((preuBase/100)*2);
		}
		return preuImmoble;
	}
}
