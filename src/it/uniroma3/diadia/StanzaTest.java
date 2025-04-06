package it.uniroma3.diadia;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class StanzaTest {

	private Stanza stanzaTest;
	
	
	@BeforeEach
	void setUp() throws Exception {
		this.stanzaTest = new Stanza("ds2");
	}
	
	

	@Test
	void test() {
		fail("Not yet implemented");
	}
	
	@Test
	void hasAttrezzoTest(){
		Attrezzo matita = new Attrezzo("matita",1);
		assertTrue(this.stanzaTest.addAttrezzo(matita));
		//assertEquals(this.stanzaTest.getAttrezzo("matita"), matita);
		//assertTrue(this.stanzaTest.hasAttrezzo("matita"));
	}

}
