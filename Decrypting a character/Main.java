import java.util.Scanner;
public class Main{
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        char c = in.next().charAt(0);
        int n = in.nextInt();
        if(c>='a' && c<='z')
        {
        int num = c+25-(n-1);
        char ch1=(char)num;
        System.out.print(ch1);
        }
        else if(c>='A' && c<='Z')
        {
          
          int num1=c-2;
          char ch2=(char)num1;
          System.out.print(ch2);
        }
       
        
    }
}