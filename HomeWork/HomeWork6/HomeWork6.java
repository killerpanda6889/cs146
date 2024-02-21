import java.util.*;
public class HomeWork6 {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> ret = new ArrayList<List<Integer>>();
        Arrays.sort(nums);
        for(int i = 0; i < nums.length; i++){      
            searchAdd(nums, 0-nums[i], i, ret);
            while(i+1 < nums.length && nums[i]== nums[i+1]){
                i++;
            }
        }
        return ret;
    }
    
    public void searchAdd(int[] nums, int target, int x, List<List<Integer>> subList) {
        int left = x+1;
        int right = nums.length-1;
        while(left < right){
            if(nums[left] + nums[right] == target){
                List<Integer> ans = new ArrayList<Integer>();
                ans.add(nums[left]);
                ans.add(nums[right]);
                ans.add(0-target);
                subList.add(ans);
                while(left < right && nums[left] == nums[left+1]){
                     left++;
                }
                while(left < right && nums[right] == nums[right-1]){
                    right--;
                }
                left++;
                right--;
            }else if(nums[left] + nums[right] > target){
                right--;
            }else if(nums[left] + nums[right] < target){
                left++;
            }
        }
    }
}
