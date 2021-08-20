package UI_Prototype; // Search (batch #, delivery #, etc.)

import java.awt.EventQueue;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.JScrollBar;
//import javax.swing.JMenuBar;
import javax.swing.JOptionPane;
import javax.swing.JComboBox;
//import javax.swing.JSeparator;
import javax.swing.JButton;
import javax.swing.DefaultComboBoxModel;
import javax.swing.SwingConstants;
import javax.swing.JCheckBox;

public class UI_Prototype {

	private JFrame frame;
	private JTextField txtBatch;
	private JTextField txtTrack;
	private JTextField txtDeliv;
	private JTextField txtShipfrom;
	private JTextField txtPdate;
	private JTextField txtCdate;
	private JTextField txtShipto;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					UI_Prototype window = new UI_Prototype();
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
	public UI_Prototype() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(500, 500, 650, 400);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblSearch = new JLabel("SEARCH");
		lblSearch.setHorizontalAlignment(SwingConstants.CENTER);
		lblSearch.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblSearch.setBounds(280, 23, 104, 20);
		frame.getContentPane().add(lblSearch);
		
		txtBatch = new JTextField();
		txtBatch.setBounds(106, 75, 86, 20);
		frame.getContentPane().add(txtBatch);
		txtBatch.setColumns(10);
		
		JLabel lblBatch = new JLabel("Batch No.");
		lblBatch.setBounds(30, 75, 65, 19);
		frame.getContentPane().add(lblBatch);
		
		/*JRadioButton rdbtnShow = new JRadioButton("Show All"); //If commented out, clicking Clear produces an error
		rdbtnShow.setBounds(230, 75, 80, 15);
		frame.getContentPane().add(rdbtnShow);*/
		
		JCheckBox cbShow = new JCheckBox("Show All");
		cbShow.setHorizontalAlignment(SwingConstants.CENTER);
		cbShow.setBounds(312, 74, 97, 23);
		frame.getContentPane().add(cbShow);
		
		JScrollBar scrollBar = new JScrollBar();
		scrollBar.setBounds(592, 101, 17, 168);
		frame.getContentPane().add(scrollBar);
		
		JLabel lblStatus = new JLabel("Status"); //Change the Open + Closed + Incomplete buttons to a drop-down list???
		lblStatus.setBounds(31, 120, 65, 18);
		frame.getContentPane().add(lblStatus);
		
		JComboBox cmbStatus = new JComboBox();
		cmbStatus.setModel(new DefaultComboBoxModel(new String[] {"Choose one:", "Open", "Closed", "Incomplete"}));
		cmbStatus.setBounds(106, 118, 149, 22);
		frame.getContentPane().add(cmbStatus);
		
		JLabel lblTrack = new JLabel("Tracking No.");
		lblTrack.setBounds(31, 165, 79, 20);
		frame.getContentPane().add(lblTrack);
		
		txtTrack = new JTextField();
		txtTrack.setBounds(129, 165, 86, 20);
		frame.getContentPane().add(txtTrack);
		txtTrack.setColumns(10);
		
		JLabel lblDeliv = new JLabel("Delivery No.");
		lblDeliv.setBounds(264, 165, 89, 20);
		frame.getContentPane().add(lblDeliv);
		
		txtDeliv = new JTextField();
		txtDeliv.setBounds(379, 165, 86, 20);
		frame.getContentPane().add(txtDeliv);
		txtDeliv.setColumns(10);
		
		JLabel lblShipto = new JLabel("Ship To");
		lblShipto.setBounds(31, 210, 79, 20);
		frame.getContentPane().add(lblShipto);
		
		txtShipto = new JTextField();
		txtShipto.setBounds(129, 210, 86, 20);
		frame.getContentPane().add(txtShipto);
		txtShipto.setColumns(10);
		
		JLabel lblShipfrom = new JLabel("Ship From");
		lblShipfrom.setBounds(264, 210, 89, 20);
		frame.getContentPane().add(lblShipfrom);
		
		txtShipfrom = new JTextField();
		txtShipfrom.setBounds(379, 210, 86, 20);
		frame.getContentPane().add(txtShipfrom);
		txtShipfrom.setColumns(10);
		
		JLabel lblPdate = new JLabel("Promise Date");
		lblPdate.setBounds(30, 255, 80, 20);
		frame.getContentPane().add(lblPdate);
		
		txtPdate = new JTextField();
		txtPdate.setBounds(129, 255, 86, 20);
		frame.getContentPane().add(txtPdate);
		txtPdate.setColumns(10);
		
		JLabel lblCdate = new JLabel("Created Date");
		lblCdate.setBounds(264, 255, 89, 20);
		frame.getContentPane().add(lblCdate);
		
		txtCdate = new JTextField();
		txtCdate.setBounds(379, 255, 86, 20);
		frame.getContentPane().add(txtCdate);
		txtCdate.setColumns(10);
		
		JButton btnGo = new JButton("Go");
		btnGo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if (txtBatch.getText().isEmpty()) {
					
					JOptionPane.showMessageDialog(txtBatch, "You cannot leave the Batch No. field blank");
				}
				
				else {
				TableExample obj = new TableExample();
				obj.setVisible(true);
				}
			}
		});
		
		btnGo.setBounds(145, 307, 89, 23);
		frame.getContentPane().add(btnGo);
		
		JButton btnClear = new JButton("Clear"); //Clearing all inputs
		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				txtBatch.setText(null);
				cbShow.setSelected(false);
				cmbStatus.setSelectedItem("Choose one:");
				txtTrack.setText(null);
				txtDeliv.setText(null);
				txtShipfrom.setText(null);
				txtPdate.setText(null);
				txtCdate.setText(null);
				txtShipto.setText(null);
			}
		});
		
		btnClear.setBounds(325, 307, 89, 23);
		frame.getContentPane().add(btnClear);
		
	}
}
