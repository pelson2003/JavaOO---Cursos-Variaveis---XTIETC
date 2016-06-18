package SocketsXTI;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
public class ConselhoServidor {
	public static void main(String[] args) throws IOException {
		// Cria o Servidor
		ServerSocket server = new ServerSocket(5000);
		while(true){
			// Recebe uma requisição e cria um objeto socket para conversar.
			Socket socket = server.accept();
			// Com o socket você cria um objeto print writer para que possamos escrever.
			try(PrintWriter w = new PrintWriter(socket.getOutputStream())){;
				// Imprime a mensagem para o cliente
				w.println("Aprenda Java e seja Contratado");
			}
		}
	}
}