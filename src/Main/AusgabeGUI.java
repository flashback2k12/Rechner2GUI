package Main;

import java.awt.EventQueue;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class AusgabeGUI extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AusgabeGUI frame = new AusgabeGUI();
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
	public AusgabeGUI() {
		setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		setBounds(100, 100, 450, 177);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		final JLabel lblErgebnis = new JLabel("Ergebnis: ");
		lblErgebnis.setBounds(10, 41, 189, 14);
		contentPane.add(lblErgebnis);
		
          /*
          * Daten aus "Zwischenspeicher" holen und Additionsrechenoperation durchführen 
          *
          * Rename Button = Addieren
          */

		JButton btnDatenholen = new JButton("DatenHolen");
		btnDatenholen.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				double zahl1, zahl2;
				
				zahl1 = GlobalVariable.gloVar.getZahl1();
				zahl2 = GlobalVariable.gloVar.getZahl2();
				
				lblErgebnis.setText("Ergebnis: " + CalcOperator.addiere2(zahl1, zahl2)); 
				
			}
		});
		btnDatenholen.setBounds(10, 77, 189, 23);
		contentPane.add(btnDatenholen);
		
		JButton btnZurck = new JButton("Zurueck");
		btnZurck.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				EingabeGUI eg = new EingabeGUI();
				eg.setVisible(true); 
				
			}
		});
		btnZurck.setBounds(209, 77, 189, 23);
		contentPane.add(btnZurck);
	

          /*
          * Daten aus "Zwischenspeicher" holen und Rechenoperation durchführen 
          *
          * Initalisierung Button noch durchführen bzw. Position anpassen
          

		JButton btnDatenholen = new JButton("Subtrahieren");
		btnDatenholen.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				double zahl1, zahl2;
				
				zahl1 = GlobalVariable.gloVar.getZahl1();
				zahl2 = GlobalVariable.gloVar.getZahl2();
				
				lblErgebnis.setText("Ergebnis: " + CalcOperator.sub2(zahl1, zahl2)); 
				
			}
		});
		btnDatenholen.setBounds(10, 77, 189, 23);
		contentPane.add(btnDatenholen);

           */

          /*
          * Daten aus "Zwischenspeicher" holen und Rechenoperation durchführen 
          *
          * Initalisierung Button noch durchführen bzw. Position anpassen
          

		JButton btnDatenholen = new JButton("Multiplizieren");
		btnDatenholen.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				double zahl1, zahl2;
				
				zahl1 = GlobalVariable.gloVar.getZahl1();
				zahl2 = GlobalVariable.gloVar.getZahl2();
				
				lblErgebnis.setText("Ergebnis: " + CalcOperator.mul2(zahl1, zahl2)); 
				
			}
		});
		btnDatenholen.setBounds(10, 77, 189, 23);
		contentPane.add(btnDatenholen);

           */

          /*
          * Daten aus "Zwischenspeicher" holen und Rechenoperation durchführen 
          *
          * Initalisierung Button noch durchführen bzw. Position anpassen
          

		JButton btnDatenholen = new JButton("Dividieren");
		btnDatenholen.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				double zahl1, zahl2;
				
				zahl1 = GlobalVariable.gloVar.getZahl1();
				zahl2 = GlobalVariable.gloVar.getZahl2();
				
				lblErgebnis.setText("Ergebnis: " + CalcOperator.div2(zahl1, zahl2)); 
				
			}
		});
		btnDatenholen.setBounds(10, 77, 189, 23);
		contentPane.add(btnDatenholen);

           */

     }

}
