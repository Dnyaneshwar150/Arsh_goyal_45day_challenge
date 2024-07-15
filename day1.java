import java.util.*;

public class day1{
    public long findMinDiff (ArrayList<Integer> a, int n, int m)
    {
        // your code here
          Collections.sort(a);
        int start = 0;
        int end = m - 1;
        int min = Integer.MAX_VALUE;

        while (end < n) {
            int difference = a.get(end) - a.get(start);
            min = Math.min(difference, min);
            start++;
            end++;
        }

        return min;
    }

    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> map = new HashMap<>();
        int ans[] = new int [2];
         for(int i=0;i<nums.length;i++){
            int complement = target - nums[i];
             if(map.containsKey(complement)){
            ans[0] = map.get(complement);
            ans[1] = i;
             }
             
             map.put(nums[i],i);
        }
        return ans;
}

public int findDuplicate(int[] nums) {
    Set<Integer> set  = new HashSet<>();
    for(int i=0;i<nums.length;i++){
    if(set.contains(nums[i])){
            return nums[i];
    }
        set.add(nums[i]);
        }
    
    return -1;

    }

    class Solution {
        void swap(int nums[],int a,int b){
        int temp  = nums[a];
        nums[a] = nums[b];
        nums[b] = temp;
            
            
        }
        public void sortColors(int[] nums) {
            int low =0;
            int mid = 0;
            int high = nums.length-1;
            
            while(mid <= high){
            if(nums[mid] == 0){
            swap(nums,mid,low);
                low++;
                mid++;
            }else if(nums[mid] == 1){
            mid++;
            }else{
            swap(nums,mid,high);
                high--;
            }
            }
        }
    }


