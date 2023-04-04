package WithoutStratergyPattern;

public class Navigation {
    Region A;
    Region B;

    public Navigation(Region a, Region b) {
        this.A = a;
        this.B = b;
    }

    public void GenerateRoute(){
        System.out.println("generated root between two regions"+this.A.name+" and "+this.B.name);
    }
}
