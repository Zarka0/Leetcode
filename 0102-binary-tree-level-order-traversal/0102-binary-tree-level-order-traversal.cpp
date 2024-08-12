class Solution {
public:
    vector<vector<int>> levelOrder(TreeNode* root) {
        vector<vector<int>> res;
        if (root == nullptr) return res;  // Handle the case where the root is nullptr

        queue<TreeNode*> q;
        q.push(root);
        while (!q.empty()) {
            int level_size = q.size();
            vector<int> current_lev;
            for (int i = 0; i < level_size; i++) {
                TreeNode* current = q.front();
                q.pop();
                current_lev.push_back(current->val);
                if (current->left != nullptr) q.push(current->left);
                if (current->right != nullptr) q.push(current->right);
            }
            res.push_back(current_lev);
        }
        return res;
    }
};
