import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class CountDownLatcheExample {


	public static void main(String[] args) {
		CountDownLatch latch = new CountDownLatch(5); //it can't not reset . To reset we need to use cyclic barrier 
		ExecutorService service = Executors.newCachedThreadPool();
		for (int i = 0; i < 5; i++) {
			service.execute(new Worker(i + 1, latch));
		}
		try {
			latch.await();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("All task completed then only Run");
	}

}

class Worker implements Runnable {
	private int Id;
	private CountDownLatch countDownLatch;

	public Worker(int Id, CountDownLatch countDownLatch) {
		this.Id= Id;
		this.countDownLatch = countDownLatch;
	}

	private void doWork() {
		System.out.println(Id);

	}

	@Override
	public void run() {
		doWork();
		countDownLatch.countDown();
	}
}