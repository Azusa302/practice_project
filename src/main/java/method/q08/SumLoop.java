package method.q08;

public class SumLoop {
	public static void main(String[] arg) {
		int min, max;
		min = 1;
		max = 100;
		
		System.out.println("最小値：" + min);
		System.out.println("最大値：" + max);
		
		int sum = 0;
		for(int i = min; i <= max; i++) {
			sum+=i;
		}
		System.out.println("加算結果：" + sum);
		
	}
	
}
