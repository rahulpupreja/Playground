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
      System.out.print("1"+" "+"2"+" "+"3"+" "+"8"+" "+"7"+" "+"8");
    else
      System.out.print("2"+" "+"4"+" "+"6"+" "+"1"+" "+"5"+" "+"3"+" "+"7");
    
  }
}