package coding;

import java.util.Scanner;

public class Mian2 {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
//      String s = "paiza";
        String s = sc.next(); //標準入力から、次の空白文字までを文字列型で受け取り
        if (s.equals("paiza")) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }

        sc.close();
    }
}
//文字列Sが与えられます。Sがpaizaと一致する場合はYESを、一致しない場合はNOを出力してください。