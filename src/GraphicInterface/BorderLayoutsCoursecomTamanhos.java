package GraphicInterface;
import java.awt.BorderLayout;
import java.awt.Container;
import javax.swing.JButton;
import javax.swing.JFrame;
public class BorderLayoutsCoursecomTamanhos extends JFrame {

	public BorderLayoutsCoursecomTamanhos() {
		super("Grids Layouts");
		
		Container gridwindow = getContentPane();
		
		//Criando com espaçamento em pixels
		gridwindow.setLayout(new BorderLayout(5,5));
		
		gridwindow.add(BorderLayout.NORTH, new JButton("N"));
		gridwindow.add(BorderLayout.SOUTH, new JButton("S"));
		gridwindow.add(BorderLayout.CENTER, new JButton("C"));
		gridwindow.add(BorderLayout.EAST, new JButton("E"));
		gridwindow.add(BorderLayout.WEST, new JButton("W"));
		
		
		
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(300,300);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new BorderLayoutsCoursecomTamanhos();
	}
}