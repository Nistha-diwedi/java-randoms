public class vowel {
	public static void main(String[]args) {
		String s = "sandeep";
		int a = 0, e = 0, i = 0, u = 0, o = 0;
		char[] c1 = s.toCharArray();
		for(char c2:c1) {
			if(c2 == 'a') {
				a = a + 1;
			}
			if(c2 == 'e') {
				e = e + 1;
			}
			if(c2 == 'i') {
				i = i + 1;
			}
			if(c2 == 'o') {
				o = o + 1;
			}
			if(c2 == 'u') {
				u = u + 1;
			}
		}
		System.out.println("the count of a = "+a);
		System.out.println("the count of e = "+e);
		System.out.println("the count of i = "+i);
		System.out.println("the count of o = "+o);
		System.out.println("the count of u = "+u);
	}
}
