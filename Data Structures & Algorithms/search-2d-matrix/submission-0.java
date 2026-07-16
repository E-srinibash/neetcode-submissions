class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        
        int m = matrix.length-1;
        int n = matrix[0].length-1;
        int i = 0;
        int j = matrix[0].length-1;
        while(i<=m && j>=0){
            int current = matrix[i][j];
            if(target == current){
                return true;
            }
            else if(target>current){
                i++;
            }
            else{
                j--;
            }
        }
        return false;
    }
}
