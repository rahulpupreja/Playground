import java.util.Scanner;
class Main{
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        int[] arr = new int[num];
        int[] arr2 = new int[num];
        for(int i=0;i<num;i++)
          arr[i]=in.nextInt();
       for(int i=1;i<=num;i++)
       {
         for(int j=0;j<num;j++)
         {
              if(arr[j]==i)
                arr2[i-1]=1;
             
         }
       }
      
      for(int i=0;i<num;i++)
      { 
           if(arr2[i]!=1)
             System.out.print(i+1);
      }
     
        
        
           
           
          
         
         
       }
     
      
      
    }
