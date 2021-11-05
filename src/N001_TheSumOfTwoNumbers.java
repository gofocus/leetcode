import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * @Description:
 * @Version: V1.0
 * @Author: focus.guo@happyeasygo.com
 * @Date: 2021/11/5 10:01
 */
public class N001_TheSumOfTwoNumbers {

    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> hashtable = new HashMap<Integer, Integer>();
        for (int i = 0; i < nums.length; ++i) {
            if (hashtable.containsKey(target - nums[i])) {
                return new int[]{hashtable.get(target - nums[i]), i};
            }
            hashtable.put(nums[i], i);
        }
        return new int[0];
    }

    public static void main(String[] args) {
        N001_TheSumOfTwoNumbers twoNumbers = new N001_TheSumOfTwoNumbers();
        int[] nums = new int[]{3,2,4};
        int target = 6;
        int[] twoSum = twoNumbers.twoSum(nums, target);
        System.out.println(Arrays.toString(twoSum));

    }

}
