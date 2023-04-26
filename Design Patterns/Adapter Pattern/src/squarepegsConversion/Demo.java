package squarepegsConversion;

import squarepegsConversion.RoundHoles;
import squarepegsConversion.RoundPeg;
import squarepegsConversion.SquarePegToRoundPegConversion;
import squarepegsConversion.SquarePegs;

public class Demo {
    public static void main(String args[]){
        RoundHoles roundHoles = new RoundHoles(5);

        RoundPeg roundPeg = new RoundPeg(5);

        roundHoles.fittingTest(roundPeg);

        SquarePegs squarePegs = new SquarePegs(5);
        SquarePegs squarePegs1 = new SquarePegs(6);

        RoundPeg roundPegFromSquare = new SquarePegToRoundPegConversion(squarePegs);
        RoundPeg roundPegFromSquare1 = new SquarePegToRoundPegConversion(squarePegs1);

        roundHoles.fittingTest(roundPegFromSquare);
        roundHoles.fittingTest(roundPegFromSquare1);

    }
}
