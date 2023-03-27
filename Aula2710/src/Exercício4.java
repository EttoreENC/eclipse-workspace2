
public class Exercício4 {

	public static void main(String[] args) {
		
		System.out.println(contar(123455556, 5));
		

	}
	
	public static int contar(int valor, int digito) {
		if(valor == 0) return 0;
		
		if(valor % 10 == digito) 
			return 1 + contar(valor / 10, digito);
		
		return contar(valor / 10, digito);
	}

}
