import java.util.Scanner;
class Main{
    public static void main(String args[]){
      Scanner in = new Scanner(System.in);
      int arr[] = new int[6];
      int n = in.nextInt();
      for(int i=0; i<n; i++)
          arr[i]=in.nextInt();
      int max=0;
      for( int i = 0; i<n; i++)
      {
           if(arr[i]>max)
             max=arr[i];
        
      }
      
      System.out.print(max);
     
     
    }
}