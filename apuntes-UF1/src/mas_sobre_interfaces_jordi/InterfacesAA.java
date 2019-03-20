package mas_sobre_interfaces_jordi;

class claseA{
	public int variable1 = 20;
	
}
interface interfaceI {
	public static final int variable = 25;	
	void metodoAbstracto();
	
	public static void metodoEstatico() {
		System.out.println("salida desde el metodo estatico");
	}
	
	default void metodoDefault() {
		System.out.println("salida desde el metodo default");
	}
}

class claseB extends claseA implements interfaceI{
	int variable = 45;
	public claseB() {
		super();
		// TODO Auto-generated constructor stub
	}
	public void metodoAbstracto(){
		System.out.println("salida desde el metodo abstracto");
	}
	
}

public class InterfacesAA {		
	public static void main(String[] args) {
		claseB bb = new claseB();
		bb.variable = 37;
		interfaceI.metodoEstatico();
		bb.metodoDefault();
		System.out.println(interfaceI.variable);
		System.out.println(bb.variable);

	}

}
