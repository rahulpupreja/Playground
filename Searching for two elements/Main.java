import java.util.Scanner;
class Main{
    public static void main(String args[]){
      Scanner in = new Scanner(System.in);
      int arr[] = new int[5];
      int n = in.nextInt();
      
      for(int i=0; i<n; i++)
          arr[i]=in.nextInt();
     
     int search_elem_1 = in.nextInt();
       int search_elem_2 = in.nextInt();
      int search_element=search_elem_1;
      int index=0;
      for(int i=1 ;i<=2 ; i++)
      {
           for(int j=0;j<5;j++)
           {
             
             if(arr[j]==search_element)
             {
                index=j;
                 break;
               
             }
             
             else
               index=-1;
           }
        
        System.out.println(index);
        search_element=search_elem_2;
        
      }
 
      
        
     
      
    }
}