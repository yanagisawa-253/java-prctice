package 参考書での学習.FireWriter;

import java.io.FileReader;
import java.io.IOException;

public class Reader {

	public static void main(String[]  args) throws IOException {
		FileReader fw = new FileReader("rpgsave.bat");
		System.out.println("全てのデータを読んで表示します");
		int i = fw.read(); //1文字読む(int形として)
		while (i != -1) {  //これ以上読めない場合は-1
			char c = (char)i;
			System.out.print(c);
			i = fw.read();
		}
		System.out.println("ファイルの末尾に到達しました");
		fw.close();
	}
}
