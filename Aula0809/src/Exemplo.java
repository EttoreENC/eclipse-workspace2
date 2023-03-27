
public class Exemplo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s = "Hoje tem aula";
		
		System.out.println(s.charAt(s.length() -1));
		s = s.toUpperCase();
		System.out.println(s);
		
		//método sobrecarregado
		
		s.replace(' ', '*');
		
		System.out.println();
		
	}

}
