package WithoutStratergyPattern;

public class NavigationByBike extends Navigation{
    public NavigationByBike(Region a, Region b) {
        super(a, b);
    }
    public void GenerateRoute(){
        System.out.println("generated root by bike between two regions"+this.A.name+" and "+this.B.name);
    }
}
