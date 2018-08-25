
public class StaticAndInstanceBlock {

	{
		System.out.println("Inside Instance Block");
	}

	static {
		System.out.println("Inside Static Block");
	}

	public StaticAndInstanceBlock() {
		System.out.println("Inside Main class Construtor");
	}

	public static void main(String[] args) {

		System.out.println("Inside Main Method");

		Example example = new Example();
		StaticAndInstanceBlock andInstanceBlock = new StaticAndInstanceBlock();

	}

}

class Example {

	public Example() {
		System.out.println("Inside Construtor");
	}

}
