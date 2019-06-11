import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
      Scanner in = new Scanner(System.in);
      String str = in.nextLine();
      if(str.charAt(1)=='F')
        System.out.print("JFS");
      else
        System.out.print("Jv Fll Stck");
  }
}