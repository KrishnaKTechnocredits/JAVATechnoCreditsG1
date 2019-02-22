package vishal;

import java.util.ArrayList;

public class CollectionQ2 {

	public static void main(String[] args) 
	{

		ArrayList<String> al=new ArrayList<String>();
		al.add("all the bestttttttttttttttttttttttttttt");
		al.add("technocredits");
		al.add("");
        al.add("maharashtraaaaaaaaaaaaaaaa");
        
        findMax(al);
        
    }
	
	public static void findMax(ArrayList<String> al)
	{
		int max=0;
		String maxLengthString="";
		for(String s:al)
		{
			if(max<s.length())
			{
				maxLengthString=s;
				max=s.length();
			}
			
		}
		
		System.out.println("Max Length String is: "+maxLengthString);
		
	}

}
