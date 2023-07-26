public class Solution {
    public static int longestSubarrayWithSumK(int []a, long k) {
        int l=0, r=0;
        int max_length=0;
        int sum = a[0];


        while(r<a.length){

            while(l<=r && sum>k){
                sum-=a[l];
                l++;
            }

            if(sum==k){
                max_length= Math.max(max_length,r-l+1);
            }   

            r++;
            if(r<a.length){
                sum+=a[r];
            }
        }

        return max_length;
    }
}
