import java.util.HashMap;
import java.util.Map;

class Lab1 {
    public static void main(String[] args){
        int[] nums = {8, 7, 2, 4, 5};
        int[] ans = twoSum(nums,11);
        System.out.println(ans[0]);
        System.out.println(ans[1]);

    }
    public static int[] twoSum(int[] nums, int target) {
        int[] x= new int[2];
        Map<Integer,Integer> h = new HashMap<Integer,Integer>();
        for(int i = 0; i < nums.length; i++){
            int addVal = target - nums[i];
            if(h.containsKey(addVal)){
                x[0] = i;
                x[1] = h.get(addVal);
                break;
            }else{
                h.put(nums[i],i);            
            }
        }
        return x;
        
    }
}