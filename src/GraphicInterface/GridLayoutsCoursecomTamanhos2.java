package GraphicInterface;
import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
public class GridLayoutsCoursecomTamanhos2 extends JFrame {

	public GridLayoutsCoursecomTamanhos2() {
		super("Grids Layouts");	
		Container gridwindow = getContentPane();
		
		//Criando com Linhas,Colunas, GridLayout
		gridwindow.setLayout(new GridLayout(2,3));
		
		gridwindow.add(new JButton("1"));
		gridwindow.add(new JButton("2"));
		gridwindow.add(new JButton("3"));
		gridwindow.add(new JButton("4"));
		gridwindow.add(new JButton("5"));
		gridwindow.add(new JButton("6"));
		
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(300,300);
		setVisible(true);
	}
	public static void main(String[] args) {
		new GridLayoutsCoursecomTamanhos2();
	}
}