package stream1;

import java.util.stream.IntStream;

public class StreamMatch {
	public static void main(String[] args) {
		System.out.println
		(IntStream.of(1, 10, 5, -5, 12)
			.allMatch(v -> v >= 0)
				);  //false
	}
}
//特定の条件を満たすか判定する