package GraphicInterface;
import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
public class Trabalhandocom2LayoutsCourse extends JFrame {

	public Trabalhandocom2LayoutsCourse() {
		super("Grids Layouts");	
		Container borderwindows = getContentPane();
		borderwindows.setLayout(new BorderLayout());
		
		Container gridwindow = new JPanel();
		
		gridwindow.setLayout(new GridLayout(4,1));
		gridwindow.add(new JButton("1"));
		gridwindow.add(new JButton("2"));
		gridwindow.add(new JButton("3"));
		gridwindow.add(new JButton("4"));
		
		borderwindows.add(BorderLayout.CENTER, new JButton("Center"));
		borderwindows.add(BorderLayout.EAST, gridwindow);
		
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(300,300);
		setVisible(true);
	}
	public static void main(String[] args) {
		new Trabalhandocom2LayoutsCourse();
	}
}