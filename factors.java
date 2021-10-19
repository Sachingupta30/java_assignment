
public class factors {

	public static void main(String[] args) {
		int num = 100;
		for (int i = 1; i <= num/2+1; i++) {
			if (num%i == 0) {
				System.out.println(i);
			}
		}
		System.out.println(num);

	}

}
