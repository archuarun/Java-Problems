package ak;
import java.util.Scanner;
public class alphabets {
	public static void main(String...arg){
	int i,c=0,p=0;
	String s;
	System.out.println("enter the name");
	Scanner arun=new Scanner(System.in);
	s=arun.nextLine();
	for(i=0;i<s.length();i++){
		if(Character.isUpperCase(s.charAt(i))){
			c++;
		}
		else
			p++;
	}
	System.out.println("Total no of UpperCase:" +c);
	System.out.println("Total no of LowerCase:" +p);
		}
	}

