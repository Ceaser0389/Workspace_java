package devdojo.maratonajava.javacore.Pwrappers;

public class WrapperTest01 {

	public static void main(String[] args) {
		
		
		
		
		 byte byeteP = 1;
		 short shotP =1;
		 int intP = 1;
		 long longP = 10L;
		 float floatP = 10F;
		 double doubleP =10D;
		 char charP = 'w';
		 boolean booleanP = false;
		
		 
		 
		 Byte byeteW = 127;
		 Short shotrW =1;
		 Integer intW = 1;   // autoboxing
		 Long longW = 10L;
		 Float floatW = 10F;
		 Double doubleW =10D;
		 Character charW = 'W';
		 Boolean booleanW = false;
		
		 
		 int i = intW; // unboxing 
		 Integer intW2 = Integer.parseInt("1");
		 boolean verdadeiro = Boolean.parseBoolean("TruE");
		 
		 System.out.println(Character.isDigit('A'));
		 System.out.println(Character.isDigit('9'));
		 System.out.println(Character.isLetterOrDigit('!'));		
		
		 System.out.println(Character.isUpperCase('!'));		
		 System.out.println(Character.isLowerCase('!'));		
			
		 System.out.println(Character.isUpperCase('a'));		
		 System.out.println(Character.isLowerCase('A'));		
			
		
		
		
		
		
		
		
	}
	
	
	
	 
	 
	 
	 
	 
	 
	 
	 
}