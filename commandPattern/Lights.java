package commandPattern;

public class Lights implements SmartDevice {
    public String turnOn() {
        return "Lights are switched-on!";
    }

    public String turnOff(){
        return "Lights are switched-off";
    }
    public String increase(){
        return "Increasing the brightness..";
    }
    public String decrease(){
        return "Decreasing the brightness..";
    }
}

