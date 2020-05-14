
public class TTT implements TTTMethods{

    private char[][] board;
    private char playerMark;

    public TTT(){
        board = new char[3][3];
        playerMark = 'x';
        makeBoard();
    }

    @Override
    public char getPlayerMark() {
        return playerMark;
    }


    public void makeBoard(){

        for(int i = 0; i < 3; i++){

            for(int j = 0; j < 3; j++){
                board[i][j] = '-';
            }
        }
    }

    public void showBoard(){
        System.out.println("-------------");
        for(int i = 0; i < 3; i++){
            System.out.print("| ");
            for(int j = 0; j < 3; j++){
                System.out.print(board[i][j] + " | ");
            }
            System.out.println();
            System.out.println("-------------");
        }
        

    }

    @Override
    public boolean placeMark(int row, int col) {
        if((row >= 0) && (row < 3)) {
            if((col >= 0) && (col < 3)){
                if(board[row][col] == '-'){
                    board[row][col] = playerMark;
                    return true;
                }
            }
        }
        return false;
    }

    @Override
    public void changePlayer() {
        if(playerMark == 'x'){
            playerMark = 'o';
        } else {
            playerMark = 'x';
        }

    }

    @Override
    public boolean checkRowCol(char c1, char c2, char c3) {
        return ((c1 != '-') && (c1 == c2) && (c2 == c3));
    }

    @Override
    public boolean rows() {
        for(int i = 0; i < 3; i++){
            if (checkRowCol(board[i][0], board[i][1], board[i][2]) == true){
                return true;
            } 
        }
        return false;
    }

    @Override
    public boolean columns() {
        for(int i = 0; i < 3; i++){
            if(checkRowCol(board[0][i], board[1][i], board[2][i])){
                return true;
            } 
        }
        return false;
    }

    @Override
    public boolean diagonals() {
        for(int i = 0; i < 3; i++){
            if(checkRowCol(board[0][0], board[1][1], board[2][2])){
                return true;
            } 
        }
        return false;
    }

    @Override
    public boolean isFull() {
        boolean isFull = true;
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
                if(board[i][j] == '-')
                isFull = false;
            }
        }
        return isFull;
    }

    @Override
    public boolean isWinner() {
        return (rows() || columns() || diagonals());
    }

}

