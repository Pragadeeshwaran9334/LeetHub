class Solution {
    public void preorder(TreeNode root, List<Integer> result)
    {
        if(root==null)
        {
            return;
        }
         result.add(root.val); 
        preorder(root.left,result);  
        preorder(root.right,result);
    }
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>(); 
        preorder(root,result); 
        return result;
    }
}