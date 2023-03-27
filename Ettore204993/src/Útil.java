import java.util.Scanner;

public class Útil {
	
Aluguel[] cliente = new Aluguel[5];
	
	public void Selecao() {
		Scanner teclado = new Scanner(System.in);
		int operacao;
		
		for(int i = 0; i < cliente.length; i++) {
			cliente[i] = new Aluguel();
		}
		
		for(int x = 0; x < 1;) {
			System.out.println("1 - Cadastrar \n2 - Listar \n3 - Cliente que mais utilizou a loja na semana \n4 - Valor total dos aluguéis");
			System.out.print("Número da operação --> ");
			operacao = teclado.nextInt();
					
					if (operacao < 1 || operacao > 5) {
						System.out.println("\nValor inválido");
					} else {
						
						}switch (operacao) {

						case 1:
							Cadastrar();
							break;
						case 2:
							Listar();
							break;
						case 3:
							MaisUtilizou();
							break;
						case 4:
							Total();
							break;
						}
				}
	}
	
	
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	public void Cadastrar() {
		Scanner teclado = new Scanner(System.in);

		for(int i = 0; i < cliente.length; i++) {
			if(cliente[i].nome.equals("")) {
				
				System.out.print("\nI sira o nome: ");
				cliente[i].nome = teclado.nextLine();
				
				System.out.print("Insira o CPF: ");
				cliente[i].cpf = teclado.nextLine();
				
				System.out.print("Insira o tempo do aluguel em horas: ");
				cliente[i].tempo = teclado.nextInt();
				
				System.out.println();
				return;
			}
			
		}
		
		System.out.println("\nCadastrados já realizados");
		return;
		
	}
	
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	public void Listar() {
		
		int aux = 0;
		
		for(int i = 0; i < cliente.length; i++) {
			if(cliente[i].nome.equals("")){
				aux++;
			}else {
				System.out.println("\nNome: " + cliente[i].nome);
				
				System.out.println("CPF: " + cliente[i].cpf);
				
				System.out.println("Valor à pagar: " + cliente[i].Final());
				
			}
		}
		
		if(aux == cliente.length) {
			System.out.println("\nNão há cadastros");
		}
		
	}
	
	
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	public void MaisUtilizou() {
		
		int horas = 0;
		int aux = 0;
		int aux2 = 0;
		
		for(int i = 0; i < cliente.length; i++) {
			if(cliente[i].nome.equals("")) {
				aux2++;
			}else {
				
				if(i == 0) {
					horas = cliente[i].tempo;
					aux = i;
					
				}else if (cliente[i].tempo > horas) {
					horas = cliente[i].tempo;
					aux = i;
				}
			
			}
		}
		
		if(aux2 == cliente.length) {
			
			System.out.println("\nNão há cadastros");
		
		}else {	
			
		System.out.println("\nNome: " + cliente[aux].nome);
		System.out.println("Alugou por " + horas + " horas");
		System.out.println("Total = R$ " + cliente[aux].Final());
		
		}
		
		
	}
	
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	public void Total() {
		
		double valor = 0;
		
		for(int i = 0; i < cliente.length; i++) {
			if(cliente[i].nome.equals("")) {
				
			}else {
				valor += cliente[i].Final();
			}
		}
		System.out.println("\nTotal recebido pela loja = R$ " + valor);
	}
	

}
