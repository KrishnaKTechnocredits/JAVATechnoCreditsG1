package abhishek;

public class EqualgivenNum {
	
	static void EqualgivenNumber(int [] array,int number) {
		
		for(int index =0;index< array .length;index++) {
			for(int index1 =1;index1< array .length;index1++) {
				if( array [index]+ array [index1]==number) {
					System.out.println("{"+ array [index]+" "+ array [index1]+"}");
					
				}
			}
			
		}
		
		
	}
	public static void main(String[] args) {
		int [] Userarray = {2, 4, 3, 5, 7, 8, 9};
			
			EqualgivenNumber(Userarray,8);
		
	}

}
