package exercicio12;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class TempoExecucaoTeste {
	
	@Test(timeout = 1000)
	public void naoPassaPeloTimeout() {
		assertTrue(true); /*esse é um exemplo simulando que vai passar*/
		
	}
	
	@Test(timeout = 1000)
	public void apresentaErroTimeout() throws InterruptedException {
		Thread.sleep(1001);
	}
}
