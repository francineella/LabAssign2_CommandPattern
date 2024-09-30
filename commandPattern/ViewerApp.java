package commandPattern;

public class ViewerApp {
    public static void main(String[] args){
        SmartDevice lights = new Lights();
        SmartDevice thermostat = new Thermostat();
        
        Command lightsOn = new TurnOn(lights);
        Command lightsOff = new TurnOff(lights);
        Command lightsIncrease = new Increase(lights);
        Command lightsDecrease = new Decrease(lights);

        Command thermostatOn = new TurnOn(thermostat);
        Command thermostatOff = new TurnOff(thermostat);
        Command thermostatIncrease = new Increase(thermostat);
        Command thermostatDecrease = new Decrease(thermostat);

        RemoteControl remoteControl = new RemoteControl();

        remoteControl.setTurnOnCommand(lightsOn);
        remoteControl.setTurnOffCommand(lightsOff);
        remoteControl.setIncreaseCommand(lightsIncrease);
        remoteControl.setDecreaseCommand(lightsDecrease);

        System.out.println("Controlling Lights...");
        remoteControl.turnOn();
        remoteControl.increase();
        remoteControl.decrease();
        remoteControl.turnOff();

        remoteControl.setTurnOnCommand(thermostatOn);
        remoteControl.setTurnOffCommand(thermostatOff);
        remoteControl.setIncreaseCommand(thermostatIncrease);
        remoteControl.setDecreaseCommand(thermostatDecrease);

        System.out.println("\nControlling thermostat...");
        remoteControl.turnOn();
        remoteControl.turnOff();
        remoteControl.increase();
        remoteControl.decrease();
        
    }
}
