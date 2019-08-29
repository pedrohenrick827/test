package testes;

import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import lab03.Contato;

class ContatoTest {
	private Contato contatoBasico;

	@BeforeEach
	public void criaContato() {
		this.contatoBasico = new Contato("Pedro", "Henrick", "(83)9 8623-3789");
    }

	@Test
	void testContato() {
		fail("Not yet implemented");
	}

	@Test
	void testToString() {
		fail("Not yet implemented");
	}

}
