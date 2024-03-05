package devdojo.maratonajava.javacore.ZZAclassesInternas;

public class OuterClassesTest02 {
	private String nome = "Midoyama";
	
	
	void print() {
		String lastName = "Midoraya";
		class LocalClass{
			public void printLocal() {
				System.out.println(nome + " " + lastName);
		
			}
		}
		new LocalClass().printLocal();
	}
	
	public static void main(String[] args) {
		
		OuterClassesTest02 outer = new OuterClassesTest02();
		outer.print();
		
		
	
	}
		
}
	
