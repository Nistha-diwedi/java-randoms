public class String3 {
	public static void main(String[] args) {
		String a2 = "abc";
		char[] b2 = a2.toCharArray();
		for(char d1:b2) {
			int d2 = (int)(d1)-32;  
			char d3 = (char)(d2);
			System.out.println(d3);
		}
	}
}
