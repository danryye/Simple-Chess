
public class Rook
extends Piece
{
    public Rook(int color)
    {
        super(color);
    }

    public String getInitials()
    {
        String col;
        if(getColor() == Piece.WHITE){col = "W";}
        else{col = "B";}
        return col + "R";
    }
}
