package com.day18;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;

//Abstract Window Toolkit->Swing�� �Ἥ Menu Bar�� Menu�����

public class Test7day18 extends JFrame implements ActionListener{

	private static final long serialVersionUID = 1L;
	
	private JLabel lbl;
	
	
	public Test7day18() {
		
		lbl = new JLabel("�޼���", JLabel.CENTER);//(���� ����, ��ġ)
		add(lbl);
		
		//Add Menu �޴� �߰�
		JMenuBar mbar = new JMenuBar();
		JMenu menu;
		JMenuItem mi;
		
		menu = new JMenu("�޼��� ��ȭ ����");//�޼��� ��ȭ ����
		mi = new JMenuItem("�޼���");//�޼���
		menu.add(mi);
		mi.addActionListener(this);

		mi = new JMenuItem("�Է�");//�Է�
		menu.add(mi);
		mi.addActionListener(this);

		mi = new JMenuItem("����");//����
		menu.add(mi);
		mi.addActionListener(this);
		
		mbar.add(menu);
		
		setJMenuBar(mbar);
		
		addWindowListener(new WindowAdapter() {

			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});

		setTitle("��ȭ����");//��ȭ����
		setSize(300, 300);
		setVisible(true);
		
	}

	public static void main(String[] args) {

		new Test7day18();
	}

	@Override
	public void actionPerformed(ActionEvent e) {//���⿡ ���ڰ� ����
		
		String str = e.getActionCommand();//�Է��� ������ �״�� ������
		
		//���� �� ���� ���� ö�� �״�� �� ����!!
		if(str.equals("�޼���")) {
			
			//���̾�α׸� ���տ� ��Ÿ����
			JOptionPane.showMessageDialog(this, "Friday is coming!", "���� �˸�", JOptionPane.INFORMATION_MESSAGE);
			
		}else if (str.equals("�Է�")) {
			
			String age = JOptionPane.showInputDialog(this, "���̰� ����̽Ű���?", "���� �Է�:", JOptionPane.QUESTION_MESSAGE);
			
			lbl.setText("����� ���̴� " + age + "�� �̽ó׿�..");
			
		}else if (str.equals("����")) {
			
			int result;
			
			result = JOptionPane.showConfirmDialog(this, "���α׷��� ���� ���?", "����Ȯ��", JOptionPane.YES_NO_OPTION, JOptionPane.ERROR_MESSAGE);
			
			//lbl.setText(Integer.toString(result));
			
			if(result == JOptionPane.YES_OPTION) {
				System.exit(0);
			}
		}
	}

}