import javax.swing.JOptionPane;

public class JOp {

	public static void main(String[] args) {
		
		// JOptionPane.showMessageDialog(null, "Teste");
		// JOptionPane.showMessageDialog(null, "Logo vou embora", "Ir embora", 3);
		
		String nome = JOptionPane.showInputDialog("Qual seu nome?");
		int idade = Integer.parseInt(JOptionPane.showInputDialog("Idade"));
		JOptionPane.showMessageDialog(null, "Seu nome �: " + nome + " e voc� tem " + idade);
	}

}
