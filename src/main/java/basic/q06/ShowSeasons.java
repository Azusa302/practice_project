package basic.q06;

public class ShowSeasons {
	public static void main(String[] arg) {
		int num = 1;
		for(num = 1; num <= 13; num++) {
			switch(num) {
				case 1, 2, 12:
					System.out.println(num + "月は冬です。");
					break;
				case 3, 4, 5:
					System.out.println(num + "月は春です。");
					break;
				case 6, 7, 8:
					System.out.println(num + "月は夏です。");
					break;
				case 9, 10, 11:
					System.out.println(num + "月は秋です。");
					break;
				default:
					System.out.println(num + "月は存在しないです。");
					break;
			}
		}
	}
}
