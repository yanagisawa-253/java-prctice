package coding;



public class Main14_2 {

	public static void main(String[] args) {
		Info[] arr_info = new Info[3];
		
		for(int i = 0; i < arr_info.length; i++) {
			arr_info[i] = new Info(); 
		}
		
		arr_info[0].name = "Taro Yamada";
		arr_info[0].age = 30;
		
		arr_info[1].name = "Hanako Sato";
		arr_info[1].age = 20;
		
		arr_info[2].name = "Ichiro Yamamoto";
		arr_info[2].age = 10;
		
		System.out.println(arr_info[0].name + "、" + arr_info[0].age);
		System.out.println(arr_info[0].name + "、" + arr_info[1].age);
		System.out.println(arr_info[0].name + "、" + arr_info[2].age);
	}
}
