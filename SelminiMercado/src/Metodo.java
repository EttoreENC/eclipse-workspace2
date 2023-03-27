import java.util.Scanner;
import java.util.Formatter.*;

public class Metodo {

	Produto[] produto = new Produto[10];

	public void criarArray() {
		for (int i = 0; i < produto.length; i++) {
			produto[i] = new Produto();
		}
	}

	public void criarProduto() {
		Scanner teclado = new Scanner(System.in);
		for (int i = 0; i < produto.length; i++) {
			if (produto[i].nome.equals("")) {

				System.out.println("Digite o nome do produto --> ");
				produto[i].nome = teclado.nextLine();

				System.out.println("Digite o valor do produto");
				produto[i].preco = teclado.nextDouble();

				System.out.println("Digite a quantidade em estoque");
				produto[i].quantidade = teclado.nextInt();

				System.out.println("Produto cadastrado com sucesso \n");

				return;
			}

		}

		System.out.println("J� existem " + produto.length + " produtos cadastrados \n");

	}

	public void Pesquisar() {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Digite o nome do produto --> ");
		String aux = teclado.nextLine();
		for (int i = 0; i < produto.length; i++) {
			if (aux.equals(produto[i].nome)) {
				System.out.println("C�digo do produto: " + i);
				System.out.println("Nome do produto: " + produto[i].nome);
				System.out.println("Pre�o do produto: R$" + String.format("%.2f", produto[i].preco));
				System.out.println("Disponibilidade do produto: " + produto[i].quantidade + "\n");

				return;

			}
		}

		System.out.println("Produto n�o encontrado");
	}

	public void Listar() {
		int aux = 0;
		System.out.println("Listando todos os produtos --> ");
		for (int i = 0; i < produto.length; i++) {
			if (!produto[i].nome.equals("")) {
				System.out.println("C�digo do produto: " + i);
				System.out.println("Nome do produto: " + produto[i].nome);
				System.out.println("Pre�o do produto: R$" + String.format("%.2f", produto[i].preco));
				System.out.println("Disponibilidade do produto: " + produto[i].quantidade + "\n");

			}else {
				aux++;
			}
			
		}
		if(aux == produto.length) {
			System.out.println("N�o h� produtos cadastrados");
		}
	}

	public void Excluir() {
		Scanner teclado = new Scanner(System.in);
		boolean test;
		System.out.println("Digite o nome do produto --> ");
		String aux = teclado.nextLine();
		for (int i = 0; i < produto.length; i++) {
			if (aux.equals(produto[i].nome)) {
				System.out.println("C�digo do produto: " + i);
				System.out.println("Nome do produto: " + produto[i].nome);
				System.out.println("Deseja excluir o produto? Digite sim ou n�o");
				do {
					aux = teclado.next();
					aux = aux.toLowerCase();
					if (aux.equals("sim")) {
						test = true;
					} else if (aux.equals("n�o")) {
						test = true;
					} else {
						System.out.println("Tente novamente");
						test = false;
					}
				} while (test == false);
				if (aux.equals("sim")) {
					produto[i].nome = "";
					produto[i].preco = 0;
					produto[i].quantidade = 0;
					System.out.println("Produto exclu�do");
					return;
				} else {
					System.out.println("Caso queira fazer outra opera��o, repita o processo");

					return;

				}

			}
		}

		System.out.println("Produto n�o encontrado");
	}

}
