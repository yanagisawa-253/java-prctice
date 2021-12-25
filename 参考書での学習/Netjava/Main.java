package 参考書での学習.Netjava;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;

public class Main {

	public static void main(String[] args) throws IOException {
		URL url = new URL("https://dokojava.jp");
		InputStream is = url.openStream();
		InputStreamReader isr = new InputStreamReader(is);
		int i = isr.read();
		while (i != -1) {
			System.out.print((char)i);
			i = isr.read();
		}
		isr.close();
	}
}

// WEbコンテンツの取得
//URL url = new URL ("http://dokojava .jp"); インスタンス化
//InportStream is = url。オペn Stream();データを取り出すストリームの取得
//int data = is.read(); ストリームから１バイトづつ情報を取り出す
