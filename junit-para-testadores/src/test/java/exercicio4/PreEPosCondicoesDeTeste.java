package exercicio4;

import org.junit.*;

public class PreEPosCondicoesDeTeste {

	@Before
	public void preCondicao() {
		System.out.println("Executou a pre condicao");
	}
	
	@Test
	public void exibicaoPrePosCondicao_Teste1() {
		System.out.println("Executou o Teste1");
	}
	
	@Test
	public void exibicaoPrePosCondicao_Teste2() {
		System.out.println("Executou o Teste2");
	}
	
	@After
	public void posCondicao() {
		System.out.println("Executou a pos condicao");
		
	}
}
