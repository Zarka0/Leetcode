class Solution {
    public boolean uniqueOccurrences(int[] arr) {
    HashMap<Integer,Integer> map= new HashMap<>();
 for(int i=0;i<arr.length;i++)
{
    if(map.containsKey(arr[i])){
        int n= map.get(arr[i])+1;
       map.put(arr[i], n);
    }

    else
    {
        map.put(arr[i], 1);
    }

    }
     Set<Integer> seenValues = new HashSet<>();

    for (int value : map.values()) {
        if (!seenValues.add(value)) {
            return false;
        }
    }

    return true;
}
}
