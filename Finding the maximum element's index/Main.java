import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    Scanner in = new Scanner(System.in);
    int arr[] = new int[10];
    int max=0,index=0;
    int n = in.nextInt();
    for(int i = 0; i<n ; i++)
        arr[i]=in.nextInt();
    
    for(int i = 0 ; i < n ; i++)
    {
      if(arr[i]>max)
      {
        max=arr[i];
        index=i;
      }
      
    }
    
    System.out.print(index);
     
  }
}