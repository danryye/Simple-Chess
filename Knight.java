
public class Knight
extends Piece
{
    public Knight(int color)
    {
        super(color);
    }

    public String getInitials()
    {
        String col;
        if(getColor() == Piece.WHITE){col = "W";}
        else{col = "B";}
        return col + "K";
    }
}
