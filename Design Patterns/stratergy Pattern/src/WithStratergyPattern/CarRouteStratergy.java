package WithStratergyPattern;

import WithoutStratergyPattern.Region;

import java.sql.SQLOutput;

public class CarRouteStratergy implements RouteStratergy{
    @Override
    public void GenerateRoute(Region A, Region B) {
        System.out.println("Route generated for travel by car from "+A.getName()+ " to "+B.getName());
    }

}

