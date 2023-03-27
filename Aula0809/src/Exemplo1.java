import java.util.Scanner;

public class Exemplo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner teclado = new Scanner(System.in);
		String palavra, invertida = "";
		
		System.out.print("Palavra -->");
		palavra = teclado.next();
		
		for (int i = palavra.length() -1; i>=0; i--) {
			invertida += palavra.charAt(i);
		}

		//verificar se as strings sao identicas
		if(palavra.equalsIgnoreCase(invertida)) {
			System.out.println("São palíndromos");
		}else {
			System.out.println("Não são palíndromos");
		}
	}

}
