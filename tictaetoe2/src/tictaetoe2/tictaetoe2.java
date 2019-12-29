package tictaetoe2;

public class tictaetoe2 {


	 
    int[][] matrix;
    public tictaetoe2(int n) {
        matrix = new int[n][n];
    }

    public int move(int row, int col, int player) {
        matrix[row][col]=player;
 
      
        boolean win=true;
        for(int i=0; i<matrix.length; i++){
            if(matrix[row][i]!=player){
                win=false;
                break;
            }
        }
 
        if(win) return player;
 
      
        win=true;
        for(int i=0; i<matrix.length; i++){
            if(matrix[i][col]!=player){
                win=false;
                break;
            }
        }
 
        if(win) return player;
 
       
        win=true;
        for(int i=0; i<matrix.length; i++){
            if(matrix[i][i]!=player){
                win=false;
                break;
            }
        }
 
        if(win) return player;
 
  
        win=true;
        for(int i=0; i<matrix.length; i++){
            if(matrix[i][matrix.length-i-1]!=player){
                win=false;
                break;
            }
        }
 
        if(win) return player;
 
        return 0;
    }
}