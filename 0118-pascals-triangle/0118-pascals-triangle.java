class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> triangle =new ArrayList<>();
        if(numRows==0) return triangle;
        List<Integer> first_row=new ArrayList<>();
        first_row.add(1);
        triangle.add(first_row);
        for(int i=1; i<numRows; i++){
            List<Integer> prev=triangle.get(i-1);
            List<Integer> row=new ArrayList<>();
            
            row.add(1);
            for(int j=1; j<i; j++){
                row.add(prev.get(j)+prev.get(j-1));
            }
            row.add(1);
            triangle.add(row);
        }
        return triangle;
    }
}