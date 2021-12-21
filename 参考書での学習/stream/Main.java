package 参考書での学習.stream;

import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;

public class Main {

	public static void main(String[] args) throws IOException {
		String msg = "第一土曜日はゴミ回収の日";
		Reader sr = new StringReader(msg);
		System.out.print((char)sr.read());
		System.out.print((char)sr.read());
		System.out.print((char)sr.read());
		System.out.print((char)sr.read());
		System.out.print((char)sr.read());
		System.out.print((char)sr.read());
		System.out.print((char)sr.read());
		System.out.print((char)sr.read());
		System.out.print((char)sr.read());
		System.out.print((char)sr.read());
		System.out.print((char)sr.read());
		System.out.print((char)sr.read());  //消すと実行処理が変わる
	}
}
