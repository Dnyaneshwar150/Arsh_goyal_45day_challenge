import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class day3 {
    
    
    class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        int n = nums.length;
        List<List<Integer>> ls = new ArrayList<>();
        Arrays.sort(nums);
        
        for (int i = 0; i < n; i++) {
            // Avoid duplicates
            if (i > 0 && nums[i] == nums[i - 1])
                continue;

            for (int j = i + 1; j < n; j++) {
                // Avoid duplicates
                if (j > i + 1 && nums[j] == nums[j - 1])
                    continue;

                for (int k = j + 1; k < n; k++) {
                    // Avoid duplicates
                    if (k > j + 1 && nums[k] == nums[k - 1])
                        continue;

                    if (nums[i] + nums[j] + nums[k] == 0) {
                        List<Integer> temp = new ArrayList<>();
                        temp.add(nums[i]);
                        temp.add(nums[j]);
                        temp.add(nums[k]);

                        ls.add(temp);
                    }
                }
            }
        }
        return ls;
    }

    public int majorityElement(int[] nums) {
        int count = 1;
        int major = nums[0];

        for(int i=1;i<nums.length;i++){
            if(count == 0){
                major = nums[i];
                count++;
            }else if(major ==  nums[i]){
                count++;
            }
            else{
                count--;
            }
        }
        return major;
    }
}

}
