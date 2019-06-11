import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    Scanner in =new Scanner(System.in);
    int num=in.nextInt();
    int rem1=num%10;
    int q1=num/10;
    int rem2=q1%10;
    int q2=q1/10;
    int sum=(rem1*100)+(rem2*10)+q2;
    System.out.println(sum);
    
  }
}