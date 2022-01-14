package coding;

public class Main10_1 {

	public static void main(String[] args) {
		String bar = null;
 
		if ("Orange".equals(bar)) {
			System.out.println("一緒です。");
		} else {
			System.out.println("違います。");
		}
	}
}
//定数がnullということはないのでNullPointer例外で動作しなくなる可能性を回避