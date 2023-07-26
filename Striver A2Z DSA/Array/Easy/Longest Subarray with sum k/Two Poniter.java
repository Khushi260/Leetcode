https://www.codingninjas.com/studio/problems/longest-subarray-with-sum-k_6682399?utm_source=striver&utm_medium=website&utm_campaign=a_zcoursetuf&leftPanelTab=1

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
