package 参考書での学習.stream;

import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.zip.GZIPOutputStream;

public class practice02 {

	public static void main(String[] args) {
		if (args.length != 2) {
			System.out.println("起動パラメータの指定が不正です");
			return;
		}
		String inFile = args[0];
		String outFile = args[1];
		
		try (
			FileInputStream fis = new FileInputStream(inFile);
			FileOutputStream fos = new FileOutputStream(outFile);
			BufferedOutputStream bos = new BufferedOutputStream(fos);
			GZIPOutputStream gzos = new GZIPOutputStream(bos);
				) {
			int i = fis.read();
			while (i != -1) {
				gzos.write(i);
				i = fis.read();
			}
			gzos.flush();
		} catch (IOException e) {
			System.out.println("ファイル処理に失敗");
		}
	}
}
