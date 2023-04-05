package objects;

public class CarManual implements Manual{
    // required features
    String Engine;
    int tyres;
    String gearbox;
    int seatCount;
    String suspension;

    String headlights;
    int fuelCapacity;

    //optional
    String diskBrakes;
    String SeatCover;
    String stickering;

    public CarManual(String engine, int tyres, String gearbox, int seatCount, String suspension, String headlights, int fuelCapacity, String diskBrakes, String seatCover, String stickering) {
        Engine = engine;
        this.tyres = tyres;
        this.gearbox = gearbox;
        this.seatCount = seatCount;
        this.suspension = suspension;
        this.headlights = headlights;
        this.fuelCapacity = fuelCapacity;
        this.diskBrakes = diskBrakes;
        SeatCover = seatCover;
        this.stickering = stickering;
    }

    @Override
    public String toString() {
        return "CarManual{" +
                "Engine='" + Engine + '\'' +
                ", tyres=" + tyres +
                ", gearbox='" + gearbox + '\'' +
                ", seatCount=" + seatCount +
                ", suspension='" + suspension + '\'' +
                ", headlights='" + headlights + '\'' +
                ", fuelCapacity=" + fuelCapacity +
                ", diskBrakes='" + diskBrakes + '\'' +
                ", SeatCover='" + SeatCover + '\'' +
                ", stickering='" + stickering + '\'' +
                '}';
    }

    @Override
    public void generateManual() {
        System.out.println("generated car manual");
    }
}
