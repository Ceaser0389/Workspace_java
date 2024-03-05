package devdojo.maratonajava.javacore.TresourseBundle;

import java.util.Locale;
import java.util.ResourceBundle;


public class ResourceBundleTest01 {

	public static void main(String[] args) {
		
	   System.out.println(Locale.getDefault());
	   ResourceBundle  bundle  = ResourceBundle.getBundle("messages", new Locale("en", "PT"));

	   boolean sasa  = bundle.containsKey("sasa");
	   System.out.println(sasa);
		
	   
	   // Locale("fr","CA")          callback do mais espec p o geral
	   // massages_fr_CA.properties
	   // massages_fr.properties
     	// massages_en_US.properties
		// massages_en.properties
	   // massages.properties
	}

}
