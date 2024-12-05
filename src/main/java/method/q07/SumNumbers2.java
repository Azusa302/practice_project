package method.q07;

public class SumNumbers2 {
	public static void main(String[] arg) {
		int a = 5;
		double b = 3.3;
		
		int c = calculateSum(a, b);
		
		System.out.println("第一引数（整数）：" + a);
		System.out.println("第二引数（実数）：" + b);
		System.out.println("加算結果：" + c);
	}
	public static int calculateSum(int a, double b) {
		return a + (int)b;
	}
}
