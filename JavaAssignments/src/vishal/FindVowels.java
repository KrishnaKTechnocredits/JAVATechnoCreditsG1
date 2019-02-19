package vishal;

public class FindVowels {

	public static void main(String[] args) 
	{
		FindVowels fv=new FindVowels();
		String s="automation engineering";
		System.out.println("Vowel count is "+fv.vowelCount(s));

	}

	public int vowelCount(String s)
	{
		
		int count =0;
		
		for(int index=0;index<s.length();index++)
		{
			char ch=s.charAt(index);
			if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
			{
				count=count+1;
			}
		}
		return count;
	}
	
}
