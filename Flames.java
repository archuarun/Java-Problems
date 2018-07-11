package ak;
import java.util.Scanner;
public class flames {
	public static void main(String []args){
		int b,i,j;
		String s,s1,s2="flames";
		System.out.println("enter the first name");
		Scanner arun=new Scanner(System.in);
		s=arun.next().replace(" ","");
		System.out.println("enter the second name");
		s1=arun.next().replace(" ","");
		if(!s.equalsIgnoreCase(s1))
		{
			for(i=0;i<s.length();i++){
				 for(j=0;j<s1.length();j++){
					 if(s.charAt(i)==s1.charAt(j)){
						 s=s.substring(0,i)+s.substring(i+1,s.length());
						 s1=s1.substring(0,j)+s1.substring(j+1,s1.length());
						 i--;
						 break;
				}
			}
		}
		int d=s.length()+s1.length(); 
		//	System.out.println(d);
		while(s2.length()>1){
			if(d>s2.length()){
				if(d%s2.length()==0){
					b=s2.length();
				}
					else{
						b=d%s2.length();
					}}
				else
					b=d;
			        s2=s2.substring(b,s2.length())+s2.substring(0,b-1);}
			switch(s2)
			{
			case "f":
			{
				System.out.println("Friends");
				break;}
			case "l":
			{
				System.out.println("L0ve");
				break;}
			case "a":
			{
				System.out.println("Affection");
				break;
			}
			case "m":
			{
				System.out.println("Marriage");
				break;
			}
			case "e":
			{	System.out.println("Engagement");
				break;
			}
			case "s":
			{
				System.out.println("Sister");
				break;
			}}
		}
			else
				{System.out.println("not valid");
				arun.close();
				}
				}
		}


