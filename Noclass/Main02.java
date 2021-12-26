package Noclass;

public class Main02 {

	public static void main(String[] args) {
//		Fruit flt = Fruit.ORANGE;               //enumを取得
//      System.out.println( flt.toString() );   //ORANGE
		Fruit frt = Fruit.APPLE;
		System.out.println(frt.getLabel());
		
		System.out.println(Fruit.PEACH.getId());
	}
}
