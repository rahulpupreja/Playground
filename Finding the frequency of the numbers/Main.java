import java.util.Scanner;
class Main{
    public static void main(String args[])
    {
      Scanner in = new Scanner(System.in);
      int size = in.nextInt();
      int[] arr = new int[size];
      int k = in.nextInt();
      int value=0;
      int[] arr2 = new int[k];
       int[] arr3 = new int[k];
      for(int i=0;i<size;i++)
        arr[i]=in.nextInt();
      
      for(int i=0;i<size;i++)
      {
        for(int j=0;j<size;j++)
            {
               value=arr[i];
               if((arr[i]==arr[j])&&(arr3[value-1]!=1))
               {
                   
                   arr2[value-1]++;
                 
               }
                
            }
        arr3[value-1]=1;
        
        
      }
            
      for(int i=0;i<k;i++)
            {
              System.out.println((i+1)+" "+arr2[i]);
              
            }

      
      
    }
}