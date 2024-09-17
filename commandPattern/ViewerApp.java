package commandPattern;

public class ViewerApp {
    public static void main(String[] args){
        Tv tv = new Tv();
        RemoteControl rc = new RemoteControl();

        PowerOn powerOn = new PowerOn(tv);
        rc.setCommand(powerOn);
        rc.clickButton();

        PowerOff powerOff = new PowerOff(tv);
        rc.setCommand(powerOff);
        rc.clickButton();
    }
}
