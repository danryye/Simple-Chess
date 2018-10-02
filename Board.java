
public class Board
{
    private Piece[][] gameBoard;
    private int turn;
    
    public static void main(String[]args)
    {
        Board board = new Board();
        board.printBoard();
    }
    
    
    public Board()
    {
        gameBoard = new Piece[8][8];
        turn = 0;
        setUpBoard();
    }
    
    public void printBoard()
    {
        if(turn % 2 == 1){System.out.print("*");};
        System.out.println("Player 1");
        if(turn % 2 == 1){System.out.print("*");};
        System.out.println("---------------------------");  //TODO check size
        for(int i = 0; i < gameBoard.length; i++){
            System.out.print("| ");
            for(int j = 0; j < gameBoard.length; j++){
                if(gameBoard[i][j] != null){
                    System.out.print(gameBoard[i][j].getInitials());
                }
                else
                {
                    System.out.print("  "); //TODO check size
                }
                System.out.print(" ");
            }
            System.out.print("|");
            System.out.println(getRowLetter(i));
        }
          System.out.println("---------------------------");  //TODO check size
          System.out.println("  A B C D E F G H  ");  //TODO check size
    }
    
    private String getRowLetter(int rowNumber){
        if(rowNumber == 0){return "A";}
        else if(rowNumber == 1){return "B";}
        else if(rowNumber == 2){return "C";}
        else if(rowNumber == 3){return "D";}
        else if(rowNumber == 4){return "E";}
        else if(rowNumber == 5){return "F";}
        else if(rowNumber == 6){return "G";}
        else{return "H";}
    }
    
    private void setUpBoard()
    {
        //Pawns
        gameBoard[1][0] = new Piece(Piece.BLACK, Piece.PAWN);
        gameBoard[1][1] = new Piece(Piece.BLACK, Piece.PAWN);
        gameBoard[1][2] = new Piece(Piece.BLACK, Piece.PAWN);
        gameBoard[1][3] = new Piece(Piece.BLACK, Piece.PAWN);
        gameBoard[1][4] = new Piece(Piece.BLACK, Piece.PAWN);
        gameBoard[1][5] = new Piece(Piece.BLACK, Piece.PAWN);
        gameBoard[1][6] = new Piece(Piece.BLACK, Piece.PAWN);
        gameBoard[1][7] = new Piece(Piece.BLACK, Piece.PAWN);
        
        gameBoard[6][0] = new Piece(Piece.WHITE, Piece.PAWN);
        gameBoard[6][1] = new Piece(Piece.WHITE, Piece.PAWN);
        gameBoard[6][2] = new Piece(Piece.WHITE, Piece.PAWN);
        gameBoard[6][3] = new Piece(Piece.WHITE, Piece.PAWN);
        gameBoard[6][4] = new Piece(Piece.WHITE, Piece.PAWN);
        gameBoard[6][5] = new Piece(Piece.WHITE, Piece.PAWN);
        gameBoard[6][6] = new Piece(Piece.WHITE, Piece.PAWN);
        gameBoard[6][7] = new Piece(Piece.WHITE, Piece.PAWN);
        //Rooks
        gameBoard[0][0] = new Piece(Piece.BLACK, Piece.ROOK);
        gameBoard[0][7] = new Piece(Piece.BLACK, Piece.ROOK);
        
        gameBoard[7][0] = new Piece(Piece.WHITE, Piece.ROOK);
        gameBoard[7][7] = new Piece(Piece.WHITE, Piece.ROOK);
        //Knights
        gameBoard[0][1] = new Piece(Piece.BLACK, Piece.KNIGHT);
        gameBoard[0][6] = new Piece(Piece.BLACK, Piece.KNIGHT);
        
        gameBoard[7][1] = new Piece(Piece.WHITE, Piece.KNIGHT);
        gameBoard[7][6] = new Piece(Piece.WHITE, Piece.KNIGHT);
        //Bishops
        gameBoard[0][2] = new Piece(Piece.BLACK, Piece.BISHOP);
        gameBoard[0][5] = new Piece(Piece.BLACK, Piece.BISHOP);
        
        gameBoard[7][2] = new Piece(Piece.WHITE, Piece.BISHOP);
        gameBoard[7][5] = new Piece(Piece.WHITE, Piece.BISHOP);
        //Queens
        gameBoard[0][3] = new Piece(Piece.BLACK, Piece.QUEEN);

        gameBoard[7][3] = new Piece(Piece.WHITE, Piece.QUEEN);
        //Kings
        gameBoard[0][4] = new Piece(Piece.BLACK, Piece.KING);

        gameBoard[7][4] = new Piece(Piece.WHITE, Piece.KING);
    }
}

