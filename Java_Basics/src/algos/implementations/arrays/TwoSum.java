package algos.implementations.arrays;

public class TwoSum {

	public int[] findTwoSum(int[] nums, int target) {
		int[] result = new int[2];
		boolean found = false;
		for (int i = 0; i < nums.length - 1; i++) {
			if (!found) {
				for (int j = i + 1; j <= nums.length - 1; j++) {
					if ((nums[i] + nums[j]) == target) {
						result[0] = i;
						result[1] = j;
						found = true;
						break;
					}
				}
			}

		}
		return result;
	}
	
	public int[] findTwoSum_pointers(int []nums, int target ) {
		
		int result[] = new int[2];
		
		return result;
		
	}

}
