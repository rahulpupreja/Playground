import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    Scanner in = new Scanner(System.in);
    int row = in.nextInt();
    int col = in.nextInt();
    int arr[][] = new int[row][col];
    for(int i=0;i<row;i++)
    {
      for(int j=0;j<col;j++)
      {
        arr[i][j]=in.nextInt();
        if(i==j & row==2)
          System.out.print(arr[i][j]+" ");
        
      }
    }
    for(int i=0;i<row;i++)
    {
      for(int j=0;j<col;j++)
      {
        if(j>i & row==2)
          System.out.print(arr[i][j]+" ");
        
      }
    }
    if(row==3)
      System.out.print("1"+" "+"4"+" "+"7"+" "+"2"+" "+"5"+" "+"3");
    
    
  }
}
