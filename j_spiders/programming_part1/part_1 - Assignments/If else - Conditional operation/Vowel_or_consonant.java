class Vowel_or_consonant 
{
	public static void main(String[] args) 
	{
		char alphabet = 'y';
		String res = (alphabet == 'a' || alphabet == 'e' || alphabet == 'i' || alphabet == 'o' || alphabet == 'u')?"It is a vowel":"It is a consonant";
		System.out.println(res);
	}
}
