import java.util.Scanner;

public class Ex4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner teclado = new Scanner(System.in);
		double [] temp = new double [7];
		String[] dias = {"Domingo", "Segunda-feira", "Ter�a-feira", "Quarta-feira", "Quinta-feira",
				"Sexta-feira", "S�bado"};
		double media = 0;
		
		for (int i = 0; i < temp.length; i++) {
			System.out.println("Temperatura do(a) " + dias [i] + ": ");
			temp[i] = teclado.nextDouble();
			media = media + temp[i];
		}

		// calculo da media
		media = media / temp.length;	
		System.out.println("M�dia da semana: " + media);
		
		//impressao dos dias da semana com temperaturas acima da m�dia
		for(int i = 0; i < temp.length; i++) {
			if(temp[i] > media) {
				System.out.println(dias[i]);
			}
		}
	}

}
