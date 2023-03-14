package Task8.command;

public class TVOnCommand implements ICommand {
    TV tv;
    public TVOnCommand(TV tvSet)
    {
        tv = tvSet;
    }
    public void execute()
    {
        tv.On();
    }
    public void undo()
    {
        tv.Off();
    }
}
