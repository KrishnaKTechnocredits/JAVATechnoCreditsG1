//----------------------------------------------------
//Assignment: SWAP numbers using three variables.
//----------------------------------------------------

package shraddha.assignment_1;

public class SwapNumber_1 {

	void swap_1(int number1, int number2)
	{
		int number3=0;
		number3 = number1;
		number1 = number2;
		number2 = number3;
		
		System.out.println("Number1:= "+number1+"\n"+"Number2:= "+number2);
	}
	
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new SwapNumber_1().swap_1(Integer.parseInt(args[0]),Integer.parseInt(args[1]));

	}

}
