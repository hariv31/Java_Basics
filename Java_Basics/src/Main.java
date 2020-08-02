import algos.implementations.arrays.TwoSum;

public class Main {

	public static void main(String[] args) {
		
		TwoSum _instance = new TwoSum();
		int nums[] = {2,2,10};
		int[] result = _instance.findTwoSum(nums, 12);
		System.out.println("Result : "+result[0]+" and "+result[1]);
		
	}

}
