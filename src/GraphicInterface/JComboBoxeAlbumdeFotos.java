package GraphicInterface;
import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
public class JComboBoxeAlbumdeFotos extends JFrame implements ItemListener{

	JComboBox<String> combo;
	JLabel label;
	ImageIcon[] imagens = {
			new ImageIcon(getClass().getResource("fotos/GSK.jpg")),
			new ImageIcon(getClass().getResource("fotos/ALTRAN.jpg")),
			new ImageIcon(getClass().getResource("fotos/logo_carro.jpg.jpg")),
			new ImageIcon(getClass().getResource("fotos/ALTRAN.jpg"))
	};
	
	public JComboBoxeAlbumdeFotos() {
		super("Album de Fotos");
		
		// Criei o Containner e ajustei o Layout
		Container container = getContentPane();
		container.setLayout(new FlowLayout());

		//Configura o ComboBox e adiciona os items
		combo = new JComboBox<String>();
		combo.setFont(new Font("Serif", Font.PLAIN,26));
		combo.addItem("Familia");
		combo.addItem("Manga");
		combo.addItem("Banana");
		combo.addItem("Choro");
		
		combo.addItemListener(this);
			
		//Inicializa o Label:
		label = new JLabel(imagens[0]);
		
		// Adicionei os controles no containner
		container.add(BorderLayout.NORTH, combo);
		container.add(BorderLayout.CENTER, label);

		// Configurações Defaults
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(300, 300);
		setVisible(true);
		
	}
	
	public static void main(String[] args) {
		new JComboBoxeAlbumdeFotos();
	}

	@Override
	public void itemStateChanged(ItemEvent e) {
		//Na verdade fazemos um Listener para ver se tivemos mudanças no combo
		// O indice do combo varia de 0 a 3 , pois sao 4 items
		// Usamos o index, para procurar no array imagens a posiçao correspondente
		if(e.getStateChange()==ItemEvent.SELECTED){
			label.setIcon(imagens[combo.getSelectedIndex()]);
		}
		
	}
}