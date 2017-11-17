package application;

import java.util.HashMap;

public class RomanNumeral {
	
	public int getDecimal(String roman) {
		HashMap<Character, Integer> romans = new HashMap<>();
		romans.put('I', 1);
		romans.put('V', 5);
		romans.put('X', 10);
		romans.put('L', 50);
		
		int previous = 0;
		int dec = 0;
		for(int i = roman.length() - 1; i >= 0; i--) {
			int number = romans.get(roman.charAt(i));
			if (number > previous || number == previous)
				dec += number;
			else
				dec -= number;
			previous = number;
		}
		
		return dec;
	}

}
