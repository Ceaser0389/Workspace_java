package devdojo.maratonajava.javacore.Xserializacao.test;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import devdojo.maratonajava.javacore.Xserializacao.dominio.Aluno;

public class SerializacaoTest01 {

	public static void main(String[] args) {
		
		
		Aluno aluno1 = new Aluno(1L, "Cesar Alves", "123456");
	//	serializar(aluno1);
		
		deserializar();    // o constru não é exe na deserialização
	}
	
	public static void serializar(Aluno aluno) {   /// serializar é trans em array de bytes
		
		Path path = Paths.get("pasta/aluno.ser");
		
		try (ObjectOutputStream oos = new ObjectOutputStream(Files
			.newOutputStream(path))){
			
			oos.writeObject(aluno);
			
			
		}catch (IOException e) {
			e.printStackTrace();
		}
		
		
	}
	
	
	public static void deserializar() {  
		
		Path path = Paths.get("pasta/aluno.ser");
		
		try (ObjectInputStream ois = new ObjectInputStream(Files
			.newInputStream(path))){
			
		Aluno aluno = (Aluno) ois.readObject();
			
			
		}catch (IOException | ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		
	}

}
