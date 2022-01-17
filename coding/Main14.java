package coding;

class Info {
	String name;
	int age;
}

public class Main14 {

	public static void main(String[] args) {
		Info info = new Info();
		info.name = "Taro Yamada";
		info.age = 30;
		
		System.out.println(info.name + ", " + info.age);
	}
}