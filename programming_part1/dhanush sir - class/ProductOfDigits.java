import java.util.*;
class  ProductOfDigits
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter a number: ");
		int num = sc.nextInt();
		int pro = 1;
		while (num>0)
		{
			int ld = num%10;
			pro *= ld;
			num/=10;
		}
		System.out.println("The product of digits is " + pro);
	}
}
