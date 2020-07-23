package paginas;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JTable;

public class ListaUsuarios extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ListaUsuarios frame = new ListaUsuarios();
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
	public ListaUsuarios() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.NORTH);
		
		JButton btnAdd = new JButton("ADD");
		panel.add(btnAdd);
		
		JButton btnEdit = new JButton("EDIT");
		panel.add(btnEdit);
		
		JButton btnRem = new JButton("REM");
		panel.add(btnRem);
		
		textField = new JTextField();
		panel.add(textField);
		textField.setColumns(20);
		
		JButton btnBus = new JButton("BUS");
		panel.add(btnBus);
		
		table = new JTable();
		contentPane.add(table, BorderLayout.CENTER);
	}

}
