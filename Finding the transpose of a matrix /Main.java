import java.util.Scanner;
class Main{ 
  public static void main(String args[]) 
  { 
    Scanner in = new Scanner(System.in);
    int row_size=in.nextInt();
    int col_size=in.nextInt();
    int matrix1[][] = new int[row_size][col_size];
    int transpose[][] = new int[row_size][col_size];
    for(int i=0;i<row_size;i++)
    {
      for(int j=0;j<col_size;j++)
      {
       
         matrix1[i][j]=in.nextInt(); 
        
      }
          
         
    
    }
    for(int i=0;i<row_size;i++)
    {
      for(int j=0;j<col_size;j++)
      {
       
         transpose[j][i]=matrix1[i][j]; 
        System.out.print(transpose[j][i]+" ");
        
      }
      System.out.println();
          
         
    
    }
    
    
    
  }
}