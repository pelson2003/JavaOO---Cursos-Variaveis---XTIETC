package GraphicInterface;
import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
public class Layouts extends JFrame {

	public Layouts() {
		
		super("Minha Janela, Meu Layout");
		
		//Criando Containner
		Container c = getContentPane();
		
		//Adicionando um botão em cada posição do Layout
		//Utilizando um Layout Padrão que é o Border Layout
		c.add(BorderLayout.NORTH, new JButton("Norte"));
		c.add(BorderLayout.SOUTH, new JButton("Sul"));
		c.add(BorderLayout.CENTER, new JButton("Centro"));
		c.add(BorderLayout.EAST, new JButton("East"));
		c.add(BorderLayout.WEST, new JButton("West"));
		
		//Criando Containner e definindo layout Border
		Container d = getContentPane();
		//Criando um Layout
		BorderLayout border = new BorderLayout();
		//Colocando o Layout no Containner
		d.setLayout(border);
		
		//Criando Containner e definindo layout Flow
		Container e = getContentPane();
		//Criando um Layout
		FlowLayout borderFlow = new FlowLayout();
		//Colocando o Layout no Containner
		e.setLayout(borderFlow);
		//Este usa FIFO para colocar os elementos.
		
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(300,300);
		setVisible(true);
	}
	public static void main(String[] args) {
		new Layouts();
	}
}