class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int low1 = 0;
        int high1 = matrix.length - 1;
        int low2 = 0;
        int high2 = matrix[0].length - 1;
        while (low1 <= high1) {
            int mid = (high1 - low1) / 2 + low1;
            if (matrix[mid][0] == target || matrix[mid][high2] == target) {
                return true;
            } else if (matrix[mid][0] < target && matrix[mid][high2] > target) {
                int row = mid;
                while (low2 <= high2) {
                    mid = (high2 - low2) / 2 + low2;
                    if (matrix[row][mid] == target) {
                        return true;
                    } else if (matrix[row][mid] < target) {
                        low2 = mid + 1;
                    } else {
                        high2 = mid - 1;
                    }
                }
                return false;
            } else if (matrix[mid][0] < target) {
                low1 = mid + 1;
            } else {
                high1 = mid - 1;
            }
        }
        return false;
    }
}
