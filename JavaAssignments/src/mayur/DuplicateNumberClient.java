//Client Class to Call service methods-UserInput() and FindDuplicate() of DuplicateNumberService
package mayur;

public class DuplicateNumberClient 
{
	public static void main(String[] args) 
	{
		DuplicateNumberService dNumberService = new DuplicateNumberService();
		UserInputArray userInputArray =new UserInputArray();
		int[] arry = userInputArray.userInput(); //calling UserInput()
		int duplicate = dNumberService.findDuplicate(arry);//calling FindDuplicate()
		System.out.println("Duplicate number is " + duplicate);
	}
}
