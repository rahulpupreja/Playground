import java.util.*;
class Main {
	public static void main (String[] args) {
		// Type your code here
      Scanner in=new Scanner(System.in);
      int num=in.nextInt();
      int d1=num/10;
      int d2=num%10;
      int sum=d1+d2;
      System.out.println(sum);
	}
}