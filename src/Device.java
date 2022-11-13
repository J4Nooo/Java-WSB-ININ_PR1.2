public abstract class Device {
    String Producent;
    String Model;

    public Device(String producent, String model) {
        Producent = producent;
        Model = model;
    }
    abstract void recharge(Integer percentage);
    abstract boolean isOn();
}
