package commandPattern;

public class Decrease implements Command {
    private SmartDevice device;

    public Decrease(SmartDevice device){
        this.device = device;
    }


    @Override
    public String execute() {
        return device.decrease();
    }
}