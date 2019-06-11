import java.util.Scanner;
class Main{
  public static void main(String args[]){
    Scanner in = new Scanner(System.in);
    int base = in.nextInt();
    int exp =  in.nextInt();
    int num = power(base,exp);
    System.out.println(num); 
  }
  public static int power(int base, int exp)
  {
     int mul=1;
    for(int i=1 ; i<=exp ; i++)
       mul=mul*base;
    return mul;
  }
}