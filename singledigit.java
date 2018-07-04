package ak;
import java.util.Scanner;
public class singledigit {
	public static void main(String[] args) {
		int a,i,count=0,m=0,n = 0,p=0,j;
		Scanner arun=new Scanner(System.in);
		a=arun.nextInt();
		String s=String.valueOf(a);
		int[] b=new int[s.length()];
		for(i=0;i<b.length;i++){
			b[i]=Character.getNumericValue(s.charAt(i));
			//System.out.println(b[i]);
		}
			int[] c=new int[b.length];
			int d=c.length;
			while(d!=2){
			for(i=0;i<d-1;i++){
			b[i]=b[i]-b[i+1];
			 b[i]=Math.abs(b[i]);
			}
			d--;
			}
			System.out.println(b[i]);
	}
}
			
	
