import java.util.Scanner;
class Main {
	public static void main (String[] args){
	    Scanner in=new Scanner(System.in);
      int num=in.nextInt();
      int num1=num;
      int sum=0,rem1=0;
      while(num1!=0)
      {
        rem1=num1%10; 
        num1=num1/10;
        sum=sum+rem1;
         
      }
      
      System.out.println(sum);
      
	}
}