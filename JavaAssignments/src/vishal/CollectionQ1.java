package vishal;

import java.util.ArrayList;

public class CollectionQ1 {
	
	
	


public static void main(String[] args) 
	{
	
	CollectionQ1 cq=new CollectionQ1();
	
	ArrayList<Integer> al1=new ArrayList<Integer>();
	ArrayList<Integer> alPositive=new ArrayList<Integer>();
	ArrayList<Integer> alNegative=new ArrayList<Integer>();
	al1.add(5);
	al1.add(6);
	al1.add(-9);
	al1.add(14);
	al1.add(-25);
	al1.add(6);
	al1.add(7);
	al1.add(-14);
	
	cq.findPositiveNegative(al1,alPositive,alNegative);

	}

public void findPositiveNegative (ArrayList<Integer> al1, 
		 ArrayList<Integer> al2, ArrayList<Integer> al3)
{
	
	int positiveSum=0;
	int negativeSum=0;

for(int i:al1)
{
	if(i>0)
	{
		al2.add(i);
		positiveSum=positiveSum+i;
	}
	else
	{
		al3.add(i);
		negativeSum=negativeSum+i;
	}
}
System.out.println("Positive Numbers are: "+al2);
System.out.println("Negative Numbers are: "+al3);
System.out.println("Positive Sum is "+positiveSum);
System.out.println("Negative Sum is "+negativeSum);

}

	
	
}
