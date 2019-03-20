package apunts_herencia;

public abstract class Inmobles {
	protected String adreca;
	protected int metresQuadrats;
	protected String condicioNouSegonaMa;
	protected int preuBase;
	protected int anys;

	public Inmobles(String adreca, int metresQuadrats, String condicioNouSegonaMa, int preuBase, int anys) {
		super();
		this.adreca = adreca;
		this.metresQuadrats = metresQuadrats;
		this.condicioNouSegonaMa = condicioNouSegonaMa;
		this.preuBase = preuBase;
		this.anys = anys;
	}
	
	public abstract float calcularPreu();
}
