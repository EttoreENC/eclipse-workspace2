import java.util.Scanner;

public class Ex2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner teclado = new Scanner(System.in);
		int [] x = new int [1000];
		int par = 0;
		
		
		for(int i = 0; i<x.length; i++) {
			System.out.println("Valor = ");
			x [i] = teclado.nextInt();
			
			if(x [i] % 2 == 0 ) {
				par++;
			}

		}

		System.out.println("Total de pares = " + par);
		System.out.println("Total de pares = " + (x.length - par));
	}

}
