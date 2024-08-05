import java.util.*;
class  FirstDigit
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter a number: ");
		int num = sc.nextInt();
		int temp = num;
		while (temp > 9)
		{
			temp/=10;
		}
		System.out.println("The first digit of " + num + " is " + temp);
	}
}
