package coding;

public class Main16 {

	public static void main(String[] args) {
		int integer[] = new int[5];
		
		System.out.println(integer[2]);
		
		// 多次元配列の宣言と初期化
		int scores[][] = {{80, 92, 60 ,100, 78}, //　国語の得点配列
				{60, 45, 65 ,56, 80},    //　数学の得点配列
				{64, 89, 48 ,45, 67}};   //　英語の得点配列

		// 多次元配列の要素ごとに処理
		for(int i = 0; i<scores.length; i++){	   //　教科毎のfor文
			for(int j = 0; j<scores[i].length; j++){// 個人毎のfor文 
				// 個人の合計得点の保存
				integer[j] += scores[i][j];
			}
		}

		// 合計得点の表示
		for(int i = 0; i<integer.length; i++){
			System.out.println(i + "さんの合計得点 = " + integer[i]);
		}
	}
}
