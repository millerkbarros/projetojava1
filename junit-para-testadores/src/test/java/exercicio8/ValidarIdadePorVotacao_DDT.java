package exercicio8;

import static org.junit.Assert.assertEquals;
import java.util.Arrays;
import java.util.Collection;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;
import votacao.Votacao;

@RunWith(Parameterized.class)
public class ValidarIdadePorVotacao_DDT {

	String nome;
	int anoDeNascimento;
	String resultado;
	
	public ValidarIdadePorVotacao_DDT(String nome, int anoDeNascimeno, String resultado) {
		this.nome = nome;
		this.anoDeNascimento = anoDeNascimeno;
		this.resultado = resultado;		
	}

	
	@Test
	public void validarObrigatoriedadeDeVoto() {
		assertEquals(resultado, Votacao.podeVotar(nome, anoDeNascimento));
	}
	
	@Parameters(name = "{0} | {1} | {2}") /*(name = "{0} | {2} | {3}") -> esse comando é para exibir o dados da pessoa no resultado do teste*/
	public static Collection<Object[]> data() {
	   return Arrays.asList(new Object[][] {
		   { "Maria", 2008, "Maria voce nao pode votar" },
	       { "Rodrigo", 2007, "Rodrigo seu voto e facultativo" },
	       { "Joao", 2006, "Joao seu voto e facultativo" },
	       { "Carla", 2005, "Carla seu voto e obrigatorio" },
	       { "José", 1998, "José seu voto e obrigatorio" },
	       { "Ana", 1953, "Ana seu voto e obrigatorio" },
	       { "Pedro", 1946, "Pedro seu voto e facultativo" }
	       });
	}
}
