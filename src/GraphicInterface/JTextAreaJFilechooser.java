package GraphicInterface;
import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
public class JTextAreaJFilechooser extends JFrame implements ActionListener{
	
	JTextArea texto;
	public JTextAreaJFilechooser() {

		super("Validação de TextArea e FileChooser");
		
		//Criando uma janela para editor de texto
		texto = new JTextArea();
		//Criando uma barra de rolagem e colocar o campo texto
		JScrollPane barrascroll = new JScrollPane(texto);
		
		JButton botaoarquivo = new JButton("Abre Arquivo");
		botaoarquivo.setFont(new Font("Serif", Font.PLAIN, 26));
		botaoarquivo.addActionListener(this);
		
		//Ajustando a fonte.
		texto.setFont(new Font("Serif", Font.PLAIN, 26));
		
		// Criei o Containner e ajustei o Layout
		Container container = getContentPane();
		
		// Adicionei os controles no containner
		container.add(BorderLayout.CENTER, barrascroll);
		container.add(BorderLayout.SOUTH, botaoarquivo);
		
		// Configurações Defaults
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(500, 300);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new JTextAreaJFilechooser();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		// Metodo que abra e salva arquivos.
		JFileChooser achaArquivo = new JFileChooser();
		achaArquivo.showOpenDialog(this);
		
		// Metodo para pegar o aquivop
		File fileescolhido = achaArquivo.getSelectedFile();
		
		try {
			//Metodo para pegar o path do arquivo
			Path pegaoCaminho = Paths.get(fileescolhido.getAbsolutePath());
			//Metodo para ler todos os bites do arquivo
			String retorno = new String(Files.readAllBytes(pegaoCaminho));
			//Metodo para carregar na janela
			texto.setText(retorno);
		} catch (Exception erro) {
			JOptionPane.showMessageDialog(this, "Falha abrir arquivo");
		}
		//achaArquivo.showSaveDialog(parent)
	}
}