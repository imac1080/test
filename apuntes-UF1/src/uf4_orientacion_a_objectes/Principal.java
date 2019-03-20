package uf4_orientacion_a_objectes;

public class Principal {

	public static void main(String[] args) {
		Persona Pep = new Persona();
		Persona Maria= new Persona("Maria",19);

		// Pep.idPersona=1;
		Pep.setIdPersona(1);
		Pep.setNombre("Pep");
		Pep.setEdat(15);
	}
}
