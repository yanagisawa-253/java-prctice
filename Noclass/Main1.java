package Noclass;
interface Foo {
	void methodA();
}

public class Main1 {
	public static void main(String[] args) {
		Foo f = new Foo() {  //変数fに匿名クラスで実装した結果を代入
			public void methodA() {  //オーバーライド
				System.out.println("methodA");
			}
		};
		f.methodA(); //実行クラスに対してメソッドの呼び出し
	}
}
