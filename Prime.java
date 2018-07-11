package ak;
public class Prime {
	public static void main(String...args){
		int i=0,j,c;
		System.out.println("Prime Numbers:");
		for(i=0;i<=100;i++){
			c=0;
			for(j=i;j>=1;j--)
			{
			if(i%j==0)
			{
			  c++;
				}
			}
			if(c==2)
			{
				
			    System.out.print(i+" ");
		}
	}
}
	
}