class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> ans = new ArrayList<>();
        solve(0,nums,ans,new ArrayList<>());
        return ans;  
    }

    public void solve(int idx, int[] arr,List<List<Integer>> ans,List<Integer> al){
        if(idx==arr.length){
            ans.add(new ArrayList<>(al));
            return;
        }

        //include
        al.add(arr[idx]);
        solve(idx+1,arr,ans,al);
        al.remove(al.size()-1);

        while(idx+1<arr.length && arr[idx]==arr[idx+1]){
            idx=idx+1;
        }

        solve(idx+1,arr,ans,al);
    }

    //method 2
    // public void solve2(int idx, int[] arr,List<List<Integer>> ans,List<Integer> al){

    //     ans.add(new ArrayList<>(al));
    

    //    for(int i = idx;i<arr.length;i++) {
    //         if(i>idx && arr[i] == arr[i-1]) continue; 
    //         al.add(arr[i]); 
    //         solve2(i+1, arr, ans, al); 
    //         al.remove(al.size() - 1);
    //     }
    // }
}
