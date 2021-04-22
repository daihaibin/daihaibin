package view;

import java.awt.Font;
import java.awt.Image;
import java.awt.Toolkit;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import control.ActionAdd;
import control.ActionChange;
import control.ActionDelete;
import control.ActionLook;
import control.ActionSeek;

public class main extends JFrame {
	private JPanel contentPane=new JPanel();;//�м�����
	JLabel lblNewLabel = new JLabel("ѧ����Ϣ����ϵͳ");//��ǩ
	
	
	private JButton positionAdd=new JButton("��Ϣ¼��"); 
	private JButton positionDelete=new JButton("��Ϣɾ��");
	private JButton positionSeek=new JButton("��Ϣ����"); 
	private JButton positionLook=new JButton("��Ϣ���"); 
	private JButton positionChange=new JButton("��Ϣ�޸�"); //��ť����
	public main()
	{
		this.contentPane.setOpaque(false);//�� �ò�������
		Image im;
		ImageIcon ig = new ImageIcon("D:\\java�����ռ�\\ѧ������ϵͳ\\src\\view\\");
		im = ig.getImage();
		setIconImage(im);
		ImageIcon img = new ImageIcon("D:\\java�����ռ�\\ѧ������ϵͳ\\src\\view\\");
		JLabel imgLabel = new JLabel(img);
		this.getLayeredPane().add(imgLabel,new Integer(Integer.MIN_VALUE));
		imgLabel.setBounds(0,0,img.getIconWidth(),img.getIconHeight());//���ñ���ͼƬ
		
		
		this.setContentPane(this.contentPane);
		this.contentPane.setLayout(null);//���ò��� ͨ���м�����
		
		
		this.setBounds(100, 100, 600, 348);
		this.setTitle("ѧ����Ϣ����ϵͳ");//���ñ���
		
		
		this.add(this.lblNewLabel);
		this.lblNewLabel.setFont(new Font("����", Font.PLAIN, 24));//���ñ�ǩ
		this.lblNewLabel.setBounds(198, 37, 197, 43);
		
		this.add(this.positionAdd);
		this.add(this.positionDelete);
		this.add(this.positionSeek);
		this.add(this.positionLook);
		this.add(this.positionChange);//���ð�ť
		
		this.positionAdd.setBounds(90, 129, 120, 28);
		this.positionDelete.setBounds(382, 129, 120, 28);
		this.positionSeek.setBounds(90, 181, 120, 28);
		this.positionLook.setBounds(382, 183, 120, 25);
		this.positionChange.setBounds(90, 237, 120, 23);//���ð�ťλ��
		
		ActionAdd add=new ActionAdd();
		ActionDelete delete=new ActionDelete();
		ActionLook look=new ActionLook();
		ActionSeek seek=new ActionSeek();
		ActionChange change=new ActionChange();
		
		this.positionAdd.addActionListener(add);
		this.positionDelete.addActionListener(delete);
		this.positionLook.addActionListener(look);
		this.positionSeek.addActionListener(seek);
		this.positionChange.addActionListener(change);//���ü���
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE );
		this.setResizable(false);
		this.setVisible(true);//���ÿɼ�
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		main MAIN=new main();
	}

}
