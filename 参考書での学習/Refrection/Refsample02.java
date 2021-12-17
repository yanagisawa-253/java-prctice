package 参考書での学習.Refrection;

public class Refsample02 {

	public int times = 0;
	public  Refsample02(int t) { //error
		this.times = t;
	}
	public void hello(String mag) {
		this.hello(mag, this.times);
	}
	public void hello(String mag, int t) {
		System.out.println("Hello, " + mag + " x" + t);
	}
}
