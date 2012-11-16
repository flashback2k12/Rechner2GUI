package Main;

import java.awt.EventQueue;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class EingabeGUI extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtZahl1;
	private JTextField txtZahl2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					EingabeGUI frame = new EingabeGUI();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public EingabeGUI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 206);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblZahl1 = new JLabel("Zahl 1:");
		lblZahl1.setBounds(25, 43, 67, 14);
		contentPane.add(lblZahl1);
		
		JLabel lblZahl2 = new JLabel("Zahl 2:");
		lblZahl2.setBounds(25, 68, 46, 14);
		contentPane.add(lblZahl2);
		
		txtZahl1 = new JTextField();
		txtZahl1.setBounds(90, 40, 86, 20);
		contentPane.add(txtZahl1);
		txtZahl1.setColumns(10);
		
		txtZahl2 = new JTextField();
		txtZahl2.setBounds(90, 65, 86, 20);
		contentPane.add(txtZahl2);
		txtZahl2.setColumns(10);
		
		JButton btnDatensenden = new JButton("DatenSenden");
		btnDatensenden.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				GlobalVariable.gloVar.setZahl1(Double.parseDouble(txtZahl1.getText()));
				GlobalVariable.gloVar.setZahl2(Double.parseDouble(txtZahl2.getText()));

                                    /*
                                    * Versuch gleichzeitig Datenuebergabe + GUI Wechsel
                                    */

                                    AusgabeGUI ag = new AusgabeGUI();
				ag.setVisible(true); 
				
			}
		});
		btnDatensenden.setBounds(25, 116, 151, 23);
		contentPane.add(btnDatensenden);
		
		JButton btnWeiter = new JButton("Weiter");
		btnWeiter.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
//				AusgabeGUI ag = new AusgabeGUI();
//				ag.setVisible(true); 
				
			}
		});
		btnWeiter.setBounds(205, 116, 151, 23);
		contentPane.add(btnWeiter);
	}

}
