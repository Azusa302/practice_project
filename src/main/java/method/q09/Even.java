package method.q09;

public class Even {
	public static void main(String[] arg) {
		int a = 5;
		
		int n = checkEven(a);
		
		if(n % 2 == 1) {
			System.out.println(n + "は奇数です。");
		} else {
			System.out.println(n + "は偶数です。");
		}
	}
	
	public static int checkEven(int n) {
		return n;
	}
}
