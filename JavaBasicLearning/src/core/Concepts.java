package core;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class Task implements Callable<Integer> {
    @Override
    public Integer call() throws Exception {
        System.out.println("sub thread is executing...");
        Thread.sleep(3000);
        int sum = 0;
        for (int i = 0; i < 100; i++) sum += i;
        return sum;
    }
}

public class Concepts {


    public static void main(String[] args) {
        ExecutorService ex = Executors.newCachedThreadPool();
        Task task = new Task();
        Future<Integer> res = ex.submit(task);
        ex.shutdown();

//        try {
//            Thread.sleep(3000);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }

        System.out.println("Main thread is executing...");

        try {
            System.out.println("task result: " + res.get());
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }

        System.out.println("all task finished");

        /*
        TO-DO:
            Try-Catch
            final
            finalize
            Thread
        ...
         */
    }
    public static void doubleColonTest(String st) {

        System.out.print(st + ",");
    }
    public void doubleColonTest2(String st) {
        System.out.print(st + ",");
    }
}


        /*
        // Strean
        List<Integer> l = new ArrayList();
        for(int i = 0; i < 10; i++) l.add(i);
        // return list after stream operations
        List<Integer> l2 = l.stream().filter(ele -> ele % 2 == 0).collect(Collectors.toList());
        for (Integer i : l) System.out.print(i + " ");
        for (Integer i : l2) System.out.print(i + " ");
        */

        /*
        // Supplier - make stream reusable
        Supplier<Stream<String>> sp = () -> Stream.of("a", "b","c","d","e","f","g");
        System.out.println("#######");
        sp.get().forEach(Concepts::doubleColonTest);
        System.out.println("\n#######");
        sp.get().forEach((new Concepts())::doubleColonTest2);
         */

