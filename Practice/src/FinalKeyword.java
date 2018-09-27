
/*You can initialize a final variable when it is declared.This approach is the most common. A final variable is called blank final variable,if it is not initialized while declaration. Below are the two ways to initialize a blank final variable.
A blank final variable can be initialized inside instance-initializer block or inside constructor. If you have more than one constructor in your class then it must be initialized in all of them, otherwise compile time error will be thrown.
A blank final static variable can be initialized inside static block.*/


/*As you know that a final variable cannot be re-assign. But in case of a reference final variable, internal state of the object 
pointed by that reference variable can be changed.
*/
public class FinalKeyword {

final static int LEN =10;
static int len1=6;

// a final variable
// direct initialize
final int THRESHOLD = 5;
 
// a blank final variable
final int CAPACITY;
 
// another blank final variable
final int  MINIMUM;
 
// a final static variable PI
// direct initialize
static final double PI = 3.141592653589793;
 
// a  blank final static  variable
static final double EULERCONSTANT;
 
// instance initializer block for 
// initializing CAPACITY
{
    CAPACITY = 25;
}
 
// static initializer block for 
// initializing EULERCONSTANT
static{
    EULERCONSTANT = 2.3;
}
 
// constructor for initializing MINIMUM
// Note that if there are more than one
// constructor, you must initialize MINIMUM
// in them also
public FinalKeyword() {
    MINIMUM = -1;
}




	public static void main(String[] args) {
		
		int b = LEN*10;
		//LEN= 15;
		len1=6;
	}
}
