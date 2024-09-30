package commandPattern;

public class RemoteControl {
    private Command turnOnCommand;
    private Command turnOffCommand;
    private Command increaseCommand;
    private Command decreaseCommand;
   

    public void setTurnOnCommand(Command turnOnCommand) {
        this.turnOnCommand = turnOnCommand;
    }

    public void setTurnOffCommand(Command turnOffCommand) {
        this.turnOnCommand = turnOffCommand;
    }

    public void setIncreaseCommand(Command increaseCommand) {
        this.increaseCommand = increaseCommand;
    }

    public void setDecreaseCommand(Command decreaseCommand) {
        this.decreaseCommand = decreaseCommand;
    }

    public void turnOn(){
        turnOnCommand.execute();
    }
    public void turnOff(){
        turnOffCommand.execute();
    }
    public void increase(){
        increaseCommand.execute();
    }
    public void decrease(){
        decreaseCommand.execute();
    }
}
