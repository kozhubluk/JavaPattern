package Task8.command;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Controller controller = new Controller();
        TV tv = new TV();

        controller.SetCommand(new TVOnCommand(tv));
        controller.PressButton();
        controller.PressUndo();

        Microwave microwave = new Microwave();
        controller.SetCommand(new MicrowaveCommand(microwave, 2));
        controller.PressButton();
    }
}
