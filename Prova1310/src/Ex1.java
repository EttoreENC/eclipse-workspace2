import java.util.Scanner;

public class Ex1 { 
//  A determina��o do n�mero de repeti��es dever� ser realizada por um
	// m�todo e a impress�o dever� ser realizada no m�todo main(). 

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		int x[] = new int [5];
		int y[] = new int [5];
		int aux = 0;
		
		x = preencher(x);
		
		System.out.println("");
		y = preencher(y);
		
		aux = comparador(x, y, aux);
		
		System.out.println("O n�mero armazenado na primeira posi��o do primeiro vetor se repete " + aux + " vez(es) no segundo vetor");
		
	}
	
	public static int[] preencher(int[] p) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Digite 5 numeros ");
		for(int i = 0; i < p.length; i++) {
			System.out.print("Digite o " + (i+1) + "� n�mero: ");
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
