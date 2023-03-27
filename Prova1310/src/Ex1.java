import java.util.Scanner;

public class Ex1 { 
//  A determinação do número de repetições deverá ser realizada por um
	// método e a impressão deverá ser realizada no método main(). 

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		int x[] = new int [5];
		int y[] = new int [5];
		int aux = 0;
		
		x = preencher(x);
		
		System.out.println("");
		y = preencher(y);
		
		aux = comparador(x, y, aux);
		
		System.out.println("O número armazenado na primeira posição do primeiro vetor se repete " + aux + " vez(es) no segundo vetor");
		
	}
	
	public static int[] preencher(int[] p) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Digite 5 numeros ");
		for(int i = 0; i < p.length; i++) {
			System.out.print("Digite o " + (i+1) + "º número: ");
			p[i] = teclado.nextInt();
		}
		return p;
	}
	
	public static int comparador(int[]x, int[] y, int c) {
		for(int i = 0; i < y.length; i++) {
			if(x[0] == y[i]) {
				c++;
			}
		}
		return c;
	}
}
