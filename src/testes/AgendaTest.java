package testes;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import lab03.Agenda;

class AgendaTest {
	private Agenda agendaBasico;
	@BeforeEach
	public void criaAgenda() {
		this.agendaBasico = new Agenda();
	}
	@Test
	void testCadastraContato() {
		
	}

	@Test
	void testExibirContato() {
		fail("Not yet implemented");
	}

	@Test
	void testToString() {
		fail("Not yet implemented");
	}

}
