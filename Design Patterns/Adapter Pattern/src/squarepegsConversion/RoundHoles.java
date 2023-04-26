package squarepegsConversion;



public class RoundHoles {

    private int radius;

    public RoundHoles(int radius){
        this.radius = radius;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public boolean fittingTest(RoundPeg roundpeg){
        if (roundpeg.getRadius()==radius){
            System.out.println(" given round peg with radius "+ roundpeg.radius+ " fits in round hole with radius "+
                    radius);
            return true;
        }
        else{
            System.out.println(" given round peg with radius "+ roundpeg.radius+ " does not fits in round hole with radius "+
                    radius);

            return false;
        }



    }
}
