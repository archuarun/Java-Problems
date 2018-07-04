package ak;

import java.util.Scanner;

public class large {
	public static void main(String...args)
	{
	int a,b,c,d;
	System.out.println("enter the number");
	Scanner ak=new Scanner(System.in);
	a=ak.nextInt();
	b=ak.nextInt();
	c=ak.nextInt();
	d=ak.nextInt();
	if(a>=b&&a>=c&&a>=d){
			System.out.println("a is largest");
		}
		if(b>=a&&b>=c&&b>=d){
			System.out.println("b is largest");
		}
		if(c>=a&&c>=b&&c>=d){
			System.out.println("c is largest");
		}
 		else{
			System.out.println("d is largest");
		}
			ak.close();
	}
}

