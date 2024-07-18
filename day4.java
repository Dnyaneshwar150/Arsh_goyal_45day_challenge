import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class day4 {
    public int subarraySum(int[] nums, int k) {
        int sum = 0, result = 0;
        Map<Integer, Integer> preSum = new HashMap<>();
        preSum.put(0, 1);
        
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            if (preSum.containsKey(sum - k)) {
                result += preSum.get(sum - k);
            }
            preSum.put(sum, preSum.getOrDefault(sum, 0) + 1);
        }
        
        return result;
    }


     public void merge(int[] nums1, int m, int[] nums2, int n) {
        for (int j = 0, i = m; j < n; j++) {
            nums1[i] = nums2[j];
            i++;
        }
        Arrays.sort(nums1);
    }

    class Solution {
        public boolean validPalindrome(String s) {
            int lp = 0;
            int rp = s.length()-1;
            int count1 = 0;
            int count2 = 0;
            while(lp < rp){
            
                if(s.charAt(lp) == s.charAt(rp)){
                    lp++;
                    rp--;
                }else{
                    rp--;
                    count1++;
                }
            }
    
             lp = 0;
            rp = s.length()-1;
             while(lp < rp){
            
                if(s.charAt(lp) == s.charAt(rp)){
                    lp++;
                    rp--;
                }else{
                    lp++;
                    count2++;
                }
            }
    
            if(count1 == 0 || count2 == 0 ){
                return true;
            }
            if(count1 == 1 || count2 == 1 ){
                return true;
            }
    
            return false;
        }
    }
}
