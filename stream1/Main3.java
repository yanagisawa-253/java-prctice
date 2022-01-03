package stream1;

import java.util.stream.Stream;

public class Main3 {
	public static void main(String[] args) {
		var str = Stream.of("Munchkin", "Siamese", "Persian", "Scottish Fold", "Tama")
		        .filter(s -> s.startsWith("S"))
		        .findFirst();
		      //orElseメソッドでnullの場合"-"に置き換える
		      System.out.println(str.orElse("－")); //Siamese
	}
}
//findFirst　ストリームからである可能性もある＝戻り値はOptional型
