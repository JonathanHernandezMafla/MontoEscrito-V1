import java.util.Scanner;
public class MontoEscrito {
	
	public static void main(String[] args) {
		
		NombreNumero Nn = new NombreNumero ();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Por favor inserte el n�mero a nombrar:");
		int a = sc.nextInt();
		System.out.println("El nombre del n�mero es: ");
		System.out.println(Nn.Nombre(a));		
		
	}

}
