package amarja;
//Question 1 26-Jan AssignmentProgram to count the number of trees visible
public class Treecount {
	//Method to count the visible trees
	 int findtreecount(int numtrees[])
	 {	int count=1;
	 	int temp=numtrees[0];
	 		 for (int index=1;index<numtrees.length;index++)
		 {
				if (temp<numtrees[index])//Modified as per review comments to compare with temp only when  temp is less
				{ count++;
				 temp =numtrees[index];} 
		 }
		 return count;
	 }
	// Main Function calling another class to take integer array input 
	public static void main(String[] args)
		{	
		Takeinputarrint input = new Takeinputarrint();
		int num[]=input.takeintegerinputuser();
		Treecount treecount= new Treecount();
		int count=treecount.findtreecount(num);
		System.out.println("The count of visible trees ="+ count);
		}
}
