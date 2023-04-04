package WithStratergyPattern;

import WithoutStratergyPattern.Region;

public class ByWalkRouteStratergy implements RouteStratergy{

    @Override
    public void GenerateRoute(Region A, Region B) {
        System.out.println("generated route for travel by walk from "+A.getName()+" to "+B.getName());
    }
}
