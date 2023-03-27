import java.util.Scanner;

public class Exercício1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Ex5 feito porcamente
		
		
		
		
		
		// adasfafwefasaedaf
		
		Scanner teclado = new Scanner(System.in);
		double x1, x2;
		double a, b, c, D;
		
		System.out.println("Insira o valor de a--> ");
		a = teclado.nextDouble();
		
		System.out.println("Insira o valor de b--> ");
		b = teclado.nextDouble();
		
		System.out.println("Insira o valor de c--> ");
		c = teclado.nextDouble();
		
		D = b*b - 4*a*c;
		
		if(D < 0) {
			System.out.println("O valor de Delta é negativo, inserir números válidos");
		}else if (a == 0){
			System.out.println("Não é uma equação de segundo grau, inserir valores válidos");
		}else {
			x1 = (- b + Math.sqrt(D))/ 2*a;
			System.out.println("O valor de x1 é = " + x1);
			
			x2 = (- b - Math.sqrt(D))/ 2*a;
			System.out.println("O valor de x2 é = " + x2);
			
			System.out.println("O valor do Delta é = " + D);
		}

	}

}
