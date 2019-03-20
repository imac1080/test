package herencia_figures;

public class Cercle extends Figura {
	private int radi;

	public Cercle(int x, int y, int radi) {
		super(x, y);
		this.radi = radi;
	}

	@Override
	public double area() {
		// TODO Auto-generated method stub
		return Math.PI*Math.pow(radi, 2);
	}
}
