package squarepegsConversion;

public class SquarePegToRoundPegConversion extends RoundPeg {
    private SquarePegs squarePegs;

    public SquarePegToRoundPegConversion( SquarePegs squarePegs) {
        this.squarePegs = squarePegs;
    }

    @Override
    public int getRadius() {
        int radius = (int) (Math.sqrt(2)*squarePegs.getWidth())/2;
        return radius;
    }
}
