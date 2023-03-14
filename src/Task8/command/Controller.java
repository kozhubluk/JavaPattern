package Task8.command;

public class Controller // инициатор
{
    ICommand command;

    public Controller() { }

    public void SetCommand(ICommand com)
    {
        command = com;
    }

    public void PressButton() throws InterruptedException {
        command.execute();
    }
    public void PressUndo()
    {
        command.undo();
    }
}