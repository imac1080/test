package herencia_figures;

public class Triangle extends Figura {
	private int base;
	private int altura;
	
	public Triangle(int x, int y, int base, int altura) {
		super(x, y);
		this.base = base;
		this.altura = altura;
	}

	@Override
	public double area() {
		return base*altura/2;
	}

}
