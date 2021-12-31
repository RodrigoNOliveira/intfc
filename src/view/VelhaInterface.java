package view;

import java.awt.EventQueue;
import classes.*;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class VelhaInterface {

	private JFrame janela;
	private Jogo jogo;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		
					VelhaInterface window = new VelhaInterface();
					window.janela.setVisible(true);
				
	}

	/**
	 * Create the application.
	 */
	public VelhaInterface() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		jogo = new Jogo();
		janela = new JFrame();
		janela.setBackground(new Color(0, 0, 255));
		janela.getContentPane().setBackground(new Color(255, 255, 224));
		janela.setBounds(100, 100, 450, 376);
		janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		janela.getContentPane().setLayout(null);
		
		JLabel Labelvelha = new JLabel("Jogo Da Velha");
		Labelvelha.setBackground(new Color(250, 250, 210));
		Labelvelha.setFont(new Font("Tahoma", Font.BOLD, 30));
		Labelvelha.setHorizontalAlignment(SwingConstants.CENTER);
		Labelvelha.setBounds(78, 51, 284, 37);
		janela.getContentPane().add(Labelvelha);
		
		JButton ButtonIniciar = new JButton("INICIAR");
		ButtonIniciar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				jogo.iniciar();
			}
		});
		ButtonIniciar.setFont(new Font("Tahoma", Font.BOLD, 20));
		ButtonIniciar.setBounds(153, 138, 130, 33);
		janela.getContentPane().add(ButtonIniciar);
	}
}
