import java.util.Scanner;

public class Exercício5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner teclado = new Scanner(System.in);
		double a, b, c, D;
		double[] raiz;
		
		System.out.println("Valor de a--> ");
		a = teclado.nextDouble();
		if(a==0) {
			System.out.println("Não é uma equação de segundo grau");
		}else {
			System.out.println("Valor de b -->");
			b = teclado.nextDouble();
			System.out.println("Valor de c -->");
			c = teclado.nextDouble();
			D = delta(a, b, c);
			if(D < 0) {
				System.out.println("A equação não tem valor real");
			}else {
				raiz = calcular (a, b, D);
				System.out.println("x1 = " + raiz[0]);
				System.out.println("x2 = " + raiz[1]);
			}
		}

	}

	public static double delta(double a, double b, double c) {
		return (b*b - 4*a*c);
	}
	
	public static double[] calcular(double a, double b, double D) {
		double[] raiz = new double[2];
		raiz[0] = (-b + Math.sqrt(D))/2*a;
		raiz[1] = (-b - Math.sqrt(D))/2*a;
		return raiz;
	}
}
