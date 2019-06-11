import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    Scanner in = new Scanner(System.in);
    int row = in.nextInt();
    int col = in.nextInt();
    int arr[][] = new int[row][col];
     int transpose[][] = new int[row][col];
    for(int i=0;i<row;i++)
    {
      for(int j=0;j<col;j++)
      {
        arr[i][j]=in.nextInt();
        transpose[j][i]=arr[i][j];
        
      }
    }
    int first_row=0;
    int last_row=row-1;
    int temp=0;
    for(int i=0;i<col;i++)
    {
      temp=transpose[first_row][i];
       transpose[first_row][i]=transpose[last_row][i];
      transpose[last_row][i] = temp; 
      
    }
    for(int i=0;i<row;i++)
    {
      for(int j=0;j<col;j++)
      {
        
        System.out.print(transpose[i][j]+" ");
        
      }
      System.out.println();
      
      
    }
  }
}