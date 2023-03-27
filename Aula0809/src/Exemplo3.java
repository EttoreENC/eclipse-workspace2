import java.util.Scanner;

public class Exemplo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner teclado = new Scanner(System.in);
		String [] mes = {"Janeiro", "Fevereiro", "Março", "Abril", "Maio", "Junho",
				"Julho", "Agosto", "Setembro", "Outubro", "Novembro", "Dezembro"};

		String data;
		
		System.out.println("Date de nascimento (dd/mm/aa) : ");
		data = teclado.next();
		String [] data_aux = data.split("/");
		int numero = Integer.parseInt(data_aux[1]);
		
		System.out.println("Você nasceu em " + data_aux[0] + " de " + mes[numero - 1] + " de " + data_aux [2]);

	}

}
