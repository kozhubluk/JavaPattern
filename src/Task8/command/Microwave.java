package Task8.command;

import java.util.concurrent.TimeUnit;

public class Microwave
{
    public void StartCooking(int time) throws InterruptedException {
        System.out.println("Подогреваем еду");
        TimeUnit.SECONDS.sleep(1);
    }

    public void StopCooking()
    {
        System.out.println("Еда подогрета!");
    }
}