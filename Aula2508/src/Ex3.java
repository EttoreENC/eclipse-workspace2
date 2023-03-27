import java.util.Scanner;

public class Ex3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner teclado = new Scanner(System.in);
		int x, y, z;
		
		System.out.println("Valor 1--> ");
		x = teclado.nextInt();
		
		System.out.println("Valor 2--> ");
		y = teclado.nextInt();
		
		System.out.println("Valor 3--> ");
		z = teclado.nextInt();
		
		
		System.out.println("Maior valor = " + maior(x, y, z));

	}

	
	public static int maior(int x, int y, int z){
		if(x > y && x > z) {
			return x;
		}else if(y > z) {
			return y;
		}else {
			return z;
		}
	}
}
