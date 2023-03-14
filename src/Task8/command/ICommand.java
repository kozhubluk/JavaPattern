package Task8.command;

public interface ICommand {
    void execute() throws InterruptedException;
    void undo();
}
