import java.util.Scanner;

public class Ex5 {

		public static void main(String[] args) {
			// TODO Auto-generated method stub

			
			Scanner teclado = new Scanner(System.in);
			double [] temp = new double [7];
			String[] dias = {"Domingo", "Segunda-feira", "Ter�a-feira", "Quarta-feira", "Quinta-feira",
					"Sexta-feira", "S�bado"};
			
			for(int i =0; i < temp.length; i++) {
				System.out.print("Temperatura do(a)" + dias[i] + ": ");
				temp[i] = teclado.nextDouble();
			}
			
			System.out.println();
			for(int i = 0; i < temp.length; i++) {
				System.out.print(String.format("%-13s", dias[i]) + " ");
				for(int j = 1; j <= temp[i]; j++) {
					System.out.print("*");
				}
				System.out.println();
			}
		}

	}

