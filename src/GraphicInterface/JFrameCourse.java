package GraphicInterface;
import javax.swing.JButton;
import javax.swing.JFrame;
public class JFrameCourse extends JFrame {

	public JFrameCourse() {
		
		//Como voce extende Janela, você nao precisa efetuar
		//Muda a programação.
		//JFrame frame = new JFrame();
		
		//Como você extendenu você cria a janela através do seguinte comando
		super("Minha Janela");
		
		// Criando um botão; u	m controle
		JButton botao = new JButton("Clique");
			
		// Cria um containner e adiciona o botão, o controle criado
		getContentPane().add(botao);
		
		// Operação Padrao de quando fechamos janela
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
