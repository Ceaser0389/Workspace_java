package devdojo.maratonajava.javacore.ZZAclassesInternas;

public class OuterClassesTest03 {
	
	private String name;
	static class Nested{
		void print() {
			System.out.println(new OuterClassesTest03().name);
		}
	}
	
	
	public static void main(String[] args) {
		
		Nested nested = new Nested();
		nested.print();
		
		
	
	}
		
}
	
