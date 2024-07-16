public class day2 {
    public int removeDuplicates(int[] nums) {
        int n =  nums.length;
        int i=0;
        for(int j=1;j<n;j++){
            if(nums[i] != nums[j]){
            i++;
                nums[i]=nums[j];
            }
}
        return i+1;
    }
}


public void moveZeroes(int[] nums) {
    int n = nums.length;
    int j = 0;
    for(int i =0;i<n;i++){
        if(nums[i] != 0){
            nums[j] = nums[i];
            j++;
        }
    }

    for(int i = j;i<n;i++){
        nums[i] = 0;
    }
}

public int maxProfit(int[] prices) {
    int buyprice = Integer.MAX_VALUE;
    int maxprofit = 0;
    
    for(int i=0;i<prices.length;i++){
    if(prices[i] > buyprice){
        int profit = prices[i] - buyprice;
        maxprofit = Math.max(maxprofit,profit);
    }else{
        buyprice = prices[i];
    }
    }
    return maxprofit;

    public int maxArea(int[] height) {
        int n=height.length;
        int left = 0;
        int right= n-1;
        int maxWater = 0;
        while(left < right){
            int width = right - left;
            int length = Math.min(height[left],height[right]);
            int water = width*length;
            maxWater = Math.max(maxWater,water);

            if(height[left] < height[right]){
                left++;
            }
            else{
                right--;            }
        }
        return maxWater;
    }


    class Solution {
        public static String longestCommonPrefix(String[] strs) {
            if(strs.length == 0  || strs == null){
             return "";
            }
            String prefix = strs[0];
            for(int i = 1; i < strs.length;i++){
             String s = strs[i];
             int j = 0;
             while(j < prefix.length() && j < s.length() && prefix.charAt(j) == s.charAt(j)){
                j++;
             }
    
             if(j == 0){
                return "";
             }
             else{
                prefix = prefix.substring(0,j);
             }
            }
            return prefix;
       }
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

    class Solution {
        public String reverseWords(String s) {
            Stack<String> st = new Stack<>();
            String[] str = s.trim().split("\\s+");
            StringBuilder sb = new StringBuilder();
            
            for (int i = 0; i < str.length; i++) {
                st.push(str[i]);
            }
            
            while (!st.isEmpty()) {
                sb.append(st.pop());
                if (!st.isEmpty()) {
                    sb.append(" ");
                }
            }
            
            return sb.toString();
        }
    }
    