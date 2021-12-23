package 参考書での学習.format;

import java.io.IOException;
import java.io.Writer;

public class Main {
//情報を保存するメソッド
	public void saveHeroToFile(Hero h) throws IOException {
		Writer w = new BufferedWriter(new FileWriter("rpgsave.dat"));
		w.write(h name + "¥n"); //名前に末尾に開業をつけて保存 
		w.write(h hp + "¥n"); //HPに末尾に開業をつけて保存 
		w.write(h mp + "¥n"); //MPに末尾に開業をつけて保存 
		w.flush();
		w.close();
	}
}
