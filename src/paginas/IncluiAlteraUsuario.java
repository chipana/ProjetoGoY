package paginas;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Dimension;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;

public class IncluiAlteraUsuario extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JTextField txtNome;
	private JTextField txtLogin;
	private JPasswordField txtSenha;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			IncluiAlteraUsuario dialog = new IncluiAlteraUsuario();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public IncluiAlteraUsuario() {
		setBounds(100, 100, 337, 212);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		GridBagLayout gbl_contentPanel = new GridBagLayout();
		gbl_contentPanel.columnWidths = new int[] {60, 120, 0};
		gbl_contentPanel.rowHeights = new int[] {30, 30, 30, 30, 0};
		gbl_contentPanel.columnWeights = new double[]{0.0, 0.0, Double.MIN_VALUE};
		gbl_contentPanel.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		contentPanel.setLayout(gbl_contentPanel);
		{
			JLabel lblNome = new JLabel("Nome: ");
			GridBagConstraints gbc_lblNome = new GridBagConstraints();
			gbc_lblNome.anchor = GridBagConstraints.EAST;
			gbc_lblNome.fill = GridBagConstraints.VERTICAL;
			gbc_lblNome.insets = new Insets(0, 0, 5, 5);
			gbc_lblNome.gridx = 0;
			gbc_lblNome.gridy = 0;
			contentPanel.add(lblNome, gbc_lblNome);
		}
		{
			txtNome = new JTextField();
			GridBagConstraints gbc_txtNome = new GridBagConstraints();
			gbc_txtNome.fill = GridBagConstraints.HORIZONTAL;
			gbc_txtNome.insets = new Insets(0, 0, 5, 0);
			gbc_txtNome.gridx = 1;
			gbc_txtNome.gridy = 0;
			contentPanel.add(txtNome, gbc_txtNome);
			txtNome.setColumns(30);
		}
		{
			JLabel lblLogin = new JLabel("Login: ");
			GridBagConstraints gbc_lblLogin = new GridBagConstraints();
			gbc_lblLogin.anchor = GridBagConstraints.EAST;
			gbc_lblLogin.fill = GridBagConstraints.VERTICAL;
			gbc_lblLogin.insets = new Insets(0, 0, 5, 5);
			gbc_lblLogin.gridx = 0;
			gbc_lblLogin.gridy = 1;
			contentPanel.add(lblLogin, gbc_lblLogin);
		}
		{
			txtLogin = new JTextField();
			GridBagConstraints gbc_txtLogin = new GridBagConstraints();
			gbc_txtLogin.fill = GridBagConstraints.HORIZONTAL;
			gbc_txtLogin.insets = new Insets(0, 0, 5, 0);
			gbc_txtLogin.gridx = 1;
			gbc_txtLogin.gridy = 1;
			contentPanel.add(txtLogin, gbc_txtLogin);
			txtLogin.setColumns(10);
		}
		{
			JLabel lblSenha = new JLabel("Senha: ");
			GridBagConstraints gbc_lblSenha = new GridBagConstraints();
			gbc_lblSenha.anchor = GridBagConstraints.EAST;
			gbc_lblSenha.fill = GridBagConstraints.VERTICAL;
			gbc_lblSenha.insets = new Insets(0, 0, 5, 5);
			gbc_lblSenha.gridx = 0;
			gbc_lblSenha.gridy = 2;
			contentPanel.add(lblSenha, gbc_lblSenha);
		}
		{
			txtSenha = new JPasswordField();
			txtSenha.setColumns(10);
			GridBagConstraints gbc_txtSenha = new GridBagConstraints();
			gbc_txtSenha.fill = GridBagConstraints.HORIZONTAL;
			gbc_txtSenha.insets = new Insets(0, 0, 5, 0);
			gbc_txtSenha.gridx = 1;
			gbc_txtSenha.gridy = 2;
			contentPanel.add(txtSenha, gbc_txtSenha);
		}
		{
			JLabel lblPerfil = new JLabel("Perfil: ");
			GridBagConstraints gbc_lblPerfil = new GridBagConstraints();
			gbc_lblPerfil.anchor = GridBagConstraints.EAST;
			gbc_lblPerfil.fill = GridBagConstraints.VERTICAL;
			gbc_lblPerfil.insets = new Insets(0, 0, 0, 5);
			gbc_lblPerfil.gridx = 0;
			gbc_lblPerfil.gridy = 3;
			contentPanel.add(lblPerfil, gbc_lblPerfil);
		}
		{
			JComboBox comboBox = new JComboBox();
			comboBox.setModel(new DefaultComboBoxModel(new String[] {"Usu\u00E1rio", "Administrador"}));
			GridBagConstraints gbc_comboBox = new GridBagConstraints();
			gbc_comboBox.anchor = GridBagConstraints.WEST;
			gbc_comboBox.gridx = 1;
			gbc_comboBox.gridy = 3;
			contentPanel.add(comboBox, gbc_comboBox);
		}
		{
			JPanel buttonPane = new JPanel();
			FlowLayout fl_buttonPane = new FlowLayout(FlowLayout.CENTER);
			fl_buttonPane.setHgap(15);
			buttonPane.setLayout(fl_buttonPane);
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{
				JButton okButton = new JButton("OK");
				okButton.setPreferredSize(new Dimension(75, 23));
				okButton.setActionCommand("OK");
				buttonPane.add(okButton);
				getRootPane().setDefaultButton(okButton);
			}
			{
				JButton cancelButton = new JButton("Cancel");
				cancelButton.setPreferredSize(new Dimension(75, 23));
				cancelButton.setActionCommand("Cancel");
				buttonPane.add(cancelButton);
			}
		}
	}

}
