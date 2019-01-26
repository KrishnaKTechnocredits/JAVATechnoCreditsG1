package shraddha;

import java.util.Scanner;

public class Trees {

	// Accepting total number of trees and their heights
	void acceptTrees() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter total number of trees:");
		int tree_count = 0;
		tree_count = sc.nextInt();
		int tree_height[] = new int[tree_count];
		
		System.out.println("Enter "+tree_count+" Tree Heights:");
		for (int index = 0; index <= tree_height.length - 1; index++) {
			tree_height[index] = sc.nextInt();
		}
	
		treeVisible(tree_height);
	}
	
	
	// Total number of trees visible
	void treeVisible(int[] tree_height)
	{
		int count = 1;
		int max = tree_height[0];
		
		for(int index = 1; index < tree_height.length;index++)
		{
			if(tree_height[index]>max)
			{
				max = tree_height[index];
				count = count+1;
			}
						
		}
		
		System.out.println("Total Trees visible count:="+count);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		new Trees().acceptTrees();

	}

}
