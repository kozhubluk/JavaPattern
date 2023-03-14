package Task8.command;

public class MicrowaveCommand implements ICommand{
    Microwave microwave;
    int time;
    public MicrowaveCommand(Microwave m, int t)
    {
        microwave = m;
        time = t;
    }
    public void execute() throws InterruptedException {
        microwave.StartCooking(time);
        microwave.StopCooking();
    }

    public void undo()
    {
        microwave.StopCooking();
    }
}
