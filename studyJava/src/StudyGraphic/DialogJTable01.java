package StudyGraphic;

import java.awt.FlowLayout;

import javax.swing.*;
import javax.swing.event.TableModelEvent;
import javax.swing.event.TableModelListener;
import javax.swing.table.DefaultTableModel;

public class DialogJTable01 extends JDialog implements TableModelListener{
	
	JTable jTable01;
	DefaultTableModel defaultTableModel01;
	
	@Override
	public void tableChanged(TableModelEvent e){
		System.out.println("table changed");
	}
	
	public DialogJTable01() {
		// TODO Auto-generated constructor stub
		setTitle("jtable");
		setBounds(40, 40, 400, 200);
		jTable01 = new JTable();
		defaultTableModel01 = new DefaultTableModel();
		jTable01.setModel(defaultTableModel01);
		
		jTable01.getModel().addTableModelListener(this);
		
		fullTheJTable();
		
		setLayout(new FlowLayout());
		
		getContentPane().add(jTable01);
		setVisible(true);
	}
	
	public void fullTheJTable(){
		defaultTableModel01.addColumn("col00");
		defaultTableModel01.addColumn("col01");
		defaultTableModel01.addColumn("col02");
		
		defaultTableModel01.addRow(new Object[]{
				"00", "01", "02"	
		});
		defaultTableModel01.addRow(new Object[]{
				"10", "11", "12"	
		});
		defaultTableModel01.addRow(new Object[]{
				"10", "11"	
		});
	}
}
