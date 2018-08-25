import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

class Processor implements Callable<String>
{
private int i=0;
public Processor(int i) {
	this.i= i;
}
	@Override
	public String call() throws Exception {
		
		return "Id" + "" +i;
	}
	}


public class CallableExample {

	public static void main(String[] args) {
		ExecutorService service = Executors.newFixedThreadPool(2);
		List<Future<String>> futures = new ArrayList<>();
		for (int i = 0; i<5; i++)
		{
			Future<String> future = service.submit(new Processor(i+1));
			futures.add(future);
		}
		for(Future<String> future : futures)
		{
			try {
				System.out.println(future.get());
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (ExecutionException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
 	}

}
