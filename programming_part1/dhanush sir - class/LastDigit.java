import java.util.*;
class  LastDigit
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter a number: ");
		int num = sc.nextInt();
		int ld = num % 10;
		System.out.println("The last digit of  " + num + " is " + ld);
	}
}
