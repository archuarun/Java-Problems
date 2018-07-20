package ak;
import java.util.Scanner;
public class Wifi {
	public static void main(String...args){
		int a,i,b,sum=0,sum1=0;
		String f,l,s2,s3,s1;
		Scanner arun=new Scanner(System.in);
		a=arun.nextInt();
		f=arun.next();
		l=arun.next();
		String s=String.valueOf(a);
		s1=s.substring(1,2);
		char ch=l.charAt(l.length()-1);
		s2=s.substring(2,3);
	     s3="";
		switch(s2)
		{
		case "1":
		{
			s3="!";
			break;}
		case "2":
		{
			s3="@";
			break;}
		case "3":
		{
			s3="#";
			break;}
		case "4":
		{
			s3="$";
			break;}
		case "5":
		{
			s3="%";
			break;}
		case "6":
		{
			s3="^";
			break;}
		case "7":
		{
			s3="&";
			break;}
		case "8":
		{
			s3="*";
			break;}
		case "9":
		{
			s3="(";
			break;}
		case "10":
		{
			s3=")";
			break;}
		}
		while(a!=0){
			b=a%10;
			sum=sum+b;
			a/=10;
		}
		while(sum!=0){
			b=sum%10;
			sum1=sum1+b;
			sum/=10;
		}
		if(sum1%2==0){
			sum1=sum1;
		}
		else if(sum1%2!=0){
			sum1=sum1-1;
		}
		else if(sum1==1){
			sum1=2;
		}
		System.out.println(sum1+s3+ch+s1);
	arun.close();
		}
}

