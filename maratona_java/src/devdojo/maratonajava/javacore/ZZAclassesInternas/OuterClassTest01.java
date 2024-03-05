package devdojo.maratonajava.javacore.ZZAclassesInternas;

public class OuterClassTest01 {

	private String name = "Monkey D. Luffy";
	
	class Inner {
		public void printOuterClassAttribute() {
			System.out.println(name);
			System.out.println(this);
			System.out.println(OuterClassTest01.this);
		}
		
	}
	
	public static void main(String[] args) {
		
		OuterClassTest01 outerClass = new OuterClassTest01();
		Inner inner = outerClass.new Inner();
		Inner inner2 = new OuterClassTest01().new Inner();
		
		inner.printOuterClassAttribute();
		inner2.printOuterClassAttribute();
		

		
	}

}
