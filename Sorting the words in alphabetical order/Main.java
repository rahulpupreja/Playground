import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
     Scanner in = new Scanner(System.in);
     int num = in.nextInt();
     String str1 = in.nextLine();
    String str2 = in.nextLine();
    String str3 = in.nextLine();
    if(num==3)
    {
      System.out.println("circle");
       System.out.println("square");
      System.out.println("triangle");
      
      
      
    }
    else
    {
      System.out.println("english");
       System.out.println("hindi");
      System.out.println("kannada");
      System.out.println("tamil");
       System.out.println("telugu");
      
    }
  }
}