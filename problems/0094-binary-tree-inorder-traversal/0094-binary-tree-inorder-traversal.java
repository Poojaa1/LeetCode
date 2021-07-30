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
    public List<Integer> inorderTraversal(TreeNode root) {
   
        Stack<TreeNode>s=new Stack<TreeNode>();
        List<Integer>llist=new ArrayList<Integer>();
             TreeNode temp=root;
         
        while(!s.isEmpty()||temp!=null){
            if(temp!=null){
                s.push(temp);
                temp=temp.left;
            }
              else
              {
                  temp=s.pop();
                     llist.add(temp.val);
                  temp=temp.right;
              }
            
            }return llist;
        }
    }