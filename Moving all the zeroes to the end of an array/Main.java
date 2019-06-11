import java.util.Scanner;
class Main{
    public static void main(String args[]) {
      Scanner in = new Scanner(System.in);
      int arri[] = new int[14];
      int arrz[] = new int[10];
      int arrnz[] = new int[10];
      int j=0,k=0;
      int n = in.nextInt();
      for(int i=0 ; i<n;i++)
        arri[i]=in.nextInt();
     
      for(int i=0;i<n;i++)
      {
        if(arri[i]==0)
        {
          arrz[j]=arri[i];
          j++;
          
        }
        else
        {
          arrnz[k]=arri[i];
          k++;
         
        }
        
        
      }
      
      for(int i=0;i<n; )
      {
           
        for(int m=0;m<k;m++)
        {
            arri[i]=arrnz[m];
             i++;
          
          
        }
        
        for(int l=0;l<j;l++)
        {
            arri[i]=arrz[l];
           i++;
          
          
        }
        
        
        
      }
      
    for(int i =0;i<n;i++)
    {
      System.out.print(arri[i] + " ");
      
    }
     
    
   }
}