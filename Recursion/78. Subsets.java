class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        solve(0,nums,ans,new ArrayList<>());
        return ans;
    }

    public void solve(int idx, int[] arr,List<List<Integer>> ans,List<Integer> al){
        if(idx==arr.length){
            ans.add(new ArrayList<>(al));
            return;
        }

        if(idx>arr.length){
            return;
        }
        
        //include
        al.add(arr[idx]);
        solve(idx+1,arr,ans,al);
        al.remove(al.size()-1);
        
        //exclude
        solve(idx+1,arr,ans,al);

    }
}
