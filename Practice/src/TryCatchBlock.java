import java.sql.SQLException;

public class TryCatchBlock {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=0;
		try {
			 i =checkexception();
			System.out.println("after exception method call");
			System.out.println("Try calling method"+i);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("Catching calling method"+i);
			
		}
		
		System.out.println("After Catch");
		System.out.println("calling method" +i);
	}

	
	@SuppressWarnings("finally")
	static int checkexception() throws Exception
	{
		try {
			System.out.println("Hello From Try");
			//throw new RuntimeException();
			return 1;
			//throw new Exception();
			//System.out.println("Exception Thrown");
		}

		finally {
		return 2;
		
		}

}
}

