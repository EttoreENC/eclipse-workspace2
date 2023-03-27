import java.util.Random;

public class Exemplo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Random gerador = new Random();
		
		int x = gerador.nextInt() % 50;
		double y = gerador.nextDouble();
		
		System.out.println(x);
		System.out.println(y);

	}

}
