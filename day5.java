import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class day5 {
     public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int n = nums1.length;
        int arr[] = new int[n];

        Stack<Integer> stack = new Stack<>(); 
        Map<Integer,Integer> map = new HashMap<>();

        for(int i =nums2.length-1;i>=0;i--){
            while(!stack.isEmpty() && nums2[i] > stack.peek()){
                stack.pop();
            }
            int result;
            if(stack.isEmpty()){
                result = -1;
                map.put(nums2[i],result);
            }else{
                result = stack.peek(); 
                map.put(nums2[i],result);
            }

            stack.push(nums2[i]);
        }

        for(int i=0;i<nums1.length;i++){
            int value = map.get(nums1[i]);
            arr[i] = value;
        }
                    return arr;

    }

}
