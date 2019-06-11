import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    Scanner in = new Scanner(System.in); 
    int n= in.nextInt();
    int result = addnum(n);
    System.out.print(result);
    
  }
  
  public static int addnum(int n)
  {
    if(n!=0)
      return n + addnum(n-1);
    else
      return n;
    
  }
}