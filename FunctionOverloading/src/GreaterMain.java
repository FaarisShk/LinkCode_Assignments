
public class GreaterMain {

	public static void main(String[] args) {
		GreaterNumber g1 = new GreaterNumber();
		g1.greater(100, 200);
		g1.greater(12.3f, 23.3f);
		g1.greater('A', 'S');

	}

}
/*Function overloading means we can 
use same function more than once for
different implementation but while
doing a function overloading function
signature must be different and 
function signatures are
1)Number of parameters
	void display(int 1)
	void display(int 1, int 2)
2)Type of parameters
	void display(int int)
	void display(float int)
3)Sequence of parameters
	void display(int,float)
	void display(float,int)
Return type is not the part of function
signature*/
