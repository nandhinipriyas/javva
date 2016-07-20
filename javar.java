import java.util.Scanner;

 
public class class7 {
	public static void main(String args[] ) {
		Scanner in=new Scanner(System.in);

		String s1;
		System.out.println("enter string");
		s1=in.nextLine();
                   String reverse = new StringBuffer(s1).reverse().toString();
                    System.out.println(reverse);
                

	  
	}
}
