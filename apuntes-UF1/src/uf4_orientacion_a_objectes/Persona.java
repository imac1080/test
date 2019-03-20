package uf4_orientacion_a_objectes;

public class Persona {

	private String nombre;
	private int idPersona;
	private int edat;
	//public String nombre;
	//public int idPersona;
	
	public Persona(String nombre,int edat) {
		if (edat>=18) {
			this.edat = edat;
			this.nombre=nombre;
		}else {
			System.out.println("No es mayor de edad");
		}			
	}
	public Persona() {
		//DEFAULT
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getIdPersona() {
		return idPersona;
	}
	public void setIdPersona(int idPersona) {
		this.idPersona = idPersona;
	}
	public int getEdat() {
		return edat;
	}
	public void setEdat(int edat) {
		if (edat>=18) {
			this.edat = edat;
		}else {
			System.out.println("No es mayor de edad");
		}		
	}
}
