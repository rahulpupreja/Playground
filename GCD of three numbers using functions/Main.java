import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    Scanner  in = new Scanner(System.in);
      	int n1 = in.nextInt();
      	int n2 = in.nextInt();
      	int n3 = in.nextInt();
        int gcd = gcd(n1,n2);
         if(n3%gcd==0)
      	System.out.print(gcd);
		
	}
  
  public static int gcd(int n1, int n2)
  {
    		int min=0,gcd;
    		if(n1>n2)
               min=n2;
    	  else
              min=n1;
    
       while(true)
       {
         	if(n1%min==0 && n2%min==0)
            {
              gcd=min;
              break;
              
            }
         
         min--;           
  
  }
    
    return gcd;
}
}