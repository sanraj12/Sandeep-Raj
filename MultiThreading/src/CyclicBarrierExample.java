

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.CyclicBarrier;


class Worker1 implements Runnable {
	private int Id;
	private CyclicBarrier barrier;

	public Worker1(int Id, CyclicBarrier barrier) {
		this.Id= Id;
		this.barrier = barrier;
	}

	private void doWork() {
		System.out.println("Work of Thread started "+ Id);
		try {
			barrier.await();// this is for barrier to wait for limit 
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						} catch (BrokenBarrierException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}

				System.out.println("After all task get finished, even barrier run below complete ");
			
		
	}



	@Override
	public void run() {
		doWork();
		
}}

public class CyclicBarrierExample {

	public static void main(String[] args) {
			
		ExecutorService service = Executors.newCachedThreadPool();
		CyclicBarrier barrier = new CyclicBarrier(5, new Runnable() {
			@Override
			public void run() {
				
				System.out.println("After all task finised ");
			}
		});
		for (int i = 0; i < 5; i++) {
			service.execute(new Worker1(i + 1, barrier));
		}
	}
}


