import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    Scanner in = new Scanner(System.in);
    int arr[] = new int[10];
    int max=0,index=0;
    int n = in.nextInt();
    for(int i = 0; i<n ; i++)
        arr[i]=in.nextInt();
    int batch = n/3;
    int sum=0,count=0,j=0;
    int arr1[] = new int[5];
    for(int i = 0 ; i < n; i++)
    {
          sum+=arr[i];
          count++;
          if(count==3)
          {
            arr1[j]=sum;
            sum=0;
            count=0;
            j++;
            
          }
      
    }
    count=0;
    
  /*for(int i =0;i<batch;i++)
   System.out.println(arr1[i]);*/
    
   for(int i = 0 ; i<(batch-1); )
   {
           if(arr1[i]==arr1[++i])
           {
               count++;
             
           }
     
   }
    
  //System.out.println(count);
    
  if(count==(batch-1))
    System.out.print("Perfect Batch");
  else
    System.out.print("Not a Perfect Batch");
     
  }
}