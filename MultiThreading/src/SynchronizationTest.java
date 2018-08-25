
public class SynchronizationTest {
	static int count = 0;

	public static void process() {

		Runnable r1 = new Runnable() {

			@Override
			public void run() {
				 synchronized (SynchronizationTest.class) {
					for (int i = 0; i < 1000; i++) {						
						System.out.println(Thread.currentThread().getName());
						++count;
						try {
							wait();
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
					}

				}
			}
		};

		Runnable r2 = new Runnable() {
			public void run() {
				synchronized (this) {
					
					for (int i = 0; i < 1000; i++) {
						System.out.println(Thread.currentThread().getName());
						++count;
					}
				}
			}
		};
		
		Runnable r3 = new Runnable() {
			public void run() {
				synchronized (this) {
					
					for (int i = 0; i < 1000; i++) {
						System.out.println(Thread.currentThread().getName());
						++count;
					}
				}
			}
		};

		Thread t1 = new Thread(r1);
		Thread t2 = new Thread(r2);
		Thread t3 = new Thread(r3);
		

		t1.start();
		t2.start();
		t3.start();

		try {
			t1.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			t2.join();
			t3.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		process();
		System.out.println(count);
	}

}
