
public class FinalKeywordExamples {

	final static String STR;
	final  int AGE ;
	
	{
		AGE =6;
	}
	
	static
	{
		STR="abc";
	}

	public final static void main(String[] args) {
		final int a = 0;
		// Reassinedment not allowed STR = "def";
		// Reassigned not allowed A = 15;

		final FinalClassExample classExample = new FinalClassExample("Ram");
		 FinalClassExample classExample1 = new FinalClassExample("Shayam");
	// not allwoed	 classExample =classExample1;
		 classExample.setName("Shyam");
		 
	}
}

final class FinalClassExample {
	String name ;
	final  String MENTOR;
	
	public FinalClassExample(String name) {
		name =name;
		MENTOR ="Sandeep";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	String surname = "Gopal";

}

class TryToExtendFinalClass // not allowed to extends FinalClassExample
{
	// If it will allow to be extended then there would discrepancy as final means
	// class can't be modified

}

// If method is final then it can't be overridden'
