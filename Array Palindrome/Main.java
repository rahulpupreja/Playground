import java.util.Scanner;
import java.util.Arrays;
class Main{
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        int size = in.nextInt();
        int[] arr = new int[size];
        int[] arr2 = new int[size];
        int j=size-1;
        for(int i=0;i<size;i++)
          arr[i]=in.nextInt();
        for(int i=0;i<size;i++)
        {
            arr2[j]=arr[i];
            j--;
          
        }
        if(Arrays.equals(arr,arr2))
          System.out.print("Yes");
       else
         System.out.print("No");
      
         
      
    }
}