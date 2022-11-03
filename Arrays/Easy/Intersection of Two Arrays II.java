class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);

        ArrayList<Integer> ans_list = new ArrayList<Integer>();

        int i=0, j=0;
        while(i<nums1.length && j<nums2.length){
            if(nums1[i]==nums2[j]){
                ans_list.add(nums1[i]);
                i++;
                j++;
            } else if (nums1[i]>nums2[j]) {
                       j++;
            }else{
                i++;
            }
        }
         
        return listToArray(ans_list);
    }

    private int[] listToArray(List<Integer> list) {
        int[] result = new int[list.size()];
         
        for (int i = 0; i < list.size(); i++) {
            result[i] = list.get(i);
        }
         
        return result;
    }
}
