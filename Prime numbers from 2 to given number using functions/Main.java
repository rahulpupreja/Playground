import java.util.Scanner;
class Main{
  public static void main(String args[]){
    Scanner in = new Scanner(System.in);
    int num = in.nextInt();
    primeno(num);
  }
  public static void primeno(int num)
  {
     int count=0;
    for(int i=2 ; i<=num ; i++)
    {
       for(int j=1;j<=i;j++)
       {
         if(i%j==0)
           count++;
       }
    if(count==2)
      System.out.println(i);
     count=0;
    }
  }
}
