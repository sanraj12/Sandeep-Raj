class ThreadSynchronization implements Runnable {


	static int count1 = 0;

	public  void incrementcount1() {

		for (int i = 0; i < 5; i++) {
			count1++;
		}
	}

	public  void incrementcount2() {

		for (int i = 0; i < 5; i++) {
			count1++;
		}
	}

	@Override
	public void run() {
		incrementcount1();
		incrementcount2();
	
System.out.println(count1);
	}
	public static void main(String[] args) {
		ThreadSynchronization synchtion = new ThreadSynchronization();
		Thread t = new Thread(synchtion);
		Thread t1 = new Thread(synchtion);
		
		t.start();
		t1.start();
		
	}

}
