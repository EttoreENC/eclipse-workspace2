import java.util.Scanner;

public class Ex2 {
	// Escreva um programa em Java que leia uma frase via teclado. Em seguida, um m�todo dever�
	// receber a frase lida e retorn�-la invertida. A entrada e a sa�da de dados dever�o ser realizadas no m�todo
	// main(). Por exemplo, para a frase de entrada: �hoje � quinta-feira�, o m�todo dever� retornar: �ariefatniuq � ejoh�. 

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		String x;
		String y ="";
		
		System.out.println("Digite uma frase: ");
		x = teclado.nextLine();	
		
		y = inverter(x, y);
		System.out.println("\nFrase invertida: " + y);
	}

	public static String inverter (String x, String y) {
		for(int i = x.length()-1; i >= 0; i--) {
			y += x.charAt(i);
		}
		return y;
	}
}
