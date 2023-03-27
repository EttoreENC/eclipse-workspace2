import java.util.Scanner;

public class Ex2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner teclado = new Scanner(System.in);
		double x, y, z;

		System.out.println("Insira o valor do lado x--> ");
		x = teclado.nextDouble();
		
		System.out.println("Insira o valor do lado y--> ");
		y = teclado.nextDouble();
		
		System.out.println("Insira o valor do lado z--> ");
		z = teclado.nextDouble();
		
		if(x < y + z && y < x + z && z < y + x) {
			classificar(x, y, z);
		}else {
			System.out.println("Não é um triângulo, digite valores válidos");
		}

	}

	public static void classificar(double x, double y, double z) {
		if(x == y && y == z) {
			System.out.println("Triângulo equilátero");
		}else if(x == y || y == z || x == z) {
			System.out.println("Triângulo isósceles");
		}else {
			System.out.println("Triângulo escaleno");
		}
	}
}
