import static javax.swing.JOptionPane.*;
import java.util.Random;
import java.util.Scanner;

import javax.swing.text.StyledEditorKit.ForegroundAction;

import static java.lang.Integer.parseInt;
import static java.lang.Double.parseDouble;

public class Util {
	private	Estoque[] estoque = new Estoque[3];

	// método para inserir os dados
	public void inserir() {
		Random gerador = new Random();
		Scanner teclado = new Scanner(System.in);
		for(int i = 0; i < estoque.length;i++) {
			estoque[i] = new Estoque();
			estoque[i].codigo = gerador.nextInt(1000, 10000);
			System.out.print("Produto --> ");
			estoque[i].nomeProduto = teclado.nextLine();
			System.out.print("Preço --> R$");
			estoque[i].preco = teclado.nextDouble();
			for(int j = 0; j < estoque[i].baixa.length; j++) {
				estoque[i].baixa[j] = i;
			}
			teclado.nextLine();
		}
	}
	
	// método para produto mais vendido
	public void maiorBaixa() {
		int aux;
		int maior = 0;
		int posicao = 0;
		
		for(int i = 0; i < estoque.length; i++) {
			aux = 0;
			for(int j = 0; j < estoque[i].baixa.length; j++) {
				aux += estoque[i].baixa[j];
			}
			if(aux > maior) {
				maior = aux;
				posicao = i;
			}
		}
		
		System.out.println("Produto mais vendido --> " + estoque[posicao].nomeProduto);
	}
	
}
