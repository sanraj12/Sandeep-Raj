
public class SynchronizationTest2 {
	static int count = 0;

	public static void process() {

		Runnable r1 = new Runnable() {

			@Override
			public void run() {
				synchronized (SynchronizationTest2.class) {
					for (int i = 0; i < 100; i++) {
						System.out.println(Thread.currentThread().getName());
						++count;
					}

				}
				synchronized (this) {

					for (int i = 0; i < 100; i++) {
						System.out.println(Thread.currentThread().getName());
						++count;
					}
				}
				synchronized (SynchronizationTest2.class) {

					for (int i = 0; i < 100; i++) {
						System.out.println(Thread.currentThread().getName());
						++count;
					}
				}
			}
		};

		Thread t1 = new Thread(r1);
		Thread t2 = new Thread(r1);
		Thread t3 = new Thread(r1);

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
