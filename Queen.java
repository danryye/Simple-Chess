
public class Queen
extends Piece
{
    public Queen(int color)
    {
        super(color);
    }

    public String getInitials()
    {
        String col;
        if(getColor() == Piece.WHITE){col = "W";}
        else{col = "B";}
        return col + "Q";
    }
}
