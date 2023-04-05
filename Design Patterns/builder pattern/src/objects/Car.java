package objects;

public class Car implements Vehicle{
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

    public Car(String engine, int tyres, String gearbox, int seatCount, String suspension, String headlights, int fuelCapacity, String diskBrakes, String seatCover, String stickering) {
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

    public Car() {
    }

    public String toString() {
        return "Car{" +
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

    public void setEngine(String engine) {
        Engine = engine;
    }

    public void setTyres(int tyres) {
        this.tyres = tyres;
    }

    public void setGearbox(String gearbox) {
        this.gearbox = gearbox;
    }

    public void setSeatCount(int seatCount) {
        this.seatCount = seatCount;
    }

    public void setSuspension(String suspension) {
        this.suspension = suspension;
    }

    public void setHeadlights(String headlights) {
        this.headlights = headlights;
    }

    public void setFuelCapacity(int fuelCapacity) {
        this.fuelCapacity = fuelCapacity;
    }

    public void setDiskBrakes(String diskBrakes) {
        this.diskBrakes = diskBrakes;
    }

    public void setSeatCover(String seatCover) {
        SeatCover = seatCover;
    }

    public void setStickering(String stickering) {
        this.stickering = stickering;
    }

    @Override
    public void start() {
        System.out.println("car started");
    }
}
