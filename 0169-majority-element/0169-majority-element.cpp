class Solution {
public:
    int majorityElement(vector<int>& nums) {
     map<int, int> count;
	for(int i=0; i<n; i++){
		count[arr[i]]++;
	}
	for(auto i=count.begin(); i!=count.end(); i++){
		  if (i->second > n / 2) {
            return i->first;  
        }
	}
	return -1;   
    };