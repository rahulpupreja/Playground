import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
   Scanner in = new Scanner(System.in);
   int num = in.nextInt();
   int m =0;
   for(int i=1 ; i<=num ;i++)
   {
         if(m==3)
         {
           System.out.print(",");
           m=0;
         }
     	 System.out.print(i);
         m++;
    	
   }
  }
}