package apunts_herencia;

public class Pis extends Inmobles {
	private int pis;

	public Pis(String adreca, int metresQuadrats, String condicioNouSegonaMa, int preuBase, int anys, int pis) {
		super(adreca, metresQuadrats, condicioNouSegonaMa, preuBase, anys);
		this.pis = pis;
	}
	
	@Override
	public float calcularPreu() {
		float preuFinal=preuBase;
		if (anys<15) {
			preuFinal=preuBase-(preuBase/100);
		}else
			preuFinal=preuBase-((preuBase/100)*2);
		if (3<=pis) {
			preuFinal=preuFinal+((preuBase/100)*3);
		}
		return preuFinal;
	}
}
