package devdojo.maratonajava.javacore.Minterfaces.dominio;

     //contrato foi criado p ser implementado
    // em uma interface todos os metodos são public e abstract
public interface DataLoader {

	 public static final int MAX_DATA_SIZE = 10;
	 void load();
	
	
	default void checkPermission() {
		System.out.println("Fazendo checagem de permissões");
	}
	
	
	 public static void retrieveMaxDataSize(){
		 System.out.println("Dentro do retrieveMaxDataSize na interface");
	 }
	 
}


//// não pode criar obj com interface
/** 
 *  tomar cuido na hroa de sobrescreveer
 *  private -> default -> protected -> public
 *  
 *  
 *  todos os atributos declarados em uma interface são constantes 
 *  
 *  a interface pode ter metodos static 
 * 
 * /
 */