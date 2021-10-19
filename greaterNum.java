
public class greaterNum {

	public static void main(String[] args) {
		int a = 5;
		int b = 8;
		int c = 4;
		
		if (a>b && a>c) {
			System.out.print(a);
		}
		else if (b>c && b>a) {
			System.out.print(b);
		}
		else {
			System.out.print(c);
		}
	}

}
