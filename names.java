package ak;

import java.util.Scanner;

public class names{
	public static void main(String...args){
		String s,s1,c;
		Scanner arun=new Scanner(System.in);
		s=arun.nextLine();
		int a=s.length();
	//	char[] ch=s.toCharArray();
		for(int i=0;i<=a;i++){
			//s=(s.substring(i,s.length())+s.charAt(0));
			for(int j=1;j<a-1;j++){
				if(s.charAt(i)==s.charAt(j)){
				s=(s.substring(j,a)+s.charAt(0));
					i--;
				}
				else 
				System.out.println(s);
			}
		}
	}
}
			//s1=(s.charAt(1))+s.substring(2,s.length())+s.charAt(0);
			