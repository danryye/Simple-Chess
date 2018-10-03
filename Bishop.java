
public class Bishop
extends Piece
{
    public Bishop(int color)
    {
        super(color);
    }

    public String getInitials()
    {
        String col;
        if(getColor() == Piece.WHITE){col = "W";}
        else{col = "B";}
        return col + "B";
    }
}
