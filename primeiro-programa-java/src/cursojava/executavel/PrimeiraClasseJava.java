package cursojava.executavel;

import javax.swing.JOptionPane;

public class PrimeiraClasseJava {

	/* Main é um metodo auto executavel em Java */
	public static void main(String[] args) {

		String nomeAluno = JOptionPane.showInputDialog("Digite o nome completo do aluno:");
				
		String nota1 = JOptionPane.showInputDialog("Informe a nota 1:");
		String nota2 = JOptionPane.showInputDialog("Informe a nota 2:");
		String nota3 = JOptionPane.showInputDialog("Informe a nota 3:");
		String nota4 = JOptionPane.showInputDialog("Informe a nota 4:");
		
		double mNota1 = Double.parseDouble(nota1);
		double mNota2 = Double.parseDouble(nota2);
		double mNota3 = Double.parseDouble(nota3);
		double mNota4 = Double.parseDouble(nota4);
				
		double media = (mNota1 + mNota2 + mNota3 + mNota4) / 4;
		
		int resultadoMedia = JOptionPane.showConfirmDialog(null, "Deseja ver a média?");
		
		/*Média para aprovação é 70*/
		
		if (media >= 50) {
			
			if (media >= 70) {
				JOptionPane.showMessageDialog(null, "Aluno está aprovado com média de: " + media);
			} else {
				JOptionPane.showMessageDialog(null, "Aluno está em recuperação com média de: " + media);
			}
		} else {
			JOptionPane.showMessageDialog(null, "Aluno está reprovado com média de: " + media);	
		}
	}
}