import java.util.Scanner;
class Main {
	public static void main (String[] args){
	    Scanner in=new Scanner(System.in);
      	int num = in.nextInt();
      	int last_digit = num%10;
      	int l=num;
      	int first_digit=0;
      	while(l!=0)
        {
          first_digit=l;
          l=l/10;
          
        }
      int sum= last_digit+first_digit;
      System.out.println(sum);

	}
}