package GraphicInterface;
import javax.swing.JButton;
import javax.swing.JFrame;
public class JFrameCourse extends JFrame {

	public JFrameCourse() {
		
		//Como voce extende Janela, voc� nao precisa efetuar
		//Muda a programa��o.
		//JFrame frame = new JFrame();
		
		//Como voc� extendenu voc� cria a janela atrav�s do seguinte comando
		super("Minha Janela");
		
		// Criando um bot�o; u	m controle
		JButton botao = new JButton("Clique");
			
		// Cria um containner e adiciona o bot�o, o controle criado
		getContentPane().add(botao);
		
		// Opera��o Padrao de quando fechamos janela
		// Exit on close, fecha o programa quando o user fecha a janela
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);;
				
		// Tamanho da Janela
		setSize(300, 300);
				
		// Define a janela como visivel
		setVisible(true);		
	}
	
	public static void main(String[] args) {
		new JFrameCourse();
	}
}
