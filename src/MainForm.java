import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.RowSpec;
import com.jgoodies.forms.layout.FormSpecs;
import javax.swing.JButton;
import java.awt.GridLayout;
import java.awt.BorderLayout;
import javax.swing.JTextField;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;
import java.awt.Color;
import java.awt.SystemColor;


public class MainForm {

	private JFrame frame;
	private JTextField txtTentativi;
	private JTextField txtTMAX;
	private JTextField txtProva;
	private JButton btnNuova;
	private JButton btnProva;
	private JTextField txtLog;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainForm window = new MainForm();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public MainForm() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 600, 500);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setTitle("INDOVINA IL NUMERO");
		frame.getContentPane().setLayout(null);
		
		btnNuova = new JButton("Nuova Partita");
		btnNuova.setBounds(25, 32, 147, 25);
		frame.getContentPane().add(btnNuova);
		
		JLabel lblTentativi = new JLabel("Tentativi");
		lblTentativi.setBounds(222, 42, 70, 15);
		frame.getContentPane().add(lblTentativi);
		
		txtTentativi = new JTextField();
		txtTentativi.setEditable(false);
		txtTentativi.setBounds(299, 38, 114, 19);
		frame.getContentPane().add(txtTentativi);
		txtTentativi.setColumns(10);
		
		txtTMAX = new JTextField();
		txtTMAX.setEditable(false);
		txtTMAX.setColumns(10);
		txtTMAX.setBounds(449, 38, 114, 19);
		frame.getContentPane().add(txtTMAX);
		
		JLabel label = new JLabel("  /");
		label.setBounds(418, 37, 31, 15);
		frame.getContentPane().add(label);
		
		JPanel panel = new JPanel();
		panel.setBorder(new LineBorder(SystemColor.inactiveCaption));
		panel.setBounds(12, 12, 574, 80);
		frame.getContentPane().add(panel);
		
		JLabel lblTentativo = new JLabel("Tentativo:");
		lblTentativo.setBounds(25, 119, 110, 15);
		frame.getContentPane().add(lblTentativo);
		
		txtProva = new JTextField();
		txtProva.setBounds(153, 117, 114, 19);
		frame.getContentPane().add(txtProva);
		txtProva.setColumns(10);
		
		btnProva = new JButton("Prova");
		btnProva.setBounds(348, 114, 117, 25);
		frame.getContentPane().add(btnProva);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new LineBorder(SystemColor.inactiveCaption));
		panel_1.setBounds(12, 104, 574, 80);
		frame.getContentPane().add(panel_1);
		
		txtLog = new JTextField();
		txtLog.setBounds(12, 196, 574, 263);
		frame.getContentPane().add(txtLog);
		txtLog.setColumns(10);
	}
}
