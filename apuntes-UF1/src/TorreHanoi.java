import java.util.Arrays;

public class TorreHanoi {
	public static void main(String[] args) {
		TorreHanoi programa = new TorreHanoi();
		programa.Hanoi(3, 1, 2, 3);
	}

	public static void Hanoi(int n, int origen,  int auxiliar, int destino){
		  if(n==1)
		  System.out.println("mover disco de " + origen + " a " + destino);
		  else{
		     Hanoi(n-1, origen, destino, auxiliar);
		     System.out.println("mover disco de "+ origen + " a " + destino);
		     Hanoi(n-1, auxiliar, origen, destino);
		   }
		 }
}
