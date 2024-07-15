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
    public TreeNode createBinaryTree(int[][] descriptions) {
        Map<Integer, TreeNode> nodeMap = new HashMap<>();
        Set<Integer> children = new HashSet<>();
         
        for(int[] description : descriptions){
            int parentVal = description[0];
            int childVal = description[1];
            boolean isLeft = false;
            if(description[2] == 1){
                isLeft = true;
            }
        if(!nodeMap.containsKey(parentVal)){
            nodeMap.put(parentVal, new TreeNode(parentVal));
        }
        if(!nodeMap.containsKey(childVal)){
            nodeMap.put(childVal, new TreeNode(childVal));
        }
        
        if(isLeft == true){
            nodeMap.get(parentVal).left = nodeMap.get(childVal) ;
        }
        else{
            nodeMap.get(parentVal).right = nodeMap.get(childVal);
        }
        
        children.add(childVal);
    }
        for(TreeNode node : nodeMap.values()){
            if(!children.contains(node.val)){
                return node;
            }
        }
        return null;
    }
}