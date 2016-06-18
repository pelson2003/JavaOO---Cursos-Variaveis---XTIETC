package SystemRunntime;
import java.io.Console;
import java.io.IOException;
import java.util.Properties;
import java.util.Set;
public class Sistemas {
	public static void main(String[] args) {
		
		// Pegando as propriedades de seu sistema operacional
		Properties p = System.getProperties();
		
		// Pegando uma propriedade, neste caso a versao do java
		System.out.println("Pegando versão do java" + p.getProperty("java.version"));

		// Configurando um propriedade no sistema
		p.setProperty("xti.curso.java.version", "1.0.0");
		
		// Recebendo todas as propriedades do sistema
		Set<Object> pk = p.keySet();
		for(Object key: pk){
			System.out.println(key + "=" + p.get(key));
		}
		
		// Recurar um objeto do tipo console. Exemplo: Senha de forma segura.
		
		Console objconsole = System.console();
		System.out.println("Entre com a info: ");
		String user = objconsole.readLine();
		System.out.println("Entre com a info: ");
		char[] pass = objconsole.readPassword();
		System.out.println("User: " + user + "Senha: " + new String(pass));	
		
		// Um pouco da classe RunTime
		
		try {
			Runtime.getRuntime().exec("notepad.exe");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
