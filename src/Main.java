import java.io.BufferedReader;
import java.io.FileReader;
import java.util.concurrent.*;

public class Main {

    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(2);
        try (BufferedReader reader = new BufferedReader(new FileReader("input.txt"))) {
            String line;
            while ((line=reader.readLine())!=null)
          {

              Callable<Integer> task = new ReadLineFromFile(line);
              MyFutureTask mytask = new MyFutureTask(task,line);
              executorService.submit(mytask);
              //Thread.sleep(100);
          }
            //Thread.sleep(100);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            executorService.shutdown();

        }
    }
}