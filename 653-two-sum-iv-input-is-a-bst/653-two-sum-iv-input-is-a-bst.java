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
    public boolean findTarget(TreeNode root, int k) {
        HashMap<Integer,Integer> map=new HashMap<>();
        return dfs(root,map,k);
    }
    public static boolean dfs(TreeNode root,HashMap<Integer,Integer> map,int k){
        if(root == null)return false;
            int rem=k-root.val;
if(map.getOrDefault(rem,0)==1){
                return true;
        }
        map.put(root.val,1);
        return dfs(root.left,map,k) || dfs(root.right,map,k);
    }
}