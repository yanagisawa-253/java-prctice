package 参考書での学習.FireWriter;

import java.io.FileWriter;
import java.io.IOException;

public class Main {

	public static void main(String[] args) throws IOException {
		FileWriter fw = new FileWriter("c:¥¥rpgsave.dat", true); //インスタンス化
		fw.write('A');
		fw.flush();
		fw.close();
	}
}
