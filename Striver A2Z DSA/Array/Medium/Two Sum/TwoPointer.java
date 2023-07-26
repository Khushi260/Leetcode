class Solution {
   public int[] twoSum(int[] nums, int target) {
        int left = 0 ;
        int right = nums.length-1;
        int [] tmp = new int[nums.length];
        for(int i = 0 ; i < nums.length ; i++){
            tmp[i]=nums[i];
        }
        Arrays.sort(nums);
        
        int[] ans = new int[2];
        while(left < right){
            if(nums[left]+nums[right] < target){
                left++;
            }
            if(nums[left]+nums[right] > target){
                right--;
            }
            if(nums[left]+nums[right] == target){
                break;
            }
        }
        
        int leftValue = nums[left];
        int rightValue = nums[right];   
        
        for(int i = 0;  i < tmp.length  ; i++){
            if(tmp[i] == leftValue){
                ans[0] = i;
                break;
            }
            
        }

        for(int i = tmp.length-1;  i >=0  ; i--){
            
            if(tmp[i] == rightValue){
                ans[1] = i;
                break;
            }
        }

        return ans;
    }
}
