import java.util.Scanner;
class Main{
    public static void main(String args[])
    {
      Scanner in = new Scanner(System.in);
      int size = in.nextInt();
      int[] arr = new int[size];
      for(int i=0;i<size;i++)
        arr[i]=in.nextInt();
      
      int k = in.nextInt();
      int temp=0;
      for(int i=0;i<size;i++)
      {
        for(int j=i+1;j<size;j++)
            {
               if(arr[j]>arr[i])
               {
                   temp=arr[i];
                   arr[i]=arr[j];
                   arr[j]=temp;
                 
               }
                
            }
        
        
      }
            
      for(int i=0;i<size;i++)
            {
              if(i==(k-1))
                System.out.print(arr[i]);
              
            }

      
      
    }
}