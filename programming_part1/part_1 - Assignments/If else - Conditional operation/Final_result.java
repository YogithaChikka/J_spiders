class Final_result 
{
	public static void main(String[] args) 
	{
		int marks = 79;
		String result = (marks >= 95 && marks <= 100)?"First rank": (marks >= 90 && marks <=94)?"Second rank":(marks >= 80 && marks <=89)?"Distinction":(marks >= 75 && marks <=79)?"First class with distinction":(marks >= 60 && marks <=74)?"First class":(marks >= 45 && marks <=59)?"Second class":(marks >= 35 && marks <=44)?"Pass":"Fail";
		System.out.println(result);
	}
}
