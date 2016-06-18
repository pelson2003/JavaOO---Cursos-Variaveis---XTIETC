package GraphicInterface;
import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
public class ControleLabel extends JFrame {

	public ControleLabel() {
		super("Minha Janela");
		Container jlabelcont = getContentPane();
		
		//Criando um Label
		JLabel simplelabel = new JLabel("Label Simples");
		//TooltipAparece quando você passa o mouse em cima do controle
		simplelabel.setToolTipText("Meu ToolTip");
		
		//Criando um Label POWER SUPER (Fonte Tipo, Aspectos, Tamanho)
		Font font = new Font("serif",Font.BOLD | Font.ITALIC, 28);
		JLabel superlab = new JLabel("Label Super");
		superlab.setFont(font);
		superlab.setForeground(Color.BLUE);
		
		jlabelcont.setLayout(new FlowLayout());
		jlabelcont.add(simplelabel);
		jlabelcont.add(superlab);
		
		//Criando um Label com uma imagem
		ImageIcon icon = new ImageIcon(getClass().getResource("fotos/luz.png"));
		JLabel imagem = new JLabel(icon);
		jlabelcont.add(imagem);
		
		//Configurações Defaults.
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(300,300);
		setVisible(true);
	}
	public static void main(String[] args) {
		new ControleLabel();
	}
}
