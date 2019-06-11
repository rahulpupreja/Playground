import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    Scanner in = new Scanner(System.in);
        int num = in.nextInt();
      	int num1 = num;
      	int i=0,sum=0,prod=1,rem1=0;
        for(i=1 ; num1>0; i++)
        {
              num1=num1/10;
        }
      	i--;
      	num1=num;
       for(int j=1;num1!=0;j++)
       {
         rem1=num1%10;
         num1=num1/10;
         for(int k=1;k<=i;k++)
         {
           prod=prod*rem1;  
         // System.out.println(prod);
         }
         sum+=prod;
         prod=1;
         
       }
     // System.out.println(sum);
      if(sum==num)
      System.out.println("Armstrong Number");
      else
      System.out.println("Not a Armstrong Number");
	}
}