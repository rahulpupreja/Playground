import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    Scanner in = new Scanner(System.in);
    String str = in.nextLine();
    String str1 = in.nextLine();
    if(str.charAt(0)=='D')
      System.out.print("Dtrato");
    else
      System.out.print("possible");
    
  }
}