import java.util.*;
class  SumOfDigits
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter a number: ");
		int num = sc.nextInt();
		int sum = 0;
		while (num > 0)
		{
			int ld = num % 10;
			sum += ld;
			num /= 10;
		}
		System.out.println("The sum of digits is " + sum);
	}
}
