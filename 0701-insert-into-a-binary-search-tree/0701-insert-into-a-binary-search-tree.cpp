/**
 * Definition for a binary tree node.
 * struct TreeNode {
 *     int val;
 *     TreeNode *left;
 *     TreeNode *right;
 *     TreeNode() : val(0), left(nullptr), right(nullptr) {}
 *     TreeNode(int x) : val(x), left(nullptr), right(nullptr) {}
 *     TreeNode(int x, TreeNode *left, TreeNode *right) : val(x), left(left), right(right) {}
 * };
 */
class Solution {
public:
    TreeNode* insertIntoBST(TreeNode* root, int val) {
        //with recursion
        // if(root==nullptr) return new TreeNode(val);
        // if (val < root->val) {
        //     root->left = insertIntoBST(root->left, val);
        // } else{
        //     root->right=insertIntoBST(root->right, val);
        // }
        // return root;
        TreeNode* newNode= new TreeNode(val);
        if(root==nullptr){
            return newNode;
        }
        TreeNode* current=root;
        TreeNode* parent=NULL;

        while(current!=NULL){
            parent=current;
            if(val<current->val){
                current=current->left;
            }else{
                current=current->right;
            }
        }
            if(val<parent->val){
                parent->left=newNode;
            }else{
                parent->right=newNode;
            }
        
        return root;
    }
};