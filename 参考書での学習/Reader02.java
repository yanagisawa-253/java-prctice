package 参考書での学習;

import java.io.FileWriter;
import java.io.IOException;

public class Reader02 {
// [finally]一度tryブロックの処理が行われたら例外が発生しても必ず実行する
	public static void main(String[] args) {
		FileWriter fw = null;
		try {
			fw = new FileWriter("rpgsave.dat", true);
			fw.write('A');
			fw.flush();
		} catch (IOException e) {
			System.out.println("ファイル書き込みエラー");
		} finally {
			if (fw != null) {
				try {
					fw.close();
				} catch (IOException e2) { }
			}
		}
	}
}
