import java.util.Arrays;
import java.util.Scanner;

public class String_chartAt {
	public static void main(String[] args) {
		Scanner lector = new Scanner(System.in);
		String hola = "adios adios";
		for (int i = 0; i < hola.length(); i++) {
			System.out.print(hola.charAt(i));
		}
		System.out.println();
		System.out.println(hola.indexOf("i"));
		System.out.println(hola.lastIndexOf("i"));
		
		//explicar que es regionMatches
		//hola.regionMatches(toffset, other, ooffset, len);
		
		String subcadena = hola.substring(1,4);
		System.out.println(subcadena);
		
		String[] cadenaSplit= hola.split(" ");
		System.out.println(Arrays.toString(cadenaSplit));
		System.out.println(cadenaSplit[0].length());
		System.out.println(cadenaSplit[1].length());
		
		//tres formas de definir un String
				String aaa= "hola";
				String bbb= new String();
				String ccc= new String("hola");
				
				
		//int to String
		int numero=3;
		String numeroString= String.valueOf(numero);
		System.out.println(numeroString.length());
		
		//String to int
		int numero2= Integer.parseInt(numeroString);
		System.out.println(numero2*numero);
		
		
		
	}	
}
