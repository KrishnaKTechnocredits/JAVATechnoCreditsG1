package vishal;

public class SecondHighest {

			
			int secondHighest(int[] input) //5 25 6 20
			{
				int max=0;
				int secondMax=0;
				
				for(int index=0;index<input.length;index++)
				{
					if(max<input[index])
					{
						max=input[index];
					}
				}
				
				for(int index=0;index<input.length;index++)
				{
					if(secondMax<input[index]&&input[index]!=max) //max 20 
					{
						secondMax=input[index];
					}
				}
				
				return secondMax;
			}

			public static void main(String[] args) 
			{
				UserInput ui=new UserInput();
				int[] arr= ui.enterDataInt();//{5,25,6,20};
				SecondHighest sh=new SecondHighest();
				int secondMax=sh.secondHighest(arr);
				System.out.println("Second Max is: "+secondMax);

			}

	

	}


