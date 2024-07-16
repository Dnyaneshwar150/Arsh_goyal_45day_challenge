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