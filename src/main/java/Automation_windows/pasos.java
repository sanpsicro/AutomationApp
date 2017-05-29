package Automation_windows;

import javax.swing.JPanel;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JSeparator;
import javax.swing.JLabel;
import javax.swing.JTextField;

import java.awt.SystemColor;

import javax.swing.JEditorPane;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JList;
import javax.swing.border.SoftBevelBorder;
import javax.swing.border.BevelBorder;
import javax.swing.JButton;
import javax.swing.JSplitPane;
import javax.swing.JDesktopPane;
import javax.swing.JInternalFrame;
import javax.swing.JSpinner;
import javax.swing.JSlider;

import java.awt.Label;

import javax.swing.SwingConstants;

import java.awt.Font;

import javax.swing.border.TitledBorder;
import javax.swing.UIManager;
import javax.swing.JComboBox;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.AbstractTableModel;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

import windows_functionality.MyTableModel;

public class pasos extends JPanel {
	private JTextField textField;
	private JTextField textField_1;
	private JTable table;
	private JTable table_1;

	/**
	 * Create the panel.
	 */
	public pasos() {
		setBackground(SystemColor.inactiveCaptionText);
		
		JSeparator separator = new JSeparator();
		
		JPanel panel = new JPanel();
		
		JLabel lblCaso = new JLabel("PASO");
		
		textField = new JTextField();
		textField.setEditable(false);
		textField.setColumns(10);
		
		JLabel label_2 = new JLabel("ID");
		
		textField_1 = new JTextField();
		textField_1.setEditable(false);
		textField_1.setColumns(10);
		textField_1.setBackground(SystemColor.menu);
		GroupLayout gl_panel = new GroupLayout(panel);
		gl_panel.setHorizontalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addGap(19)
					.addComponent(lblCaso, GroupLayout.PREFERRED_SIZE, 42, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addComponent(textField, GroupLayout.PREFERRED_SIZE, 222, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addComponent(label_2, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(textField_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
		);
		gl_panel.setVerticalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
						.addComponent(textField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(textField_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblCaso)
						.addComponent(label_2))
					.addContainerGap(74, Short.MAX_VALUE))
		);
		panel.setLayout(gl_panel);
		
		JPanel panel_2 = new JPanel();
		
		JPanel panel_3 = new JPanel();
		panel_3.setBounds(101, 435, 445, 29);
		
		JButton btnEliminarProcedimientos = new JButton("eliminar procedimiento(s)");
		btnEliminarProcedimientos.setBounds(205, 0, 210, 23);
		
		JButton btnCopiarProcedimientos = new JButton("copiar procedimiento(s)");
		btnCopiarProcedimientos.setBounds(10, 0, 185, 23);
		
		JLabel lblProcedimientos = new JLabel("PROCEDIMIENTOS");
		lblProcedimientos.setBounds(274, 11, 134, 14);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(SystemColor.controlHighlight);
		GroupLayout groupLayout = new GroupLayout(this);
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
						.addComponent(panel_2, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(panel, GroupLayout.DEFAULT_SIZE, 659, Short.MAX_VALUE)
						.addComponent(separator, GroupLayout.DEFAULT_SIZE, 659, Short.MAX_VALUE))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(panel_1, GroupLayout.PREFERRED_SIZE, 339, GroupLayout.PREFERRED_SIZE)
					.addGap(16))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(11)
					.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
						.addGroup(Alignment.LEADING, groupLayout.createSequentialGroup()
							.addComponent(panel, GroupLayout.PREFERRED_SIZE, 55, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(separator, GroupLayout.PREFERRED_SIZE, 9, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
							.addComponent(panel_2, GroupLayout.PREFERRED_SIZE, 533, GroupLayout.PREFERRED_SIZE))
						.addComponent(panel_1, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 600, Short.MAX_VALUE))
					.addContainerGap())
		);
		panel_2.setLayout(null);
		panel_2.add(lblProcedimientos);
		panel_2.add(panel_3);
		panel_3.setLayout(null);
		panel_3.add(btnCopiarProcedimientos);
		panel_3.add(btnEliminarProcedimientos);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 36, 622, 331);
		panel_2.add(scrollPane);
		
		 windows_functionality.MyTableModel tabla= new windows_functionality.MyTableModel();
		 tabla.setColumnNames(new String[] {"","ORDEN","ACCION","FUNCION","OBJETO","ATTACH"});
		 tabla.setMatrixData(new Object[][] {
				 
        { null, null, null, null,
        	null,null },
    	{ null, null, null, null,
        	null,null },
    	{ null, null, null, null,
        	null,null },
    	{ null, null, null, null,
        	null,null },
    	{ null, null, null, null,
        	null,null },
        	 });
		
		table_1 = new JTable(tabla);
		table_1.setColumnSelectionAllowed(true);
		table_1.setCellSelectionEnabled(true);
		table_1.setBackground(SystemColor.activeCaption);
		scrollPane.setViewportView(table_1);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		
		JPanel panel_5 = new JPanel();
		GroupLayout gl_panel_1 = new GroupLayout(panel_1);
		gl_panel_1.setHorizontalGroup(
			gl_panel_1.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_panel_1.createSequentialGroup()
					.addGap(58)
					.addComponent(panel_4, GroupLayout.PREFERRED_SIZE, 244, Short.MAX_VALUE)
					.addGap(37))
				.addGroup(gl_panel_1.createSequentialGroup()
					.addContainerGap()
					.addComponent(panel_5, GroupLayout.DEFAULT_SIZE, 310, Short.MAX_VALUE)
					.addGap(19))
		);
		gl_panel_1.setVerticalGroup(
			gl_panel_1.createParallelGroup(Alignment.TRAILING)
				.addGroup(Alignment.LEADING, gl_panel_1.createSequentialGroup()
					.addGap(13)
					.addComponent(panel_4, GroupLayout.PREFERRED_SIZE, 57, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(panel_5, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
					.addContainerGap())
		);
		
		JLabel label_3 = new JLabel("ACCION");
		label_3.setBounds(10, 24, 60, 14);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setBounds(78, 21, 222, 20);
		
		JLabel lblFuncion = new JLabel("FUNCION");
		lblFuncion.setBounds(10, 58, 60, 14);
		
		JComboBox comboBox_2 = new JComboBox();
		comboBox_2.setBounds(80, 55, 222, 20);
		
		JLabel lblObjeto = new JLabel("OBJETO");
		lblObjeto.setBounds(10, 114, 50, 14);
		
		JComboBox comboBox_3 = new JComboBox();
		comboBox_3.setBounds(80, 111, 222, 20);
		
		JButton btnNewButton_2 = new JButton("GUARDAR");
		btnNewButton_2.setBounds(99, 465, 127, 23);
		
		JLabel lblRepoObj = new JLabel("REPO OBJ");
		lblRepoObj.setBounds(10, 83, 60, 14);
		
		JComboBox comboBox_4 = new JComboBox();
		comboBox_4.setBounds(80, 80, 222, 20);
		panel_5.setLayout(null);
		panel_5.add(lblRepoObj);
		panel_5.add(comboBox_4);
		panel_5.add(btnNewButton_2);
		panel_5.add(label_3);
		panel_5.add(lblFuncion);
		panel_5.add(lblObjeto);
		panel_5.add(comboBox_2);
		panel_5.add(comboBox_1);
		panel_5.add(comboBox_3);
		
		JLabel lblNuevoProcedimiento = new JLabel("NUEVO PROCEDIMIENTO");
		lblNuevoProcedimiento.setHorizontalAlignment(SwingConstants.CENTER);
		GroupLayout gl_panel_4 = new GroupLayout(panel_4);
		gl_panel_4.setHorizontalGroup(
			gl_panel_4.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_panel_4.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblNuevoProcedimiento, GroupLayout.DEFAULT_SIZE, 215, Short.MAX_VALUE)
					.addGap(23))
		);
		gl_panel_4.setVerticalGroup(
			gl_panel_4.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_4.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblNuevoProcedimiento, GroupLayout.PREFERRED_SIZE, 34, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
		);
		panel_4.setLayout(gl_panel_4);
		panel_1.setLayout(gl_panel_1);
		setLayout(groupLayout);

	}
}






