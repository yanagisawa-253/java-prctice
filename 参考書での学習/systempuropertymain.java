package 参考書での学習;

public class systempuropertymain {

	public static void main(String[] args) {
		String ver = System.getProperty("rpg.version");
		String author = System.getProperty("rpg.author");
		System.out.println("RPG: スッキリ魔王討伐 ver" + ver);
		System.out.println("Developed by" + author);
		
		final String BR = System.getProperty("line.separator");
		 System.out.println("本日は" + BR + "晴天なり");
	}
}
