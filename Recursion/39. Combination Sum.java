class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target){
        List<List<Integer>> result = new ArrayList<>();
        solve(0,target,0,candidates,result,new ArrayList<Integer>());
        return result;   
    }

    public void solve(int idx,int target, int total_sum, int[] arr,List<List<Integer>> ans,List<Integer> list  ){
        if(total_sum == target){
            ans.add(new ArrayList<Integer>(list));
            return;
        }

        if(idx>arr.length-1 || total_sum>target ){
            return;
        }

        //include
        list.add(arr[idx]);
        solve(idx,target,total_sum+arr[idx],arr,ans,list);
        list.remove(list.size()-1);

        //exclude
        solve(idx+1,target,total_sum,arr,ans,list);

    }
   
}
