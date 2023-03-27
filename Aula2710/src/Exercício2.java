public class Exercício2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(elevado(2,1));

	}
	
	public static int elevado(int x, int n) {
		if(n == 0) return 1;
		
		return x * elevado(x, (n - 1));
	}

}
