class Solution {
public:
    vector<vector<int>> flipAndInvertImage(vector<vector<int>>& image) {
          int rows = image.size();
        for (int i = 0; i < rows; i++) {
            int low = 0;
            int high = image[i].size() - 1;
            while (low <= high) {
                if (image[i][low] == image[i][high]) {
                    image[i][low] = 1 - image[i][low];
                    image[i][high] = 1 - image[i][high];
                }
                    image[i][low] = 1 - image[i][low];
                }
                low++;
                high--;
            }
        
        return image; 
    }
};