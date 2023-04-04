package WithStratergyPattern;

import WithoutStratergyPattern.Region;

public class NavigationApp {
    public static void main(String[] args){
        Region A=new Region(1,"machupalli");
        Region B=new Region(2,"kadapa");
        Navigation navigation1=new NavigationByBike(new BikeRouteStratergy());
        navigation1.Route(A,B);
        Navigation navigation2=new NavigationByCar(new CarRouteStratergy());
        navigation2.Route(A,B);
        Navigation navigation3=new NavigationByWalk(new ByWalkRouteStratergy());
        navigation3.Route(A,B);
    }



    //read action->ByWalk or Bycar or etc


}

