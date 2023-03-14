package Task3;

import java.util.Map;

public class MapTest {
    public static void main(String[] args){
        Map<Integer, String> mapSync = new SyncMap<>();
        Thread thread1 = new Thread(() -> {
            for (int i = 1; i < 11; i++) {
                mapSync.put(i,"value"+i);
            }
        });

        Thread thread2 = new Thread(() -> {
            for (int i = 11; i < 21; i++) {
                mapSync.put(i,"value"+i);
            }
        });

        thread1.start();
        thread2.start();

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        mapSync.forEach((key,value)-> System.out.println(key+": "+value));
    }
}
