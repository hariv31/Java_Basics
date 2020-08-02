package algos.implementations.arrays;

public class TwoSum {
	
	public int[] findTwoSum(int[] nums, int sum) {
		
		int[] result = new int[2];
		
		for(int i=0; i<nums.length-1; i++) {
			for(int j=i; j<=nums.length-1;j++) {
			if((nums[i] + nums[j]) == sum) {
				result[0] = i;
				result[1] = j;
				System.out.println(" In if");
				break;
			} else {
				System.out.println("IN else");
			}
			}
		}
		
		return result;
	}

}
