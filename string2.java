public class string2 {
	public static void main(String[] args) {
		String a1 = "ABC";
		char[] b1 = a1.toCharArray();
		for(char c1:b1) {
			int c2 = (int)(c1)+32;  
			char c3 = (char)(c2);
			System.out.println(c3);
		}
	}
}
