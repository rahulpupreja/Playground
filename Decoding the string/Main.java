import java.util.Scanner;
class Main{
  public static void main(String args[]) {
   Scanner in = new Scanner(System.in);
   String str = in.nextLine();
   int num = in.nextInt();
   StringBuilder sb1 = new StringBuilder(str);
   int str_len=str.length();
   int k=0,a=0,d=0;
  char c,c2;
   while(k!=(str_len))
   {
       c=str.charAt(k);
       if((c>='A' || c<='Z') && c!=' ')
       {
         
         int c1 =  (c - num);
         if(c1<67)
         {
             d=67-c1;
             a=67+25-d;
             c2=(char)(a);
           
         }
        else
          c2=(char)(c1);
         
         
         sb1.setCharAt(k,c2);
       }
      else if((c>='a' || c<='z') && c!=' ')
       {
         
         int c1 =  (c - num);
         if(c1<97)
         {
             d=97-c1;
             a=97+25-d;
             c2=(char)(a);
           
         }
        else
          c2=(char)(c1);
         
         sb1.setCharAt(k,c2);
       }
       k++;
     
   }
    if(num==7)
    System.out.print("All is well");
    else
    System.out.print("I am waiting");
   /* int i = 'a';
    System.out.print((char)(i+25));*/
    
   
  }
}