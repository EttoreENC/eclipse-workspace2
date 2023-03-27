import java.util.Scanner;

public class Exemplo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] x = new int [5];
		
		preencher(x);
		System.out.println("Soma = " + somar(x));

	}

	
	public static void preencher(int[] x) {
		Scanner teclado = new Scanner(System.in);
		for(int i = 0; i < x.length; i++) {
			System.out.println("Valor--> ");
			x [i] = teclado.nextInt();
		}
	}
	
	public static int somar(int[] x) {
		int total = 0;
		
		for (int i = 0; i < x.length; i++) {
			total += x [i]; // total = total + x[i];
		}
		
		return total;
	}
}
