
public class WrapperClass {
	public static void main(String[]args) {
		String str = "10";
		//Convert String to int using Wrapper Class Method 
		int i = Integer.parseInt(str);
		//Convert Primitive to Object-Boxing
		Integer obj = new Integer(i);
		//Or From Java 5
		Integer iobj2 = i;
		//Object to primitive-unboxing
		int i2=iobj2.intValue();
		//from java 9
		int i3 = iobj2;
		System.out.println(iobj2.toBinaryString(i3));
		System.out.println(iobj2.toHexString(i3));
	}
}

/*
 * 2 Uses of Wrapper Classes
1)Represent the primitive datatype in
the form of object because there are 
some classes that need only objects
2)Wrapper Classes has many utility 
methods for conversion 
*/
