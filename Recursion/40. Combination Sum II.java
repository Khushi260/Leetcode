class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        List<List<Integer>> ans = new ArrayList<>();
        solve2(0,target,target,candidates,new ArrayList<>(),ans);
        return ans;  
    }

    public void solve2(int idx,int target, int remain, int[] arr,List<Integer> al,List<List<Integer>> ans ){
        if(remain==0){
            ans.add(new ArrayList<>(al));
        }

        for(int i = idx; i<arr.length; i++){
            //condition for not choosing same elements more than once
            if(i>idx && arr[i]==arr[i-1]){
               continue; 
            } 
    
            //negative base case no point of checking further
            if(remain<arr[i]){
               break; 
            } 
            

            al.add(arr[i]);
            solve2(i+1,target,remain-arr[i],arr,al,ans);
            al.remove(al.size()-1);
        }
    }
}
