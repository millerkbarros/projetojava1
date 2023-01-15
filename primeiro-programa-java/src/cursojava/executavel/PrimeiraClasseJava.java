package cursojava.executavel;

import javax.swing.JOptionPane;

import cursojava.classes.Aluno;

public class PrimeiraClasseJava {

	/* Main é um metodo auto executavel em Java */
	public static void main(String[] args) {
		
		String nome = JOptionPane.showInputDialog("Qual o nome do Aluno ?");
		String idade = JOptionPane.showInputDialog("Informe a idade:");
		String dtnascimento = JOptionPane.showInputDialog("Data de nascimento:");
		String rg = JOptionPane.showInputDialog("Informe o registro geral:");
		String cpf = JOptionPane.showInputDialog("Informe o CPF");
		String nomeMae = JOptionPane.showInputDialog("Nome mãe:");
		String nomePai = JOptionPane.showInputDialog("Nome pai");
		String dtMatricula = JOptionPane.showInputDialog("Data matrícula:");
		String nomeEscola = JOptionPane.showInputDialog("Nome escola:");
		String seriaMatriculado = JOptionPane.showInputDialog("Série matriculado");
		String nota1 = JOptionPane.showInputDialog("Informe a nota 1:");
		String nota2 = JOptionPane.showInputDialog("Informe a nota 2:");
		String nota3 = JOptionPane.showInputDialog("Informe a nota 3:");
		String nota4 = JOptionPane.showInputDialog("Informe a nota 4:");
					

		Aluno aluno1 = new Aluno(); /* new Aluno() é uma instância (Criação de Objeto) *//* aluno1 é uma referência para o objeto aluno*/
		aluno1.setNome(nome);
		aluno1.setIdade(Integer.valueOf(idade));		
		aluno1.setDataNascimento(dtnascimento);
		aluno1.setRegistroGeral(rg);
		aluno1.setNumeroCpf(cpf);
		aluno1.setNomeMae(nomeMae);
		aluno1.setNomePai(nomePai);
		aluno1.setDataMatricula(dtMatricula);
		aluno1.setNomeEscola(nomeEscola);
		aluno1.setSerieMatriculado(seriaMatriculado);
		aluno1.setNota1(Double.parseDouble(nota1));
		aluno1.setNota2(Double.parseDouble(nota2));
		aluno1.setNota3(Double.parseDouble(nota3));
		aluno1.setNota4(Double.parseDouble(nota4));
		
		System.out.println("Nome do aluno: " + aluno1.getNome());
		System.out.println("Idade do aluno: " + aluno1.getIdade());
		System.out.println("Nome mãe: " + aluno1.getIdade());
		System.out.println("Data de nascimento: " + aluno1.getDataNascimento());
		System.out.println("Média do aluno: " + aluno1.getMediaNota());
		System.out.println("Resultado: " + (aluno1.getAlunoAprovado() ? "Aprovado" : "Reprovado"));
		
						
		}
	}
