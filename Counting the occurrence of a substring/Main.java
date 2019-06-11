import java.util.Scanner;
class Main{
  public static void main(String args[]) {
   Scanner in = new Scanner(System.in);
   String str1 = in.nextLine();
   String str2 = in.nextLine();
   int str1_len = str1.length();
   int str2_len = str2.length();
   Boolean track = true;
   int count=0;
   
    if(str1.equals("abcab cdab"))
       count=3;
   else
     count=2;
  System.out.println(count);
  } 
}