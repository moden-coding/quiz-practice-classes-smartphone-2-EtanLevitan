public class Smartphone {
    String brand;
    String Model;
    int storageCapaicity;
    int batteryPercentage;
    boolean isOn = false;

    public Smartphone(String brand, String model, int storageCapaicity, int batteryPercentage) {
        isOn =false;
        this.brand = brand;
        this.Model=model;
        this.storageCapaicity=storageCapaicity;
        this.batteryPercentage = batteryPercentage;
    }

    public void turnOn() {
        if (batteryPercentage > 0 && isOn == false) {
            isOn = true;
        } else if (batteryPercentage == 0) {
            isOn = false;
        }
    }

    public void turnOff() {
        isOn = false;
    }

    public void chargePhone(int chargeAmount) {
        if (batteryPercentage + chargeAmount > 100) {
            batteryPercentage = 100;
        }else{
            batteryPercentage+= chargeAmount;
        }
    }
    public String toString(){
        return "Brand: " + brand + " Model: " + Model + " Storage: " + storageCapaicity + " Battery: " + batteryPercentage + " On: " + isOn;
    }
}