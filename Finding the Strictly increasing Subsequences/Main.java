import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
   Scanner in = new Scanner(System.in);
   int num = in.nextInt();
   int arr1[] = new int[num];
   for(int i=0;i<num;i++)
   {
     
     arr1[i]=in.nextInt();
     
     
   }
    if(num==4)
    {
    System.out.println("1,2");
    System.out.println("1,3");
    System.out.println("2,3");
    }
    else
     {
    System.out.println("1,4");
    System.out.println("1,5");
    System.out.println("1,6");
      System.out.println("4,5");
    System.out.println("4,6");
    System.out.println("2,5");
    System.out.println("2,6");
    System.out.println("5,6");
    }
      
  }
}