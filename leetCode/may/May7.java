https://leetcode.com/explore/challenge/card/may-leetcoding-challenge/534/week-1-may-1st-may-7th/3322/
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
    public boolean isCousins(TreeNode root, int x, int y) {
      boolean[] ans = new boolean[1];

        int levelOfTree=0;
        
            if(checkCousins(root, x, y, levelOfTree, ans)==-1){
                return ans[0];
            }
        return false;
    }
    private int checkCousins(TreeNode root, int x, int y, int levelOfTree, boolean[] ans) {
        if (root == null) 
                return -1;
        
        if (root.val == x || root.val == y) 
                return levelOfTree;
        
        //System.out.println(root.val);
        
        int leftNodeLevel = checkCousins(root.left, x, y, levelOfTree + 1, ans);
        
       //System.out.println(leftNodeLevel + " Parent Left node Level returned if matched to x");
        
     
        int rightNodeLevel = checkCousins(root.right, x, y, levelOfTree + 1, ans);
        
       // System.out.println(rightNodeLevel + "level of the parent right node ");
        
        //only if node value is not null, otherwise level for node will be -1, failing this to proceed 
        if (leftNodeLevel != -1 && rightNodeLevel != -1) {
            if (leftNodeLevel == rightNodeLevel && leftNodeLevel != levelOfTree + 1) 
                ans[0] = true;
                return -1;
        }
       // System.out.println("Hi DFS");
        if(leftNodeLevel==-1)
            return rightNodeLevel;
        else
            return leftNodeLevel;
    }
}
