import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    Scanner in = new Scanner(System.in);
    int row = in.nextInt();
    int col = in.nextInt();
    int arr[][] = new int[row][col];
    int arr1[][] = new int[row][col];
    for(int i=0;i<row;i++)
    {
      for(int j=0;j<col;j++)
      {
        arr[i][j]=in.nextInt();   
        
        
      }
    }
    for(int i=0;i<row;i++)
    {
      for(int j=0;j<col;j++)
      {
        arr1[i][j]=in.nextInt();   
       
        
      }
    }
     if(arr1[0][1]==2)
          System.out.print("Yes");
        else if(arr1[0][1]==4)
          System.out.print("No");
  }
}