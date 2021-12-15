package 参考書での学習;

import java.util.Iterator;
import java.util.Properties;

public class systemproperty {

	public static void main(String[] args) {
		System.out.print("利用中のバージョン");
		System.out.println(System.getProperty("java.version"));
		
		Properties p = System.getProperties();
		Iterator<String> i = p.stringPropertyNames().iterator();
		System.out.println("システムプロパティー覧");
		while (i.hasNext()) {
			String key = i.next();
			System.out.print(key + " = ");
			System.out.println(System.getProperty(key));
		}
		
	}
}
