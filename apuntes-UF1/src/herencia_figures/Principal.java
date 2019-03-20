package herencia_figures;

public class Principal {
public static void main(String[] args) {
	Figura[] Figures=new Figura[3];
	Figures[0] = new Rectangle(0, 0, 25, 10);
	Figures[1]= new Cercle(0, 0, 10);
	Figures[2]= new Triangle(0, 0, 25, 10);
	
	
	
	System.out.println("L'area del rectangle es: "+Figures[0].area());
	System.out.println("L'area del cercle es: "+Figures[1].area());
	System.out.println("L'area del triangle es: "+Figures[2].area());
}
}
