import algos.implementations.arrays.TwoSum;

public class Main {

	public static void main(String[] args) {
		
		TwoSum _instance = new TwoSum();
		int nums[] = {2,2,2,2,2};
		int[] result = _instance.findTwoSum(nums, 8);
		System.out.println("Result : "+result[0]+" and "+result[1]);
		
	}

}
