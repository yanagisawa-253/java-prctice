package stream1;

import java.util.stream.Stream;

public class Main1 {
	public static void main(String[] args) {
		Stream.of("Munchkin", "Siamese", "Persian", "Tama")
		.forEach(v -> System.out.println(v));
	}
}
//forEachメソッドはそのまま渡す以外にラムダ式で渡すことができる
