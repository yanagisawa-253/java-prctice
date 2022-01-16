package coding;

public class Main13 {

	public static void main(String[] args) {
        int year;
 
        year = 2016;
 
        if ((year % 4 == 0) || (year % 4 == 2)) {
            System.out.println(year + "年は、夏季もしくは冬季のオリンピック開催年です！");
        } else if (!(year % 4 == 0) && !(year % 4 == 2)) {
            System.out.println(year + "年は、オリンピック開催年ではありません！");
        } else {
        }
 
        year = 2017;
 
        if ((year % 4 == 0) || (year % 4 == 2)) {
            System.out.println(year + "年は、夏季もしくは冬季のオリンピック開催年です！");
        } else if (!(year % 4 == 0) && !(year % 4 == 2)) {
            System.out.println(year + "年は、オリンピック開催年ではありません！");
        } else {
        }
 
    }
}
