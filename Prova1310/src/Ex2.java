import java.util.Scanner;

public class Ex2 {
	// Escreva um programa em Java que leia uma frase via teclado. Em seguida, um método deverá
	// receber a frase lida e retorná-la invertida. A entrada e a saída de dados deverão ser realizadas no método
	// main(). Por exemplo, para a frase de entrada: “hoje é quinta-feira”, o método deverá retornar: “ariefatniuq é ejoh”. 

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
