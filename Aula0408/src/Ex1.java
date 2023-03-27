import java.util.Scanner;

public class Ex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner teclado = new Scanner(System.in);
		int [] x = new int[1000];
		int maior = 0;
		int menor = 0;
		
		for(int i = 0; i<x.length; i++) {
			System.out.println("Valor = ");
			x[i] = teclado.nextInt();
			
			if(x[i] > maior || i == 0) {
				maior = x[i];	
			}
			
			if(x[i] < menor || i == 0) {
				menor = x[i];
			}
		}
		
		System.out.println("maior valor = " + maior);
		System.out.println("menor valor = " + menor);
			
	}

}
