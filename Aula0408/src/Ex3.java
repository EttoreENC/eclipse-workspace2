import java.util.Random;

public class Ex3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Random gerador = new Random();
		int[] x = new int[10];
		int total;
		
		// nextInt é de -2 elevado a 31 até +2 elevado a 31
		for (int i = 0; i < x.length; i++) {
			x [i] = gerador.nextInt(1000);
			System.out.println(x[i] + " ");
			
		}
		
		System.out.println("\n");
		
		for (int i = 0; i < x.length; i++) {
			total = 0;
			for(int j = 2; j < x[i]; j++) {
				if(x[i] % j == 0) {
					total++;
					break;
				}
			}
			if(total == 0) {
				System.out.println(x[i] + " ");
			}
		}
	
	}

}
