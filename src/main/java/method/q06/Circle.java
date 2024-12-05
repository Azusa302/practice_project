package method.q06;

public class Circle {
	public static void main(String[] arg) {
		double a = 5.0;
		double c = getCircleArea(a);
		
		System.out.println("半径：" + a);
		System.out.println("円の面積：" + c);
	}
	public static double getCircleArea(double a) {
		return a * a * 3.14;
	}
}
