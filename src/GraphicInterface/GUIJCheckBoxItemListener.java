package GraphicInterface;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JTextField;
public class GUIJCheckBoxItemListener extends JFrame {

	JTextField campotexto;
	JCheckBox bold, italic;

	public GUIJCheckBoxItemListener() {

		super();

		// Criei o campo de texto e ajustei as fontes dele
		campotexto = new JTextField("Veja a fonte mudar", 12);
		campotexto.setFont(new Font("Serif", Font.PLAIN, 26));

		// Criei o Containner e ajustei o Layout
		Container container = getContentPane();
		container.setLayout(new FlowLayout());

		// Criei ambas as checkboxs e adicionei o listernet
		bold = new JCheckBox("Bold");
		bold.addItemListener(new CheckBoxListener());
		italic = new JCheckBox("Italic");
		italic.addItemListener(new CheckBoxListener());

		// Adicionei os controles no containner
		container.add(campotexto);
		container.add(bold);
		container.add(italic);

		// Configurações Defaults
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(300, 300);
		setVisible(true);
	}

	// Classe para ouvir o checkbox item listener
	class CheckBoxListener implements ItemListener {
		@Override
		public void itemStateChanged(ItemEvent e) {
			System.out.println("Mudar");
			if(bold.isSelected() && italic.isSelected()){
				campotexto.setFont(new Font("Serif", Font.BOLD | Font.ITALIC, 26));
			} else if (bold.isSelected()){
				campotexto.setFont(new Font("Serif", Font.BOLD, 26));
			} else if (italic.isSelected()){
				campotexto.setFont(new Font("Serif", Font.ITALIC, 26));
			} else {
				campotexto.setFont(new Font("Serif", Font.PLAIN, 26));
			}
		}
	}
		public static void main(String[] args) {
			new GUIJCheckBoxItemListener();
		}
}