package WithoutStratergyPattern;

public class NavigationByCar extends Navigation{
    public NavigationByCar(Region a, Region b) {
        super(a, b);
    }
    public void GenerateRoute(){
        System.out.println("generated root by car between two regions"+this.A.name+" and "+this.B.name);
    }
}
