import java.util.Scanner;

public class Exemplo4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner teclado = new Scanner(System.in);
		String cadeia, complementar = "";
		
		System.out.println("Cadeia--> ");
		cadeia = teclado.next();
		
		cadeia = cadeia.toUpperCase();
		
		for (int i = 0; i < cadeia.length(); i++) {
			switch(cadeia.charAt(i)) {
			case 'A':
				complementar += 'T';
				break;
			case 'T':
				complementar += 'A';
				break;
			case 'C':
				complementar += 'G';
				break;
			case 'G':
				complementar += 'C';
				break;
				
			}
		}
		System.out.print(complementar);
	}

}
