package WithStratergyPattern;

import WithoutStratergyPattern.Region;

public class Navigation {
    RouteStratergy routeStratergy;

    public Navigation(RouteStratergy routeStratergy) {
        this.routeStratergy = routeStratergy;
    }
    public void Route(Region A, Region B){
        this.routeStratergy.GenerateRoute(A,B);
    }
}
