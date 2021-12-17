package 参考書での学習.Refrection;

public class RefSample01 {

	public static void main(String[] args) {
//		Stringに関する情報を取得して表示する
		Class<?> infol = String.class;
		System.out.println(infol.getSimpleName()); //String
		System.out.println(infol.getName()); //java.lang.string
		System.out.println(infol.getPackage().getName());
		
		System.out.println(infol.isArray()); //false
//		Stringの親クラスの情報を取得
		Class<?> info2 = infol.getSuperclass();
		System.out.println(info2.getName()); //JAVA.lang.Object
		
		Class<?> info3 = args.getClass();
		System.out.println(info3.isArray()); //true
	}
}
