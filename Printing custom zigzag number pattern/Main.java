import java.util.Scanner;
class Main{
	public static void main (String[] args){
	   Scanner in = new Scanner(System.in);
      int num = in.nextInt();
      int count=1;
      for(int i =1 ;i<=num ; i++)
      {
        
        for(int j=1;j<=num;j++)
        {
          if((i%2)!=0 && j!=num)
          System.out.print(i);
          if((i%2)==0 && j==1)
          System.out.print(++count);
          if((i%2)!=0 && j==num)
          System.out.print(++count);
          if((i%2)==0 && j!=1)
          System.out.print(i);
       
        }
        
        System.out.print("\n");
        
      }
	}
}