package exercicio3;

import static org.junit.Assert.*;

import org.junit.Test;

public class ValidacaoIgualdade {
	
	@Test
	public void ValidacaoIgualdade_Sucesso() {
		String resultadoObtido = "Registro salvo com sucesso!";
		assertEquals("Registro salvo com sucesso!", resultadoObtido);
	}
	
	@Test
	public void validacaoIgualdade_Falha() {
		String resultadoObtido = "Registro excluído com sucesso!";
		assertEquals("Registro salvo com sucesso!", resultadoObtido);
	}
}
