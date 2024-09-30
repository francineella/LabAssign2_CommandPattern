package commandPattern;

public class Thermostat implements SmartDevice {
    public String turnOn() {
        return "Thermostat switched-on!";
    }
    public String turnOff(){
        return "Thermostat switched-off";
    }
    public String increase(){
        return "Increasing the temperature..";
    }
    public String decrease(){
        return "Decreasing the temperature..";
    }
}
