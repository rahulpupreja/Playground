import java.util.Scanner;
class Main{
    public static void main(String args[]) {
      Scanner in = new Scanner(System.in);
      int size = in.nextInt();
      int arr[] = new int[size];
      int arrt[] = new int[size];
      for(int i=0;i<size;i++)
        arr[i]=in.nextInt();
      int value = in.nextInt();
      for(int i=0;i<size;i++)
      {
          for(int j=0;j<size;j++)
          {
              if((arr[i]+arr[j])==value)
              {
                    if(arrt[j]==0&&arrt[i]==0)
                    {
                       System.out.println(arr[i]+", "+arr[j]);
                      arrt[i]=arrt[j]=1;
                       break;
                      
                    }
              }
          }
        
      }
               
            
        
        
      }
    }
