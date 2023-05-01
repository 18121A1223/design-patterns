package Abstraction;

import Implementation.Device;

public class RadioRemote implements Remote{

    Device device;

    public RadioRemote(Device device) {
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
