import java.util.Scanner;

public class Exerc�cio1 {

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
			System.out.println("O valor de Delta � negativo, inserir n�meros v�lidos");
		}else if (a == 0){
			System.out.println("N�o � uma equa��o de segundo grau, inserir valores v�lidos");
		}else {
			x1 = (- b + Math.sqrt(D))/ 2*a;
			System.out.println("O valor de x1 � = " + x1);
			
			x2 = (- b - Math.sqrt(D))/ 2*a;
			System.out.println("O valor de x2 � = " + x2);
			
			System.out.println("O valor do Delta � = " + D);
		}

	}

}
