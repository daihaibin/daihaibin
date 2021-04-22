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
	private JPanel contentPane=new JPanel();;//中间容器
	JLabel lblNewLabel = new JLabel("学生信息管理系统");//标签
	
	
	private JButton positionAdd=new JButton("信息录入"); 
	private JButton positionDelete=new JButton("信息删除");
	private JButton positionSeek=new JButton("信息查找"); 
	private JButton positionLook=new JButton("信息浏览"); 
	private JButton positionChange=new JButton("信息修改"); //按钮部分
	public main()
	{
		this.contentPane.setOpaque(false);//设 置不可拉框
		Image im;
		ImageIcon ig = new ImageIcon("D:\\java工作空间\\学生管理系统\\src\\view\\");
		im = ig.getImage();
		setIconImage(im);
		ImageIcon img = new ImageIcon("D:\\java工作空间\\学生管理系统\\src\\view\\");
		JLabel imgLabel = new JLabel(img);
		this.getLayeredPane().add(imgLabel,new Integer(Integer.MIN_VALUE));
		imgLabel.setBounds(0,0,img.getIconWidth(),img.getIconHeight());//设置背景图片
		
		
		this.setContentPane(this.contentPane);
		this.contentPane.setLayout(null);//设置布局 通过中间容器
		
		
		this.setBounds(100, 100, 600, 348);
		this.setTitle("学生信息管理系统");//设置标题
		
		
		this.add(this.lblNewLabel);
		this.lblNewLabel.setFont(new Font("宋体", Font.PLAIN, 24));//设置标签
		this.lblNewLabel.setBounds(198, 37, 197, 43);
		
		this.add(this.positionAdd);
		this.add(this.positionDelete);
		this.add(this.positionSeek);
		this.add(this.positionLook);
		this.add(this.positionChange);//设置按钮
		
		this.positionAdd.setBounds(90, 129, 120, 28);
		this.positionDelete.setBounds(382, 129, 120, 28);
		this.positionSeek.setBounds(90, 181, 120, 28);
		this.positionLook.setBounds(382, 183, 120, 25);
		this.positionChange.setBounds(90, 237, 120, 23);//设置按钮位置
		
		ActionAdd add=new ActionAdd();
		ActionDelete delete=new ActionDelete();
		ActionLook look=new ActionLook();
		ActionSeek seek=new ActionSeek();
		ActionChange change=new ActionChange();
		
		this.positionAdd.addActionListener(add);
		this.positionDelete.addActionListener(delete);
		this.positionLook.addActionListener(look);
		this.positionSeek.addActionListener(seek);
		this.positionChange.addActionListener(change);//设置监听
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE );
		this.setResizable(false);
		this.setVisible(true);//设置可见
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		main MAIN=new main();
	}

}
