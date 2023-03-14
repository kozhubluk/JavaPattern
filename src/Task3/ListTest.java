package Task3;

import java.util.List;

public class ListTest {

    public static void main(String[] args){
        List<Integer> list = new SemaphorList<>();

        Thread thread1 = new Thread(() -> {
            for (int i = 1; i < 11; i++) {
                list.add(i);
            }
        });

        Thread thread2 = new Thread(() -> {
            for (int i = 11; i < 21; i++) {
                list.add(i);
            }
        });

        thread1.start();
        thread2.start();

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        list.forEach(System.out::println);
    }
}
