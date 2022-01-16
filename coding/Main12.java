package coding;

public class Main12 {

	public static void main(String[] args) {
        Integer num = new Integer(1);
        //　配列の生成
        int row[] = new int[3];
 
        // Integerクラスのインスタンスか否かの比較
        if (num instanceof Integer) {
            System.out.println("num　はIntegerクラスのインスタンスです");
        }
 
        // int型配列か否かの比較
        if (row instanceof int[]) {
            System.out.println("row　はint型の配列です");
        }
 
    }
}
