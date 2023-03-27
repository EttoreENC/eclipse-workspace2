import java.util.Scanner;

public class Main {
	
		public static void main(String[]args) {
			Scanner teclado = new Scanner(System.in);
			Metodo metodo = new Metodo();
			metodo.criarArray();
			int aux;
			for (int i = 0; i < 1;) {
				System.out.println("1- Criar Produto");
				System.out.println("2- Pesquisar Produto");
				System.out.println("3- Listar Produto");
				System.out.println("4- Excluir Produto");
				System.out.println("5- Encerrar Processo");
				aux = teclado.nextInt();
				if(aux == 1) {
					metodo.criarProduto();
				}else if(aux == 2) {
					metodo.Pesquisar();
				}else if(aux == 3) {
					metodo.Listar();
				}else if(aux == 4) {
					metodo.Excluir();
				}else {
					System.out.println("Operação finalizada");
					i++;
				}
		}
	}

}
