package 参考書での学習.FireWriter;

import java.io.FileOutputStream;
import java.io.IOException;

public class binary01 {

	public static void main(String[] args) throws IOException {
		FileOutputStream fos = 
				new FileOutputStream("rpgsave.bat", true);
		fos.write(65); //2進数で0100001
		fos.flush();
		fos.close();
	}
}
