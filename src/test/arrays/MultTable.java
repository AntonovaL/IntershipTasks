package test.arrays;

public class MultTable {
    int[][] table;
    int n;
    public MultTable(int n) {
        this.n = n;
        table = new int[n][n];
    }

    public int[][] getTable(){
        for(int i=0; i<n; i++){
            for (int j=0; j<n; j++){
                table[i][j]=(i+1)*(j+1);
            }
        }
        return table;
    }

}
