package p2;

public class String3 implements Editable {
	
	String mainString;

	public String3(String s) {
		this.mainString = s;
	}

	@Override
	public void addPrefix(String s) {
		this.mainString = s + mainString;
		
	}

	@Override
	public void addPostfix(String s) {
		this.mainString = mainString + s;
		
	}
	
	public String toString() {
		return mainString;
	}

}
