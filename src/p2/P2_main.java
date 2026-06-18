package p2;


public class P2_main {
	
	public static void main(String[] Args) {
		
		String2 test = new String2("hallo");
		String3 hans = new String3("hans");
		
		test.addPostfix("Q");
		test.addPrefix("!");
		
		hans.addPrefix("Sein Name ist ");
		
		System.out.println(hans);		
	
	}

}
