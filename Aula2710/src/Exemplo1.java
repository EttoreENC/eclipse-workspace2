
public class Exemplo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(fatorial(4));

	}
	
	public static double fatorial(int valor) {
		double fat = 1;
		for (int cont = valor; cont > 0; cont--) {
			fat = fat * cont;
		}
		return fat;
	}

}
