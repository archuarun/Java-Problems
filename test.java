package ak;

import java.util.Scanner;

public class test {
	public static void main(String...arg)
	{
		int c=0,i,j,p=0;
		String[] ak=new String[100];
		String S1 ="";
		System.out.println("enter the name");
		Scanner as=new Scanner(System.in);
		String arun=as.next();
		int a = arun.length();
		System.out.println("length is=" +a);
		as.close();
			for(i=0;i<a;i++)
			{
			for(j=i+2;j<=a;j++)
			{
				ak[p]=arun.substring(i,j);
				c++;
				System.out.println(ak[p]+" ");
				S1=S1+ak[p];
				p++;
				}}
			
			System.out.println(c);
			
			System.out.println("\n"+S1);
			
			
}
}
	

		
		
