
public class Exercício5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		converter(25);
		
	}

	public static void converter(int valor) {
		if(valor == 0) return;
		System.out.println(valor % 2);
		converter(valor / 2);
	}

}
