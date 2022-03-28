package JunitUPL;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TasTest {
	Tas Nika = new Tas("Biru", "Katun");
	
	@Test
	void testGetwarnaDasar() {
		String expected = "Biru";
		String actual = Nika.getwarnaDasar();
		assertEquals(expected,actual);
	}

	@Test
	void testGetBahan() {
		String expected = "Katun";
		String actual = Nika.getBahan();
		assertEquals(expected,actual);
	}

}
