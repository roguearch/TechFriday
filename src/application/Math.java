package application;

public class Math {

	public int add(Integer... numbers) {
		int result = 0;
		for(int i = 0; i < numbers.length; i++) {
			result += numbers[i];
		}
		return result;
	}
	
	public int subtract(Integer... numbers) {
		return 0;
	}
	
}
