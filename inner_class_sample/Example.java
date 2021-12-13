package inner_class_sample;

public class Example {

	public static void main(String[] ages) {
		Outer outer = new Outer();
		Outer.Inner inner = outer.new Inner();
	}
}
