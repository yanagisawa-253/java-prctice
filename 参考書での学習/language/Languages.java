package 参考書での学習.language;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class Languages {

	public static void main(String[] args) {
		Locale loc = Locale.getDefault();
		System.out.println(loc.getCountry() + "-" + loc.getDisplayLanguage());
		String now = (new SimpleDateFormat()).format(new Date());
		if (loc.getLanguage().equals("ja")) {
			System.out.println("現在の時刻は" + now);
		} else {
			System.out.println("Current time is " + now);
		}
	}
}
