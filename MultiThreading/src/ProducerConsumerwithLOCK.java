import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

class ProducerConsumer {
	private Lock lock = new ReentrantLock();
	Condition condition = lock.newCondition();

	void producer() throws InterruptedException {
		lock.lock();
		System.out.println("Inside Producer ");
		condition.await();
		System.out.println("Inside Producer again");
		lock.unlock();
	}

	void Consumer() throws InterruptedException {
		lock.lock();
		Thread.sleep(3000);
		System.out.println("Inside Consumer ");
		condition.signal();
		lock.unlock();// can be lock somewhere and can be unlocked somewhere else
	}

}

public class ProducerConsumerwithLOCK {

	public static void main(String[] args) {

		ProducerConsumer consumer = new ProducerConsumer();
		Thread t1 = new Thread(new Runnable() {

			@Override
			public void run() {
				try {
					new ProducerConsumer().producer();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

			}
		});
		Thread t2 = new Thread(new Runnable() {

			@Override
			public void run() {
				try {
					new ProducerConsumer().Consumer();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

			}
		});
		t1.start();
		t2.start();

		try {
			t1.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			t2.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
