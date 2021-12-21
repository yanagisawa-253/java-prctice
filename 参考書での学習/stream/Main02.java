package 参考書での学習.stream;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

public class Main02 {

	public static void main(String[] args) throws IOException {
		ByteArrayOutputStream baos = new ByteArrayOutputStream();
		baos.write(65);
		baos.write(65);
		byte[] data = baos.toByteArray();
		for (byte b : data) {
			System.out.println(b);
		}
	}
}
