package Implementation;

import javax.xml.stream.FactoryConfigurationError;

public class Tv implements Device{

    private Integer volume;

    private Boolean poweredOn;

    public Tv(Integer volume, Boolean poweredOn) {
        this.volume = volume;
        this.poweredOn = poweredOn;
    }

    public Integer getVolume() {
        return volume;
    }

    public void setVolume(Integer volume) {
        this.volume = volume;
    }

    public Boolean getPoweredOn() {
        return poweredOn;
    }

    public void setPoweredOn(Boolean poweredOn) {
        this.poweredOn = poweredOn;
    }

    @Override
    public void Increasevolume() {
        if (this.volume == 100)
            System.out.println("print volume is at maximum");
        else{
            this.volume+=10;
            System.out.println("volume Increased"+ this.volume);
        }

    }

    @Override
    public void EnableDevice() {
        if (this.poweredOn){
            this.poweredOn = Boolean.FALSE;
            System.out.println("poweredOff device");
        }
        else{
            this.poweredOn = Boolean.TRUE;
            System.out.println("poweredOn device");
        }

    }
}
