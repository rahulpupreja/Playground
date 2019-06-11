import java.util.Scanner;
class Main{
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        int str_len = str.length();
        int i=0,offset=0,flag=1,count=0;
        int[] a = new int[26];
        char c;
        for( i = 0; i<=(str_len-1);i++)
        {
          flag=1;
          if(str.charAt(i)>='A' && str.charAt(i)<='Z')
          {
            offset=str.charAt(i)-'A';
          }
          else if(str.charAt(i)>='a' && str.charAt(i)<='z')
          {
            offset=str.charAt(i)-'a';
           
          }
          if(a[offset]==1)
            flag=0;
          if(flag==1)
          {
          for(int j=0 ;j<=(str_len-1);j++)
          {
              
              if((str.charAt(i))==(str.charAt(j)))
                 count++;
            
          }
          c=(char)(offset + 'a');
         System.out.print(c);
         System.out.print(count+" ");
         count=0;
         a[offset]=1;
         
          }
                          
         
      
      }
    }
}