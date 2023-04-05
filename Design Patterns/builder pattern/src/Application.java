import builders.CarBuilder;
import objects.Car;
import objects.Vehicle;

public class Application {

    public static void main(String[] args){
        CarBuilder carBuilder = (CarBuilder) new CarBuilder().setEngine("bs6 Engine")
                .setFuelCapacity(50).setGearbox("6 box").setHeadlights("4 LED").setSeatCount(4)
                .setSuspension("normal Suspension").setTyres(4).setDiskBrakes("disk brakes");
        Car car = carBuilder.getResult();
        System.out.println(car.toString());


    }







}
