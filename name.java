package ak;
import java.util.Scanner;
public class name {
	public static void main(String...args){
		String s1;
		Scanner arun=new Scanner(System.in);
		s1=arun.next();
		int x=s1.length();
		String[] s=new String[x];
		for(int i=0;i<x;i++){
			s[i]=s1.substring(i+1,x)+s1.substring(0,i+1);
		}
		for(int j=0;j<x;j++)
		{
			System.out.println(s[j]);
		}
		arun.close();
	}
}
		
