import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    Scanner in =new Scanner(System.in);
      	int num = in.nextInt();
      	int num1=num;
      	int sum=0,fact=1,rem1=0;
      	for(int i=1;num1!=0;i++)
        {
         	rem1=num1%10;
          	num1=num1/10;
          	for(int j=1; j<=rem1;j++)
              fact=fact*j;
           sum+=fact;
          fact=1;
        }
      if(sum==num)
        System.out.println("Yes");
      else
        System.out.println("No");
       
	}
}