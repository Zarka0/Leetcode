class Solution {
public:
    int numJewelsInStones(string jewels, string stones) {
        bool jewelMap[128]={false};
        for(char jewel: jewels){
            jewelMap[jewel]=true;

        }
        int count=0;
        for (char stone : stones) {
            if (jewelMap[stone]) {
                count++;
            }
        }
        return count;
    }
};
