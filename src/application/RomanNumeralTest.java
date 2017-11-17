package application;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class RomanNumeralTest {
	RomanNumeral romanNumeral;
	@BeforeEach
	void setUp() throws Exception {
		romanNumeral = new RomanNumeral();
	}

	@Test
	void testGetDecimal() {
		String roman = "I";
		assertEquals(1, romanNumeral.getDecimal(roman));
		
		roman = "V";
		assertEquals(5, romanNumeral.getDecimal(roman));
		
		roman = "X";
		assertEquals(10, romanNumeral.getDecimal(roman));
		
		roman = "VI";
		assertEquals(6, romanNumeral.getDecimal(roman));
		
		roman = "IV";
		assertEquals(4, romanNumeral.getDecimal(roman));
		
		roman = "VII";
		assertEquals(7, romanNumeral.getDecimal(roman));
		
		roman = "VIII";
		assertEquals(8, romanNumeral.getDecimal(roman));
		
		roman = "III";
		assertEquals(3, romanNumeral.getDecimal(roman));
		
		roman = "IX";
		assertEquals(9, romanNumeral.getDecimal(roman));
		
		roman = "XI";
		assertEquals(11, romanNumeral.getDecimal(roman));
		
		roman = "XXXII";
		assertEquals(32, romanNumeral.getDecimal(roman));
		
		roman = "XXIX";
		assertEquals(29, romanNumeral.getDecimal(roman));
		
		roman = "XLIX";
		assertEquals(49, romanNumeral.getDecimal(roman));
	}

}
