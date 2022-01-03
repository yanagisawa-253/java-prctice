package stream1;

import java.util.stream.Stream;

public class Main2 {
	public static void main(String[] args) {
		Stream.of("Munchkin", "Siamese", "Persian", "Tama")
		.parallel()
		.forEachOrdered(v -> System.out.println(v));
//		Munchkin Siamese Persian Tama
	}
}

//forEachメソッドは並列ストリームでは順序を保証しない
//順番を守るにはforEachOrderedメソッドを使う