package command.RemoteControl;

public class NoCommand implements Command{
    @Override
    public void execute() {
        System.out.println("do nothing...");
    }
}
