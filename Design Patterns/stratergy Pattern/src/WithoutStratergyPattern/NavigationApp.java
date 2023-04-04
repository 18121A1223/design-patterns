package WithoutStratergyPattern;

public class NavigationApp {
    public static void main(String[] args){
        Region A=new Region(1,"machupalli");
        Region B=new Region(2,"kadapa");

        Navigation navigation=new NavigationByWalk(A,B);
        navigation.GenerateRoute();
    }



    //read action->ByWalk or Bycar or etc


}

