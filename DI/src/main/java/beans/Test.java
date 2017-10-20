package beans;

public class Test {
	private String gender;
	public void setGender(String gender) {
		this.gender = gender;
	}
	
	public Test() {
		System.out.println("inside constructor");
	}
	
	public void hello(String name) {
		System.out.println("hello world");
	}

}
