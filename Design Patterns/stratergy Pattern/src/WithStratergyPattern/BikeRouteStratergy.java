package WithStratergyPattern;

import WithoutStratergyPattern.Region;

public class BikeRouteStratergy implements RouteStratergy{
    public void GenerateRoute(Region A, Region B) {
        System.out.println("Route generated for travel by bike from "+A.getName()+ "to "+B.getName());
    }
}
