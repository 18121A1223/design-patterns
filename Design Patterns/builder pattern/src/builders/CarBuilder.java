package builders;

import objects.Car;

public class CarBuilder implements Builder {
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

    @Override
    public Builder setEngine(String Engine) {
        this.Engine = Engine;
        return this;
    }

    @Override
    public Builder setTyres(int Tyres) {
        this.tyres = Tyres;

        return this;
    }

    @Override
    public Builder setGearbox(String gearBox) {
        this.gearbox = gearBox;
        return this;
    }

    @Override
    public Builder setSeatCount(int seatCount) {
        this.seatCount = seatCount;
        return this;
    }

    @Override
    public Builder setSuspension(String suspension) {
        this.suspension = suspension;
        return this;
    }

    @Override
    public Builder setHeadlights(String headlights) {
        this.headlights = headlights;
        return this;
    }

    @Override
    public Builder setFuelCapacity(int fuelCapacity) {
        this.fuelCapacity = fuelCapacity;
        return this;
    }

    @Override
    public Builder setDiskBrakes(String diskbrakes) {
        this.diskBrakes = diskbrakes;
        return this;
    }

    @Override
    public Builder setSeatCover(String seatCover) {
        this.SeatCover = seatCover;
        return this;
    }

    @Override
    public Builder setStickering(String stickering) {
        this.stickering = stickering;
        return this;
    }

    public Car getResult(){
        Car car = new Car();
        car.setEngine(Engine);
        car.setGearbox(gearbox);
        car.setHeadlights(headlights);
        car.setDiskBrakes(diskBrakes);
        car.setSeatCount(seatCount);
        car.setSeatCover(SeatCover);
        car.setFuelCapacity(fuelCapacity);
        car.setTyres(tyres);
        car.setSuspension(suspension);
        car.setStickering(stickering);
        return car;
    }

}
