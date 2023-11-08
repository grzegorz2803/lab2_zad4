import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class MyFutureTask extends FutureTask<Integer> {

    public MyFutureTask(Callable<Integer> callable) {
        super(callable);

    }
    @Override
    protected void  done(){
        try{
            System.out.println("Wynik: "+Thread.currentThread().getName()+" "+ get());
        }catch (InterruptedException | ExecutionException e){
            e.printStackTrace();
        }
    }
}
