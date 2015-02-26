import java.util.Scanner;

public class Problem4_Longest_Increasing_Sequence {

	public static void main(String[] args) {

		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		String[] line = scan.nextLine().split(" ");
		int[] nums = new int[line.length];
		int count=1;
		int ind=0;
		int longestSeq=0;
		
		for (int i = 0; i < nums.length; i++) {
			nums[i] = Integer.parseInt(line[i]);
		}
		System.out.print(nums[0] + " ");
		for (int k = 1; k < nums.length; k++) {
			if(nums[k]>nums[k-1]){
				System.out.printf("%d ",nums[k]);
			count++;
			}
			else
			{System.out.println();
			System.out.printf("%d ",nums[k]);
			count=1;
			}
			if(count>longestSeq){
				longestSeq=count;
				ind=k;
			}
		
		}
		int start=ind-count+1;
		if(count>1){
			System.out.println();
			System.out.print("Longest:");
		for (int a = 0; a < count; a++) {
			
			System.out.printf("%d ",nums[start]);
			start++;
		}
		
		
		}
	}

}
