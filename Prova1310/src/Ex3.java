import java.util.Random;
import java.util.Scanner;

public class Ex3 {  
		// Imprimir no v�deo o tempo de voo entre as cidades. A impress�o deve ser realizada por um
	//m�todo diferente do m�todo utilizado para gerar e armazenar
		//Ler o nome de duas cidades e imprimir no v�deo o tempo de voo entre as cidades. 

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		int x;
			
			System.out.print("Informe o n�mero de cidades: ");
			x = teclado.nextInt();
			String[] cidades = new String[x];
			teclado.nextLine();
			
			for(int i = 0; i < cidades.length; i++) {
			    
		        System.out.print("Digite o nome da " + (i+1) + "� cidade: ");
		        cidades[i] = teclado.nextLine();
		    }

			System.out.println("O tempo de voo entre " + cidades[0] + " e " + cidades[1] + " � de " + gerador() +" horas");
			
			}

	
			public static int gerador() {
					
					Random gerador = new Random();
					int lim = 10;
					int r = gerador.nextInt(lim) + 1;
				
					return r;
				}

}