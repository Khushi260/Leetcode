//https://leetcode.com/problems/number-of-steps-to-reduce-a-number-to-zero/

class Solution {
    public int numberOfSteps(int num) {

    int i = 0;
        while(num !=0 ){

            if(num%2==0){
                num = num/2;
            }
            else{
                num = num-1;
            }
            i++;
        }

        return i;
        
    }
}