import java.util.Scanner;
class Main
{
	public static void main (String[] args)
    {
	 Scanner in = new Scanner(System.in);
     int num = in.nextInt();
     Main m =  new Main();
     int value=m.funsq(num);
     System.out.print(value);
	} 
  
  public int funsq(int num)
  {
    int sum=0;
    for(int i=1; i<=num; i++)
        sum+=i;
    return sum;
  }
}