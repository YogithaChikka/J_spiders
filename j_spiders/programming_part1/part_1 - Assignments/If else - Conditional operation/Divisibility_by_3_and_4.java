class Divisibility_by_3_and_4 
{
	public static void main(String[] args) 
	{
		int num = 12;
		String res = (num % 3 == 0 && num % 4 == 0)?"Divisible by both 3 and 4":"Not divisible by both 3 and 4";  
		System.out.println(res);
	}
}
