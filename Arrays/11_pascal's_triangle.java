// Problem: Given an integer numRows, return the first numRows of Pascal's triangle.
// Link: https://leetcode.com/problems/pascals-triangle/
// [tc=nlogn, sc=n] 
// figured out the formula in notes. 
class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> triangle= new ArrayList<>();
        for(int i=0; i<numRows; i++){
            List<Integer> row= new ArrayList<>();
            for(int j=0; j<=i; j++){
                if(j==0 || i==j){
                    row.add(1);
                }
                else{
                    int leftup=triangle.get(i-1).get(j-1);
                    int rightup=triangle.get(i-1).get(j);
                    row.add(leftup+rightup);
                }
            }
            triangle.add(row);
        }
        return triangle;
    }
}