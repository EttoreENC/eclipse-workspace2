import java.util.Random;

public class Ex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Random gerador = new Random();
		int [][] x = new int [3][3];
		int dp = 0, ds = 0;
		
		for(int i = 0; i < x.length; i++) {
			for(int j = 0; j < x[i].length; j++) {
				x[i] [j] = gerador.nextInt(2, 10);
				System.out.print(x[i][j] + "\t");
				
				// verificar se elemento está na diagonal principal
				if(i == j) {
					dp = dp + x[i][j]; // dp += x[i][j];
				}
				
				
				// verificar se o elemento esta na diagonal secundária
				if(i + j == x.length - 1) {
					ds = ds + x[i][j];
				}
			}
			System.out.println();
		}
			System.out.println("Soma da diagonal principal = " + dp);
			System.out.println("Soma da diagonal secundária = " + ds);

	}

}

