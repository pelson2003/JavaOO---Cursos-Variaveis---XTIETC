package GraphicInterface;
import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class JTextFieldJPasswordFieldInnerClass extends JFrame{

	JButton OK, Cancel;
	JTextField Login;
	JPasswordField Senha;
	
	public JTextFieldJPasswordFieldInnerClass() {

		//Ajustando o Layout
		super("Grids Layouts");	

		//Inicializa Botões e Adicionando Listener
		OK = new JButton("OK");
		OK.addActionListener(new BotaoOKListener());
		Cancel = new JButton("CANCEL");
		Cancel.addActionListener(new BotaoCancelListener());
		
		//Ajustando Layout
		Container containerpadrao = getContentPane();
		containerpadrao.setLayout(new GridLayout(3,2));
		
		//Utilizando JTextField
		containerpadrao.add(new JLabel("Login"));
		Login = new JTextField();
		containerpadrao.add(Login);
	
		//Utilizando JPassword
		containerpadrao.add(new JLabel("Senha"));
		Senha = new JPasswordField();
		containerpadrao.add(Senha);
		
		//Adicionando botoes
		containerpadrao.add(OK);
		containerpadrao.add(Cancel);
		
		//Definições Básicas
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(300,300);
		setVisible(true);
	}
	
	// Método Principal
	public static void main(String[] args) {
		new JTextFieldJPasswordFieldInnerClass();
	}

	class BotaoOKListener implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent e) {
			System.out.println("Clicou em OK");
			// Password Devolve um array de char por isso temos a questão do Casting
			String loginstring = "Login: " + Login.getText() + "\nsenha: " + new String(Senha.getPassword());
			JOptionPane.showMessageDialog(null, loginstring);		
		}
	}

	class BotaoCancelListener implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent e) {
			System.out.println("Clicou em Cancel");
			Login.setText("");
			Senha.setText("");
		}
	}
	
//	@Override // Somente para exemplo do e.getSource
//	public void actionPerformed(ActionEvent e) {
//		System.out.println("Você clicou no Botão");
//		//Usando GetSource para validar o evento e executar 
//		if(e.getSource()==OK){
//		} else if (e.getSource()==Cancel){	
//	}
}
