package devices;

public abstract class Device {
    String Producent;
    String Model;
    public Double Value;

    public Device(String producent, String model, Double value) {
        Producent = producent;
        Model = model;
        Value = value;
    }

    public Device(String producent, String model) {
    }

    abstract void recharge(Integer percentage);
    abstract boolean isOn();

    public String toString(){
        return "Producent: " + this.Producent + " Model: " + this.Model + " Wartość: " + this.Value;
    }
}
