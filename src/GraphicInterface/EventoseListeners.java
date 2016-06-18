package GraphicInterface;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class EventoseListeners extends JFrame implements ActionListener {

	JButton botao;
	
	public EventoseListeners() {
	
		super("Minha Janela, Meu Layout");
		//Inicializa o Botão,
		botao = new JButton("Clique");
		
		//Adicionando um método Listener para que ele execute o método
		botao.addActionListener(this);
				
		//Criando Containner, adicionando o botão e adicionando defaults infos
		Container c = getContentPane();
		c.add(botao);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(300,300);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new EventoseListeners();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
	System.out.println("Clicou");
	botao.setText("Foi Clicado");
	}
}
