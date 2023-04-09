class Solution {
    public TreeNode buildTree(int[] inorder, int[] postorder) {
       return helper(inorder,inorder.length-1,0,postorder,postorder.length-1); 
    }

    public TreeNode helper(int[] inorder, int in_start, int in_end, int[] postorder, int p_start){
        if(p_start<0 || in_start<in_end){
            return null;
        }

        TreeNode root = new TreeNode(postorder[p_start]);
        int root_val=postorder[p_start];
        int found=0; 
        for(int i = in_start; i>=in_end; i--){
            if(inorder[i]==root_val){
                found=i;
                break;
            }
        }

        root.right=helper(inorder,in_start,found+1,postorder,p_start-1);
        root.left=helper(inorder,found-1,in_end,postorder,p_start-(in_start-found)-1);
        return root;
    }
}
