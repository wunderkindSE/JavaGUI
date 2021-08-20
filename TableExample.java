package UI_Prototype;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.SwingUtilities;

public class TableExample extends JFrame {
	
	public TableExample()
	{
		String[] columns = new String[] {
			"Batch No.", "Status", "Tracking No.", "Delivery No."
		};
		
		Object[][] data = new Object[][] { //Data from Kewill should display below
			/*{1, "Open", 1235, 73001},
			{2, "Closed", 1114, 72900},
			{3, "Incomplete", 1045, 72901}*/
		};
		
		JTable table = new JTable(data, columns); //Create table with data and columns
		
		this.add(new JScrollPane(table));
		
		this.setTitle("Table Example");
		this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		this.pack();
		this.setVisible(true);
	}
	
	public static void main(String[] args)
	{
		SwingUtilities.invokeLater(new Runnable() {
			@Override
			public void run() {
				new TableExample();
			}
		});
	}
}
