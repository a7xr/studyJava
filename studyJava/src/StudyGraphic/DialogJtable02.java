package StudyGraphic;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class DialogJtable02 extends JDialog implements ActionListener{

	JTextField jTextField01, 
		jTextField02,
		jTextField03;
	JButton jButton;
	JTable jTable;
	DefaultTableModel defaultTableModel;
	
	public DialogJtable02(){
		setTitle("title");
		setBounds(70, 55, 400, 200);
		setModal(true);
		
		jTextField01 = new JTextField(5);
		jTextField02 = new JTextField(5);
		jTextField03 = new JTextField(5);
		
		setLayout(new FlowLayout());
		
		jButton = new JButton("add");
		
		jTable = new JTable();
		defaultTableModel = new DefaultTableModel();
		jTable.setModel(defaultTableModel);
		
		defaultTableModel.addColumn("A");
		defaultTableModel.addColumn("B");
		defaultTableModel.addColumn("C");
		defaultTableModel.addRow(
				new Object[]{
						"00", "01",
				}
				);
		
		jButton.addActionListener(this);
		
		add(jTextField01);
		add(jTextField02);
		add(jTextField03);
		add(jButton);
		add( new JScrollPane(jTable, JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED, JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED));
		
		jTable.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource() == jButton){
			defaultTableModel.addRow(
					new Object[]{
						jTextField01.getText(),
						jTextField02.getText(),
						jTextField03.getText()
					});
		}
	}
	
}
