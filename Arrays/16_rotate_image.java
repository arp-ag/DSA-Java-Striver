// Problem: n x n 2D matrix representing an image, rotate the image by 90 degrees (clockwise).
// Link: https://leetcode.com/problems/rotate-image/
// BRUTE: [tc=O(n^2), sc=O(n^2)] make new matrix, put stuff in correct position.
class Solution {
    public void rotate(int[][] matrix) {
        int n=matrix.length;
        int ans[][]=new int[n][n];
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                ans[j][n - 1 - i] = matrix[i][j]; //IMPORTANT
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = ans[i][j];
            }
        }
    }
}

// OPTIMAL: [tc=O(n+n^2), sc=O(1)] transpose matrix, then reverse rows.
class Solution {
    public void rotate(int[][] matrix) {
        int n=matrix.length;
        for(int i=0; i<n-1; i++){  //IMPORTANT
            for(int j=i+1; j<n; j++){  //IMPORTANT
                int temp=matrix[i][j];
                matrix[i][j]=matrix[j][i];
                matrix[j][i]=temp;
            }
        }
        for(int i=0; i<n; i++){
            reverse (matrix[i], 0, n-1);
        }
    }
    public void reverse (int[] arr, int start, int end){
        while(start<end){
            int temp= arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }
    }
}