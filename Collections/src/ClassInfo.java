import java.awt.BorderLayout;
import java.awt.List;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

public class ClassInfo extends JFrame {

	private JPanel contentPanel;
	private JTable table;
	private ArrayList<String[]> studentsInfo;
	
	public ClassInfo(ArrayList<String[]> studentsInfo) {
		this.studentsInfo = studentsInfo;
		setTitle("使用List结合传递学生信息");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 392, 223);
		contentPanel = new JPanel();
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPanel.setLayout(new BorderLayout());
		setContentPane(contentPanel);
		JScrollPane scrollPane = new JScrollPane();
		contentPanel.add(scrollPane, BorderLayout.CENTER);
		scrollPane.setViewportView(geTable());
	}
	
	private JTable geTable() {
		if (table == null) {
			table = new JTable();
			table.setRowHeight(23);
			String[] columns = {"姓名", "性别", "出生日期"};
			DefaultTableModel tableModel = new DefaultTableModel(columns, 0);
			table.setModel(tableModel);
			for (String[] rows : studentsInfo) {
				tableModel.addRow(rows);
			}
		}
		
		return table;
	}
	
	
	

	public static void main(String[] args) {
		ArrayList<String[]> infos = new ArrayList<>();
		infos.add(new String[]{"Boshan", "男", "1989-01-10"});
		infos.add(new String[]{"May", "女", "1989-01-10"});
		infos.add(new String[]{"Land", "男", "1989-01-10"});
		infos.add(new String[]{"Alice", "女", "1989-01-10"});
		infos.add(new String[]{"Bob", "男", "1989-01-10"});
		infos.add(new String[]{"Creeky", "女", "1989-01-10"});
		infos.add(new String[]{"Robin", "男", "1989-01-10"});
		infos.add(new String[]{"Jason", "男", "1989-01-10"});
		
		ClassInfo infoPanel = new ClassInfo(infos);
		infoPanel.setVisible(true);

	}

}
