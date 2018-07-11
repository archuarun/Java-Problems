package ak;
import java.util.*;
public class first {
	public static void main(String...args){
           String s;
           int i = 0,x=0,d;
           char r;
           Scanner arun=new Scanner(System.in);
           s=arun.nextLine();
          char[] ch=s.toCharArray();
          int c=ch.length;
          if(c%2==0){
          for(i=0;i<ch.length;i+=2){
        	  if(ch[i]>=65&&ch[i]<=90){  
        			  d=ch[i]-64;
        			  r=(char)(d+63);
        			  System.out.println((char) r);
        		      d=ch[i+1]-64;
        		      r=(char)(d+65);
        		  System.out.println((char)r);
        		  }
          }
     }
          else{ 
        	  for(i=0;i<c-1;i+=2){
        	  if(ch[i]>=65&&ch[i]<=90){  
    		  d=ch[i]-64;
    			  r=(char)(d+63);
    			  System.out.println((char) r);
    		   d=ch[i+1]-64;
    		   r=(char)(d+65);
    		  System.out.println((char)r);
    		  }
      }
          d=ch[i]-64;
		  r=(char)(d+63);
		  System.out.println((char) r);  
          }
          }
}

