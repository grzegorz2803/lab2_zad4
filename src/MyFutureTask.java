import java.io.*;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class MyFutureTask extends FutureTask<Integer> {
private String line;
    public MyFutureTask(Callable<Integer> callable,String line) {
        super(callable);
         this.line=line;
    }
    @Override
    protected void  done(){
        try (BufferedReader reader = new BufferedReader(new FileReader("input.txt"))) {
            String newLine;
            //BufferedWriter writer= new BufferedWriter(new FileWriter("input.txt",true));
            RandomAccessFile file=new RandomAccessFile("input.txt","rw");
            while ((newLine=reader.readLine())!=null){
                if(newLine.equals(line)){
                    file.seek(file.length());
            file.writeBytes(newLine+get().toString()+"\n");
                }
            }
        }catch (IOException |InterruptedException| ExecutionException e){
            e.printStackTrace();
        }
      //  try{
    //        System.out.println("Wynik: "+Thread.currentThread().getName()+" "+line+ get());
    //    }catch (InterruptedException | ExecutionException e){
     //       e.printStackTrace();
     //   }
    }
}
