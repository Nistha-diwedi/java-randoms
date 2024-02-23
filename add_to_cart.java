import java.util.*;
public class add_to_cart {
	public static void main(String[] args) {
		int total_qty_a = 0;
		int total_qty_b = 0;
		int total_qty_c = 0;
		int a_qty = 100, b_qty = 100, c_qty = 100;
		boolean yn = true;
		int ap = 2, bp = 3, cp = 4;
		
		while(yn){
			Scanner sc = new Scanner(System.in);
			System.out.println("enter qty of a : ");
			int a = sc.nextInt();
			if(a<=a_qty) {
				total_qty_a = total_qty_a + a;
				a_qty = a_qty - a;
			}
			else {
				System.out.println("invalid");
			}
			System.out.println("available qty of a: "+a_qty);
			
			System.out.println("enter qty of b : ");
			int b = sc.nextInt();
			if(b<=b_qty) {
				total_qty_b = total_qty_b + a;
				b_qty = b_qty - b;
			}
			else {
				System.out.println("invalid");
			}
			System.out.println("available qty of b: "+b_qty);
			
			System.out.println("enter qty of c : ");
			int c = sc.nextInt();
			if(c<=c_qty) {
				total_qty_c = total_qty_c + c;
				c_qty = c_qty - c;
			}
			else {
				System.out.println("invalid");
			}
			System.out.println("available qty of c: "+c_qty);
			
			System.out.println("do you want to continue say y/n: ");
			String s = sc.next();
			if(s.equals("y")){
				yn = true;
			}
			else {
				yn = false;
			}
			
		}
		System.out.println("the final qty of product a = " +total_qty_a+ "and final price = " + total_qty_a*ap);
		System.out.println("the final qty of product b = " +total_qty_b+ "and final price = " + total_qty_b*bp);
		System.out.println("the final qty of product c = " +total_qty_c+ "and final price = " + total_qty_c*cp);
		System.out.println("the final price of all the quantities are = " + (total_qty_a*ap + total_qty_b*bp + total_qty_c*cp));
	}
}
