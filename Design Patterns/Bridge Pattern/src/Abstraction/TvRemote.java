package Abstraction;

import Implementation.Device;

public class TvRemote implements Remote{
    Device device;

    public TvRemote(Device device) {
        this.device = device;
    }

    @Override
    public void volume() {
        device.Increasevolume();

    }

    @Override
    public void EnableDevice() {
        device.EnableDevice();
    }
}
