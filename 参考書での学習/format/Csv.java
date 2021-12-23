package 参考書での学習.format;

import java.io.FileReader;

public class Csv {
//commons-csv　利用例
	public static void main(String[] args) throws Exception {
		FileReader fr = new FileReader("rpgdata.csv");
		Iterable<CSVRecord> records = CSVFormat.DEFAULT.parse(fr);
		for (CSVRecord r : records) {
			String name = r.get(0);
			String hp = r.get(0);
			String mp = r.get(0);
			System.out.println(name + "/" + hp + "/" + mp);
		}
		fr.close();
	}
}
