package br.codenation.cursojava.aula3.concurrency;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

public class ExecutorServiceApplication {

    public static void main(String[] args) {

        ExecutorService executorService = Executors.newFixedThreadPool(10);

        Runnable runnableTask = () -> {
            try {
                TimeUnit.MILLISECONDS.sleep(300);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        };
        executorService.execute(runnableTask);

        Callable<String> callableTask = () -> {
            TimeUnit.MILLISECONDS.sleep(300);
            return "Task's execution";
        };
        Future<String> future =
                executorService.submit(callableTask);
        String result = null;
        try {
            result = future.get();
            result = future.get(200, TimeUnit.MILLISECONDS);

            boolean done = future.isDone();

            boolean canceled = future.cancel(true);
            boolean isCancelled = future.isCancelled();

        } catch (InterruptedException | ExecutionException | TimeoutException e) {
            e.printStackTrace();
        }

        List<Callable<String>> callableTasks = new ArrayList<>();
        callableTasks.add(callableTask);
        callableTasks.add(callableTask);
        callableTasks.add(callableTask);
        try {
            result = executorService.invokeAny(callableTasks);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }

        try {
            List<Future<String>> futures = executorService.invokeAll(callableTasks);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        executorService.shutdown();
        List<Runnable> unfinishedTasks;
        try {
            if (!executorService.awaitTermination(800, TimeUnit.MILLISECONDS)) {
                unfinishedTasks = executorService.shutdownNow();
            }
        } catch (InterruptedException e) {
            unfinishedTasks = executorService.shutdownNow();
        }


    }
}
