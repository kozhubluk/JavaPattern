package Task4;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

public class Test {
    public static void main(String[] args){
        Callable<String> task = () -> Thread.currentThread().getName(); // задача
        MyExecutorService service = new MyExecutorService(2); // экземпляр класса
        for (int i = 0; i < 10; i++) {
            Future result = service.submit(task); // завершение выполнения задачи
            try {
                System.out.println(result.get()); // выводим рез-т
            } catch (InterruptedException e) {
                e.printStackTrace();
            } catch (ExecutionException e) {
                e.printStackTrace();
            }
        }
        service.shutdown(); // завершение (новый задачи не принимаются)
    }
}
