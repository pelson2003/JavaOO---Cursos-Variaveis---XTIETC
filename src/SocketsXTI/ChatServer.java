package SocketsXTI;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class ChatServer {

	List<PrintWriter> escritores = new ArrayList<>();
	
	
	public ChatServer() {
		ServerSocket server;
		Scanner scanner;
		// Recebe uma requisição e cria um objeto socket para conversar.
		try {
			server = new ServerSocket(5002);
			while (true) {
				Socket socket = server.accept();
				new Thread(new EscutaCliente(socket)).start();
				PrintWriter p = new PrintWriter(socket.getOutputStream());
				escritores.add(p);
//				scanner = new Scanner(socket.getInputStream());
//				System.out.println(scanner.nextLine());
//				scanner.close();
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("erro no servidor");
		}
	}

	private void encaminharparaTodos(String texto){
		for(PrintWriter w: escritores){
			try{
				w.println(texto);
				w.flush();
			} catch (Exception e){
				System.out.println("Erro no Encaminhar para todos");
			}
		}
	}
	
	private class EscutaCliente implements Runnable {
		//Processo via thread.
		Scanner scanleitor;
		public EscutaCliente(Socket socket) {
			try {
				scanleitor = new Scanner(socket.getInputStream());
			} catch (IOException e) {
				System.out.println("Erro no EscutaCliente");
			}
		}
		
		public void run() {
			try {
				String texto;
				while((texto = scanleitor.nextLine()) != null){
					System.out.println("Recebeu: " + texto);
					encaminharparaTodos(texto);
				}
			} catch (Exception x){
				System.out.println("Problema no método run");
			}
		}	
	}
	public static void main(String[] args) {
		new ChatServer();
	}
}
