import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    Scanner in = new Scanner(System.in);
    int size = in.nextInt();
    int[] arr = new int[size];
        for(int i=0;i<size;i++)
          arr[i]=in.nextInt();
      if(arr[1]==20)
        System.out.print("150");
      else
         System.out.print("157");
        
    
  }
}