package stream1;

import java.util.stream.Stream;

public class ToArray {
	public static void main(String[] args) {
		var list = Stream.of("Munchkin", "Siamese", "Persian", "Scottish Fold", "Tama")
			.filter(s -> s.startsWith("s"))
			.toArray();
		System.out.println(list[0]);
	}
}
//toArray ストリーム処理結果を文字配列として取得