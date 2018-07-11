package ak;

import java.net.SocketTimeoutException;
import java.util.Scanner;

public class palindrome {
	public static void main(String...args){
		int n,r,sum=0,temp;
		System.out.println("enter the number");
		Scanner arun=new Scanner(System.in);
		n=arun.nextInt();
		temp=n;
		while(n>0){
			r=n%10;
			sum=(sum*10)+r;
			n=n/10;
			arun.close();
		}
		if(temp==sum)
			System.out.println("palindrome");
		else
			System.out.println("it is not palindome");
		}
	
		
    
	}


