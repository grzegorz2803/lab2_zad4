
import java.util.concurrent.Callable;

public class ReadLineFromFile implements Callable<Integer> {
    private final String line;
    private ONPCalculator onp = new ONPCalculator();

    public ReadLineFromFile(String line) {
        this.line = line;
    }

    @Override
    public Integer call() throws InterruptedException {
        Thread.sleep(100);
        return onp.ONPResult(line);
    }
}