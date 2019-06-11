import java.util.Scanner;
class Main {
	public static void main (String[] args){
	    Scanner in=new Scanner(System.in);
      	int num = in.nextInt();
      	int count=0,count1=0;
      	int num1=num;
      	while(num1!=0)
        {
           num1=num1/10;
          count++;
        }
      int count2=count-2;
      while(count1!=count2)
      {
        num=num/10;
        count1++;
      }
      num=num%10;
      System.out.println(num);

	}
}