package multithreding;

import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;

public class ConcarHasMapEx {
    public static void main(String[] args) throws InterruptedException {
        ConcurrentHashMap<Integer,String> concurrentHashMap = new ConcurrentHashMap<>();
        concurrentHashMap.put(1,"Den");
        concurrentHashMap.put(2,"Bob");
        concurrentHashMap.put(3,"Sam");
        concurrentHashMap.put(4,"John");
        System.out.println(concurrentHashMap);


        Runnable runnable1 = () -> {
            Iterator<Integer> iterator = concurrentHashMap.keySet().iterator();
            while (iterator.hasNext()) {
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                Integer i = iterator.next();
                System.out.println(i + " : " + concurrentHashMap.get(i));
            }
        };

        Runnable runnable2 = () -> {
            try {
                Thread.sleep(300);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            concurrentHashMap.put(4,"Elena");
        };

        Thread thread1 = new Thread(runnable1);
        Thread thread2 = new Thread(runnable2);
        thread1.start();
        thread2.start();
        thread1.join();
        thread2.join();
        System.out.println(concurrentHashMap);
    }
}
