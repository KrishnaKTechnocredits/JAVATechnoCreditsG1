package abhishek;

public class MaxvalueIndex {
	static void differindex(int[] arr1, int[] arr2) {
		 if (arr1.length-arr2.length< 0) {
		for (int index = 0; index < arr1.length; index++) {
			if (arr1[index] != arr2[index]) {

				System.out.println("Values are not matching at index -> " + index);
				if(arr1[index] > arr2[index])
					System.out.println("From ("+arr1[index]+" "+arr2[index]+") max value is "+arr1[index]);
					else
						System.out.println("From ("+arr1[index]+" "+arr2[index]+") max value is "+arr2[index]);
		
			}

		
		
		}
		}
		 else {
			for (int index1 = 0; index1 < arr1.length; index1++) {
			if (arr1[index1] != arr2[index1]) {

				System.out.println("Values are not matching at index -> " + index1);
				if(arr1[index1] > arr2[index1])
					System.out.println("From ("+arr1[index1]+" "+arr2[index1]+") max value is "+arr1[index1]);
					else
						System.out.println("From ("+arr1[index1]+" "+arr2[index1]+") max value is "+arr2[index1]);
		
		
			}

		 
		}}}

	public static void main(String[] args) {
		int[] arr1 = { 10,2,18,14,3};
		int[] arr2 = { 10,2,9,14,13};
		differindex(arr1, arr2);

	}
}



