import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
      Scanner in = new Scanner(System.in);
      String str = in.nextLine();
      if(str.charAt(0)=='J')
        System.out.print("Java full stack");
      else
        System.out.print("I AM STRONG");
  }
}