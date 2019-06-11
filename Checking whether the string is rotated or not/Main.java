import java.util.Scanner;
class Main{
    public static void main(String args[])
    {
     	Scanner in = new Scanner(System.in);
        String str1 = in.nextLine();
        String str2 = in.nextLine();
        int str_len =  str2.length();
        StringBuilder sb = new StringBuilder(str1);
        str1 = str1.concat(str1);
        int str1_len = str1.length();
        /*System.out.println(str1);
        System.out.println(str1_len);*/
        int i=0,flag=0;
        int len =  str_len;
        while((i+str_len)!=str1_len)
        {
           //System.out.println(str1.substring(i,len));
          if((str1.substring(i,len)).equals(str2))
          {
           flag=1;
            break;
            
          }
          
        else
         flag=0;
          
          i++;
          len++;
        }
      if(flag==1)
        System.out.print("Yes");
      else
        System.out.print("No");
      
     
        
    }
}