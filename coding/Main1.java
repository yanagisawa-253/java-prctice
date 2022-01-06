package coding;

public class Main1 {

	public static void main(String[] args) {
		int i = 0;
        int loopCount = 100;
        int numFizz = 3;
        int numBuzz = 5;
        String Fizz = "FIzz";
        String Buzz = "Buzz";
        
        for (i = 1; i <= loopCount; i++) {
        	if (i % (numFizz * numBuzz) ==0) {
        		System.out.println(Fizz + Buzz);
        	} else if (i % numFizz == 0) {
        		System.out.println(Fizz);
        	} else if (i % numBuzz == 0) {
        		System.out.println(Buzz);
        	} else {
        		System.out.println(i);
        	}
        	
        }
	}
}

// FizzBuzz問題　３＆５でFizzBuzz ,３でFizz,５でBuzz