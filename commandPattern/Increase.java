package commandPattern;

public class Increase implements Command {
    private SmartDevice device;

    public Increase(SmartDevice device){
        this.device = device;
    }

    @Override
    public String execute() {
        return device.increase();
    }
}