class Solution {
    public static int minChar(String s) {
       
       int i = 0;
       int j = s.length()-1 , trim = j , res = 0;
       
       while(i < j)
       {
           
           if(s.charAt(i) == s.charAt(j)){
               
               i++;
               j--;
           }
           
           
           else{
            
               res++;
               i = 0;
               j = --trim;
           }

       }
       
       return res;
       
    }
}
