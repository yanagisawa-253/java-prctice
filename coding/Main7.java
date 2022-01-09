package coding;

public class Main7 {

	public static void main(String[] args) {
		int i = 1;
		while (i <= 10) {
			if (i % 5 == 0) {
				break;
			}
			System.out.println(i);
			i++;
		}
		
		for (int j = 1; j <= 10; j++) {
			if (j % 3 == 0) {
				continue;
			}
			System.out.println(j);
		}
	}
}
