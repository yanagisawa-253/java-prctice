package inner_class_sample;

public class Example {

	public static void main(String[] ages) {
		Outer outer = new Outer();
		Outer.Inner inner = outer.new Inner(); //別のクラスCからインスタンス化
	}
	
	public static void main(String[] args) {
        Outer outer = new Outer(); // クラスOuterをインスタンス化
        Outer.Inner inner = new Outer.Inner(); // staticな内部クラスBをインスタンス化
    }
}
