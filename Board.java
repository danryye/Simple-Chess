import java.util.Scanner;

public class Board
{
    public static boolean gameOver = false;
    
    public static void main(String[]args)
    {
        Scanner in = new Scanner(System.in);
        Board board = new Board();
        String player = "";
        
        while(!gameOver)
        {
            board.printBoard();
            
            if(board.getTurn() % 2 == 0)
            {
                player = "White";
            }
            else
            {
                player = "Black";
            }
            System.out.println("It is " + player + "'s turn. Type the piece you would like to move (ex. A6)");
            String pos1 = in.next();
            System.out.println("It is " + player + "'s turn. Type the postion you would like to move the piece to(ex. C6)");
            String pos2 = in.next();
            boolean validMove = Moves.movePiece(board.getTurn(), pos1, pos2);
            if(validMove)//TODO isCurrentPlayerInCheck()
            {
                if(Moves.isOpponentInCheck())
                {
                    
                }
            }
            gameOver = true; //TODO
        }
        
        board.printBoard();
        System.out.println("Good Game! " + player + " won in " + board.getTurn() + " turns!");
    }
    
    /**      Main Class       */
    private Piece[][] gameBoard;
    private int turn;
    
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
          System.out.println("   1  2  3  4  5  6  7  8  ");  //TODO check size
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
        gameBoard[1][0] = new Pawn(Piece.BLACK);
        gameBoard[1][1] = new Pawn(Piece.BLACK);
        gameBoard[1][2] = new Pawn(Piece.BLACK);
        gameBoard[1][3] = new Pawn(Piece.BLACK);
        gameBoard[1][4] = new Pawn(Piece.BLACK);
        gameBoard[1][5] = new Pawn(Piece.BLACK);
        gameBoard[1][6] = new Pawn(Piece.BLACK);
        gameBoard[1][7] = new Pawn(Piece.BLACK);
        
        gameBoard[6][0] = new Pawn(Piece.WHITE);
        gameBoard[6][1] = new Pawn(Piece.WHITE);
        gameBoard[6][2] = new Pawn(Piece.WHITE);
        gameBoard[6][3] = new Pawn(Piece.WHITE);
        gameBoard[6][4] = new Pawn(Piece.WHITE);
        gameBoard[6][5] = new Pawn(Piece.WHITE);
        gameBoard[6][6] = new Pawn(Piece.WHITE);
        gameBoard[6][7] = new Pawn(Piece.WHITE);
        //Rooks
        gameBoard[0][0] = new Rook(Piece.BLACK);
        gameBoard[0][7] = new Rook(Piece.BLACK);
        
        gameBoard[7][0] = new Rook(Piece.WHITE);
        gameBoard[7][7] = new Rook(Piece.WHITE);
        //Knights
        gameBoard[0][1] = new Knight(Piece.BLACK);
        gameBoard[0][6] = new Knight(Piece.BLACK);
        
        gameBoard[7][1] = new Knight(Piece.WHITE);
        gameBoard[7][6] = new Knight(Piece.WHITE);
        //Bishops
        gameBoard[0][2] = new Bishop(Piece.BLACK);
        gameBoard[0][5] = new Bishop(Piece.BLACK);
        
        gameBoard[7][2] = new Bishop(Piece.WHITE);
        gameBoard[7][5] = new Bishop(Piece.WHITE);
        //Queens
        gameBoard[0][3] = new Queen(Piece.BLACK);

        gameBoard[7][3] = new Queen(Piece.WHITE);
        //Kings
        gameBoard[0][4] = new King(Piece.BLACK);

        gameBoard[7][4] = new Piece(Piece.WHITE);
    }
    
    public int getTurn()
    {
        return this.turn;
    }
}

