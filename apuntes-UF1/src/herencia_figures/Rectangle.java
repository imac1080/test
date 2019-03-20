package herencia_figures;

public class Rectangle extends Figura {
	private int base;
	private int altura;

	public Rectangle(int x, int y, int base, int altura) {
		super(x, y);
		this.base = base;
		this.altura = altura;
	}

	@Override
	public double area() {
		return base * altura;
	}
}
