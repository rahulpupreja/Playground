import java.util.Scanner;
class Main{
    public static void main(String args[]) {
     Scanner in = new Scanner(System.in);
      String str =  in.nextLine();
      StringBuilder sb =  new StringBuilder(str);
      StringBuilder sb1 =  new StringBuilder(str);
      int str_len = sb.length();
      int i=0,j=str_len-1;
      char temp;
      while(i!=j)
      {
          temp=sb.charAt(i);
          sb.setCharAt(i,sb.charAt(j));
          sb.setCharAt(j,temp);
          i++;
          j--; 
      }
     if(sb1.toString().equals(sb.toString()))
       System.out.println("Yes");
    else
      System.out.println("No");
      
      
    } 
}