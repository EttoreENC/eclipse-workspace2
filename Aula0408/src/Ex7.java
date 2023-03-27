import java.util.Random;
import java.util.Scanner;

public class Ex7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner teclado = new Scanner(System.in);
		Random gerador = new Random();
		int qtd;
		boolean lim;
		int num;
		
		System.out.print("Quantos números? ");
		qtd = teclado.nextInt();
		
		int [] x = new int[qtd];
		
		for(int i = 0; i < x.length;) {
			x[i] = gerador.nextInt(10);
			lim = false;
			System.out.print(x[i] + " ");
			
			for(int j = 0; j < i; j++) {
				if(x[i] == x[j]) {
				lim = true;
				break;
				}
			}
			if(lim == false) {
				System.out.println(x[i] + " ");
				i++;
			}

		}

	}

}
