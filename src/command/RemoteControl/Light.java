package command.RemoteControl;

public class Light {
    String name;
    Light(String lightName) {
        this.name = lightName;
    }
    public void on() {
        System.out.println(name + " light on");
    }
    public void off() {
        System.out.println(name + " light off");
    }
}
