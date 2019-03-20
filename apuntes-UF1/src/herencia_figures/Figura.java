package herencia_figures;

public abstract class Figura {
	protected int x;
	protected int y;

	public Figura(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}
	
	public abstract double area();
}
