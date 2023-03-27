import java.util.Scanner;

import javax.annotation.processing.SupportedSourceVersion;

public class Main {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		Aluno[] aluno = new Aluno[3];
		
		//entrada de dados
		for(int i = 0; i < aluno.length; i++) {
			aluno[i] = new Aluno();
			System.out.println("RA --> ");
			aluno[i].ra = teclado.nextInt();
			teclado.nextLine();
			System.out.println("Nome --> ");
			aluno[i].nome = teclado.nextLine();
			System.out.println("Nota 1 --> ");
			aluno[i].nota1= teclado.nextDouble();
			System.out.println("Nota 2 --> ");
			aluno[i].nota2 = teclado.nextDouble();
			System.out.println();
		}
		
		//imprimir o nome do aluno, a média e a situação
		for (int i = 0; i < aluno.length; i++) {
			System.out.println(aluno[i].nome + "\t");
			System.out.println(aluno[i].calcularMedia() + "\t");
			System.out.println(aluno[i].situacao());
			System.out.println();
		}
		

	}

}
