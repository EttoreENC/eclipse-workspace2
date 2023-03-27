import java.util.Scanner;

public class Exemplo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner teclado = new Scanner(System.in);
		String palavra, aux = "";
		
		System.out.print("Palavra--> ");
		palavra = teclado.next();
		
		for (int i = 0; i < palavra.length(); i++) {
			aux += palavra.charAt(i);
			System.out.println(aux);
			
		}

	}

}
