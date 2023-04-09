/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public TreeNode buildTree(int[] preorder, int[] inorder) {
       return createPreIn(preorder,0,preorder.length-1,inorder,0,inorder.length-1); 
    }

   private TreeNode createPreIn(int[] Pre, int Pre_s, int Pre_e, int[] In, int In_s, int In_e) {
		if (Pre_s > Pre_e || In_s > In_e) {
			return null;
		}
		TreeNode nn = new TreeNode(Pre[Pre_s]);
		int ali = Pre[Pre_s];
		int found = In_s;
		int L_Size = 0;
		for (int i = In_s; i <= In_e; i++) {
			if (In[i] == ali) {
				found = i;
				break;
			}
			L_Size++;
		}
		nn.left = createPreIn(Pre, Pre_s + 1, Pre_s + L_Size, In, In_s, found - 1);
		nn.right = createPreIn(Pre, Pre_s + L_Size + 1, Pre_e, In, found + 1, In_e);
		return nn;
	}
}
