// Problem: if an element is 0, set its entire row and column to 0's.
// Link: https://leetcode.com/problems/set-matrix-zeroes/
// BRUTE: [tc=(n*m)(n+m)+(n*m) ~ n^3] encounter any 0, set rows and cols -1, then change all -1 to zero.
// BETTER: [tc=2*n*m, sc=n+m] take two arrays- rows and cols to MARK pos which has a 0,
// then, mark positions as 0 referencing the ros and cols matrix.
class Solution {
    public void setZeroes(int[][] matrix) {
        int m=matrix.length;
        int n=matrix[0].length;
        int[] row=new int[m];
        int[] col=new int[n];
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                if (matrix[i][j]==0){
                    row[i]=1;
                    col[j]=1;
                }
            }
        }
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                if(row[i]==1 || col[j]==1){
                    matrix[i][j]=0;
                }
            }
        }
    }
}

// OPTIMAL: [tc= O(2(m*n)+m+n) ~n^2, sc: O[1]]
class Solution {
    public void setZeroes(int[][] matrix) {
        int m=matrix.length;
        int n=matrix[0].length;
        int col0=1;
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                if(matrix[i][j]==0){
                    matrix[i][0]=0;
                    if (j==0){
                        col0=0;
                    }
                    else{
                        matrix[0][j]=0;
                    }
                }
            }
        }
        // cells except i=0 or j=0.
        for(int i=1; i<m; i++){
            for(int j=1; j<n; j++){
                if(matrix[0][j]==0 || matrix[i][0]==0){
                    matrix[i][j]=0;
                }
            }
        }
        // cells [0][j] (j>0, first row columns except [0][0])
        if(matrix[0][0]==0){
            for(int j=1; j<n; j++){
                matrix[0][j]=0;
            }
        }
        // cells [0][i]
        if(col0==0){
            for(int i=0; i<m; i++){
                matrix[i][0]=0;
            }
        }
    }
}