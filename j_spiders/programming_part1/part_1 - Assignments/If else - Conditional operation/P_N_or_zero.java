class P_N_or_zero 
{
	public static void main(String[] args) 
	{
		int num = 9;
		String res = (num > 0)?"Positive":(num < 0)?"Negative":"Zero";
		System.out.println(res);
	}
}
