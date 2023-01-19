package exercicio7;

import org.junit.Test;

import votacao.Votacao;

import static org.junit.Assert.*;

public class ValidarIdadePorVotacao {
	
	/*Testes aplicado utilizando técnica de valor limite*/
	
	@Test
	public void idadeIgual15Anos_NaoPodeVotar() {
		assertEquals("Maria voce nao pode votar", Votacao.podeVotar("Maria", 2008));
	}
	
	@Test
	public void idadeIgual16Anos_VotoFacultativo() {
		assertEquals("Rodrigo seu voto e facultativo", Votacao.podeVotar("Rodrigo", 2007));
	}
	
	@Test
	public void idadeIgual17Anos_VotoFacultativo() {
		assertEquals("Joao seu voto e facultativo", Votacao.podeVotar("Joao", 2006));
	}
	
	@Test
	public void idadeIgual18Anos_VotoObrigatorio() {
		assertEquals("Carla seu voto e obrigatorio", Votacao.podeVotar("Carla", 2005));
	}
	
	@Test
	public void idadeIgual25Anos_VotoObrigatorio() {
		assertEquals("Jose seu voto e obrigatorio", Votacao.podeVotar("Jose", 1998));
	}
	
	@Test
	public void idadeIgual70Anos_VotoObrigatorio() {
		assertEquals("Ana seu voto e obrigatorio", Votacao.podeVotar("Ana", 1953));
	}
	
	@Test
	public void idadeIgual71Anos_VotoFacultativo() {
		assertEquals("Pedro seu voto e facultativo", Votacao.podeVotar("Pedro", 1952));
	}
}