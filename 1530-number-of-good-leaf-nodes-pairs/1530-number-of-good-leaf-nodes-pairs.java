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
    public int countPairs(TreeNode root, int distance) {
        return postOrder(root, distance)[11];
    }
    private int[] postOrder(TreeNode currentNode, int distance) {
        if (currentNode == null) return new int[12];
        else if (currentNode.left == null && currentNode.right == null) {
            int[] current = new int[12];
            current[0] = 1;
            return current;
        }
        int[] left = postOrder(currentNode.left, distance);
        int[] right = postOrder(currentNode.right, distance);
        int[] current = new int[12];
        for (int i = 0; i < 10; i++) {
            current[i + 1] += left[i] + right[i];
        }
        current[11] += left[11] + right[11];
        for (int d1 = 0; d1 <= distance; d1++) {
            for (int d2 = 0; d2 <= distance; d2++) {
                if (2 + d1 + d2 <= distance) {
                    current[11] += left[d1] * right[d2];
                }
            }
        }

        return current;
    }
}