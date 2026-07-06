class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> list = new ArrayList<>();
        int sRow = 0;
        int eRow = matrix.length-1;
        int sCol = 0;
        int eCol = matrix[0].length-1;
        while(sRow<=eRow && sCol <= eCol){

            // Top 
            for(int i = sCol; i<=eCol; i++){
                list.add(matrix[sRow][i]);
            }
            sRow++;

            // right
            for(int i = sRow; i<=eRow; i++){
                list.add(matrix[i][eCol]);
            }
            eCol--;

            // bottom
            for(int i = eCol; i>=sCol; i--){
                if(sRow>eRow){
                    break;
                }
                list.add(matrix[eRow][i]);
            }
            eRow--;

            // left
            for(int i = eRow; i>=sRow; i--){
                if(sCol > eCol){
                    break;
                }
                list.add(matrix[i][sCol]);
            }
            sCol++;

        }
        return list;
    }
}