import java.util.Scanner;

public class Ex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner teclado = new Scanner(System.in);
		int x;
		
		System.out.println("Insira um número inteiro e positivo: " );
		x = teclado.nextInt();
		
		if(x <= 0) {
			System.out.println("O valor deve ser inteiro e positivo");
		}else {
			imprimir (x);  // argumento--> calor que será enviado ao método
		}


	}

	public static void imprimir(int x) {
		for(int cont = 1; cont <= x; cont++) {
			if(x % cont == 0) {
				System.out.println(cont);
			}
		}
	}
	
}
