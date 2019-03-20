
public class explicacion_regionMatches {
	public static void main(String[] args) {
		// explicar que es regionMatches
		String hola = "adios adios";
		String hola2= "adios";
		System.out.println(hola/*buscar dintre d'aquest*/.regionMatches(true/*si es true s'ignoren les mayuscules*/, 6/*el punt de comencament a comparar del array mare (hola)*/, hola2/*String a buscar*/, 0/*punt de comencament del array a buscar (hola2)*/, 5/*numero de caracters a comparar*/));
	}
}
