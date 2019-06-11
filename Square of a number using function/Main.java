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
    int value=num*num;
    return value;
  }
}