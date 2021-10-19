
public class reverseStr {
	
	public static void main(String[] args) {
		String s = "abcdefgfggbfh";
		int n = s.length();
		for (int i = n-1; i >= 0; i--) {
			System.out.print(s.charAt(i));
		}
	}

}
