package 参考書での学習.Netjava;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.Socket;

public class Main02 {

	public static void main(String[] args) throws IOException {
		Socket sock = new Socket("dokojava.jp", 80);
		InputStream is = sock.getInputStream();
		OutputStream os = sock.getOutputStream();
		os.write("GET /index.html HTTP/1.0¥r¥n".getBytes());
		os.write("¥r¥n".getBytes());
		os.flush();
		InputStreamReader isr = new InputStreamReader(is);
		int i = isr.read();
		while (i != -1) {
			System.out.print((char)i);
			i = isr.read();
		}
		sock.close();
	}
}
//Socket sock = new Socket("dokojava.jp, 80") IPアドレスまたはポート番号を指定しインスタンス化
//InputStream is = sock.getInputStream();
//OutputStream os = sock.getOutputStream(); 入力ストリームと出力ストリームを取得
//int i = is.read();
//os.write("HeLLo"); ２つのストリームの読み書き
//sock.close(); 閉じる