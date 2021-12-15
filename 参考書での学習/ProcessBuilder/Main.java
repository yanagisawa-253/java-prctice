package 参考書での学習.ProcessBuilder;

public class Main {

	public static void main(String[] args) throws Exception {
		System.out.println("計算を開始");
		int a = 976;
        int b = 427;
//        計算処理
		System.out.println("完了しました");
		ProcessBuilder pb = new ProcessBuilder(
				"c:¥¥windows¥¥system32¥¥notepad.exe",
				"calcreport.txt");
		pb.start();
	}
}
