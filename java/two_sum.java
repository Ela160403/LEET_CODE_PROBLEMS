import java.util.HashMap;

public class two_sum {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> numIndices = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (numIndices.containsKey(complement)) {
                return new int[] { numIndices.get(complement), i };
            }
            numIndices.put(nums[i], i);
        }

        return new int[0];
    }
}
