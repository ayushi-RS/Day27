class Solution {

int max=0;

int dia(TreeNode root){
    
    if(root==null)return 0;
    
    int lft=dia(root.left);
    int rht=dia(root.right);
    
    if(max<lft+rht)max=rht+lft;
    
    return 1+Math.max(lft,rht);        
    
}



public int diameterOfBinaryTree(TreeNode root) {
    
    dia(root); 
    return max;
    
}
}

