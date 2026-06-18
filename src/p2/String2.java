package p2;

public class String2 implements Editable {

	
	String mainString;

	public String2(String s) {
		this.mainString = s;
	}
	
	public String bellen() {
		return "Wuff";
	}
	
	@Override
	public void addPrefix(String s){
		this.mainString = s + mainString;
		
	}
	@Override
	public void addPostfix(String s) {
		this.mainString = mainString + s;
		
	}

	@Override
	public String toString() {
		return mainString;
	}
	
	

}
