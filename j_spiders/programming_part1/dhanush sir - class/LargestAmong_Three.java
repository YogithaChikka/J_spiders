class LargestAmong_Three 
{
	public static void main(String[] args) 
	{
		int a = 10;
		int b = 20;
		int c = 30;
		int res = (a>b && a>c)?a:(b>a && b>c)?b:c;
		System.out.println(res);
	}
}
