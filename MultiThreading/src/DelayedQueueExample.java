import java.time.Duration;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.DelayQueue;
import java.util.concurrent.Delayed;
import java.util.concurrent.TimeUnit;

public class DelayedQueueExample {

	public static void main(String[] args) {
		BlockingQueue<Delayedworker>  blockingQueue = new DelayQueue<>();
		try {
			blockingQueue.put(new Delayedworker(1000, "First"));
			blockingQueue.put(new Delayedworker(10000, "Second"));
			blockingQueue.put(new Delayedworker(4000, "Third"));
			
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		while(!blockingQueue.isEmpty())
		{
			try {
				Delayedworker delayedworker =	blockingQueue.take();
				System.out.println(delayedworker);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}

class Delayedworker implements Delayed {
	private long duration;

	private String message;

	public Delayedworker(long duration, String message) {
		this.duration = duration;
		this.message = message;
	}

	@Override
	public String toString() {
		return "Delayedworker [duration=" + duration + ", message=" + message + "]";
	}

	@Override
	public int compareTo(Delayed otherDelayed) {
		if (this.duration > ((Delayedworker) otherDelayed).getDuration()) {
			return 1;
		}
		if (this.duration < ((Delayedworker) otherDelayed).getDuration()) {
			return -1;
		}
		return -1;
	}

	@Override
	public long getDelay(TimeUnit unit) {
		return unit.convert(duration-System.currentTimeMillis(), TimeUnit.MILLISECONDS);
	}

	public long getDuration() {
		return duration;
	}

	public void setDuration(long duration) {
		this.duration = duration;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

}