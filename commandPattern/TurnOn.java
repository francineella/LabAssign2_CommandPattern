package commandPattern;

public class TurnOn implements Command {
    private SmartDevice device;

    public TurnOn(SmartDevice device){
        this.device = device;
    }

    @Override
    public String execute() {
        return device.turnOn();
    }
}