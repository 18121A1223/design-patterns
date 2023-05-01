import Abstraction.RadioRemote;
import Abstraction.Remote;
import Abstraction.TvRemote;
import Implementation.Device;
import Implementation.Tv;

public class Demo {

    public static void main(String[] args){

        Device Tv = new Tv(0,Boolean.FALSE);


        Remote remote = new TvRemote(Tv);

        remote.EnableDevice();
        remote.volume();
        remote.volume();
        remote.volume();
        remote.EnableDevice();

    }
}
