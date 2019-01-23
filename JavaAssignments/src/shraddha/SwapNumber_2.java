//-------------------------------------------------------
//Assignment: SWAP numbers without using three variables.
//-------------------------------------------------------

package shraddha;

public class SwapNumber_2 {
	
	void swap_2(int number1, int number2)
	{
		number1 = number1+number2;
		number2 = number1-number2;
		number1 = number1-number2;
		System.out.println("Number1:= "+number1+"\n"+"Number2:= "+number2);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new SwapNumber_2().swap_2(Integer.parseInt(args[0]),Integer.parseInt(args[1]));


	}

}
