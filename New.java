package ak;
import java.util.Scanner;
public class New {
	public static void main(String...args){
		int b,c,n;
		char ch=0,cc=0,ca=0,cb=0;
		String s,s1,s2;
		Scanner arun=new Scanner(System.in);
		s=arun.nextLine();
		s1=arun.nextLine();
		s2=arun.nextLine();
		n=arun.nextInt();
		b=s.length();
		c=s1.length();
		if(b>c){
			 ch=s1.charAt(c-1);
			 System.out.println(ch+s);
			 s2=s2.substring(n-1,n)+s2.substring(s2.length()-n,s2.length()-n+1);
		     System.out.print(s2);
		}
		else if(c>b){
		   cc=s.charAt(b-1);
	       s2=s2.substring(n-1,n)+s2.substring(s2.length()-n,s2.length()-n+1);
	       System.out.print(cc+s1+s2);
			}
		if(b==c){
				ca=s.charAt(0);
				cb=s1.charAt(0);
				 if((ca)>(cb)){
					 ch=s1.charAt(c-1);
					 System.out.print(ch+s);
					 s2=s2.substring(n-1,n)+s2.substring(s2.length()-n,s2.length()-n+1);
					 System.out.print(s2);
				}
				else{
						 cc=s.charAt(b-1);
						 System.out.print(cc+s1);
						 s2=s2.substring(n-1,n)+s2.substring(s2.length()-n,s2.length()-n+1);
						 System.out.print(s2);
					 }
				 arun.close();
	}
}
}
		
		

		
			
			
		
		
		
		
	
