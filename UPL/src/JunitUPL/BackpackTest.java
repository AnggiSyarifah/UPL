package JunitUPL;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class BackpackTest {
	
	Backpack Hagen = new Backpack("Hijau", "Denim", 3);
	
	@Test
	void testGetJumlahKantong() {
		int expected = 3;
		int actual = Hagen.getJumlahKantong();
		assertEquals(expected,actual);
	}
	
	@Test
	void testHitungDiskon() {
		double expected = 18.96;
		double actual = Hagen.hitungDiskon();
		assertEquals(expected,actual);
	}
	
	@Test
	void testHitungHargaJual() {
		double expected = 482.0;
		double actual = Hagen.hitungHargaJual();
		assertEquals(expected,actual);
	}
}