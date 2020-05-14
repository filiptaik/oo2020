
public interface TTTMethods {

    public char getPlayerMark();
    public void makeBoard();
    public void showBoard();
    public boolean placeMark(int row, int col);
    public void changePlayer();
    public boolean checkRowCol(char c1, char c2, char c3);
    public boolean rows();
    public boolean columns();
    public boolean diagonals();
    public boolean isFull();
    public boolean isWinner();

}