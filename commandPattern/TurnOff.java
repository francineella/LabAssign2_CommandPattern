package commandPattern;

public class TurnOff implements Command {
    private SmartDevice device;

    public TurnOff(SmartDevice device){
        this.device = device;
    }


    @Override
    public String execute() {
        return device.turnOff();
    }
}
