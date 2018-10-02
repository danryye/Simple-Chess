

public class Piece
{
    private int color; //white = 0, black = 1
    private int pieceType;
    
    public static final int WHITE = 0;
    public static final int BLACK = 1;
    public static final int PAWN = 0;
    public static final int ROOK = 1;
    public static final int KNIGHT = 2;
    public static final int BISHOP = 3;
    public static final int QUEEN = 4;
    public static final int KING = 5;
    

    public Piece(int color, int pieceType)
    {
        this.color = color;
        this.pieceType = pieceType;
    }
    

    public String getInitials()
    {
        String col;
        if(color == Piece.WHITE){col = "W";}
        else{col = "B";}
        if(pieceType == Piece.PAWN){return col + "P";}
        else if(pieceType == Piece.ROOK){return col + "R";}
        else if(pieceType == Piece.KNIGHT){return col + "K";}
        else if(pieceType == Piece.BISHOP){return col + "B";}
        else if(pieceType == Piece.QUEEN){return col + "Q";}
        else if(pieceType == Piece.KING){return col + "K";}
        else{return "ERROR";}
    }
    
    public int color()
    {
        return color;
    }
    
    public int pieceType()
    {
        return pieceType;
    }
}
