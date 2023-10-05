class methodoverloading{
	String s;
	void method() {
		System.out.println("Constructor1 has been initialized");
	}
	void method(String constname) {
		s = constname;
		System.out.println( constname + " has been initialized");
	}
}

 class constructor{
	 public static void main(String[]args) {
		 methodoverloading c1 = new methodoverloading();
		 c1.method();
		 c1.method("Constructor2");
	 }
 }