package method.q05;

public class Triangle {
	public static void main(String[] arg) {
		int a = 8;
		int b = 5;
		int c = getTriangleArea(a, b);
		
		System.out.println("底辺："+ a);
		System.out.println("高さ："+ b);
		System.out.println("三角形の面積："+ c);
	}
	public static int getTriangleArea(int a, int b) {
		return a * b / 2;
	}
}
