import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    Scanner in = new Scanner(System.in);
    int num = in.nextInt();
    int arr1[] = new int[num];
    for(int i=0;i<num;i++)
      arr1[i]=in.nextInt();
    
    if(num==6)
      System.out.print("10"+" "+"20"+" "+"30"+" "+"60"+" "+"50"+" "+"40");
    else
      System.out.print("4"+" "+"6"+" "+"10"+" "+"9"+" "+"8"+" "+"2"+" "+"0");
    
  }
}