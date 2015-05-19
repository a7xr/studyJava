package StudyGraphic;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;

import javax.swing.*;

import Tools.MysqlManage;

public class DialogSqlNotSelect extends JDialog implements ActionListener{
	MysqlManage sql;
	public JTextArea jTextAreaQuery;
	public JButton jButtonExec = new JButton("exec");
	public JButton jButtonClose = new JButton("close");
	
	public DialogSqlNotSelect() throws ClassNotFoundException, SQLException {
		setTitle("not select query");
		setSize(400, 300);
		
		sql = new MysqlManage();
		
//		setBounds(60, 15, 400, 300);
		jTextAreaQuery = new JTextArea("", 5, 50);
		JScrollPane scrollpane = new JScrollPane(jTextAreaQuery);
		
		setLayout(new FlowLayout());
		
		getContentPane().add(scrollpane);
		getContentPane().add(jButtonExec);
		getContentPane().add(jButtonClose);
		jButtonExec.addActionListener(this);
		jButtonClose.addActionListener(this);
		
		pack();
		
		setVisible(true);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == jButtonExec) {
			System.out.println("execution of sql");
			try {
				sql.ins_upd_del_QueryToStatement(jTextAreaQuery.getText());
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				System.out.println("ur query is not ok");
				System.out.println("	query:");
				System.out.println("	"+jTextAreaQuery.getText());
				e1.printStackTrace();
			}
		}else if(e.getSource() == jButtonClose){
			setVisible(false);
		}
	}
		
}
