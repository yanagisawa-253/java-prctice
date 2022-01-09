package coding;

public class Main8java {

	public static void main(String[] args) {
		int[] numbers = {1, 4, 6, 9, 13, 16};
		
		int oddSum = 0;
		int addSum = 0;
		
		for (int number : numbers) {
			if (number % 2 == 0) {
				oddSum += number;
			} else {
				addSum += number;
			}
		}
		System.out.println("偶数の合計は" + oddSum);
		System.out.println("偶数の合計は" + addSum);
	}
}
