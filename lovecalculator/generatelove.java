package lovecalculator;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.Random;

import javax.swing.*;

public class generatelove extends JFrame implements ActionListener,MouseListener {
	
	JLabel l1,l2,l3,l4,l5,l6,l7;
	ImageIcon i1,i2,i3,i4,i5,i6;
	JButton b1,b2,b3,b4;
	Image m1,m2,m3;
	JTextField t1,t2,t3,t4;
	JProgressBar p1;
	
	generatelove()
	{
		setLayout(null);
		
		l1=new JLabel("LOVE GENERATOR");
		l1.setBounds(350,10,600,60);
		l1.setForeground(Color.RED);
		l1.setFont(new Font("serif",Font.BOLD,40));
		add(l1);
		
		i1=new ImageIcon(getClass().getResource("lovimage.jpg"));
		m1=i1.getImage().getScaledInstance(900, 460,Image.SCALE_DEFAULT);
		i2=new ImageIcon(m1);
		l2=new JLabel(i2);
		l2.setBounds(0,0,1100,680);
		add(l2);
		
		
		
		l3=new JLabel("Enter Your Name : ");
		l3.setBounds(150,180,170,25);
		l3.setForeground(Color.BLACK);
		l3.setFont(new Font("serif",Font.BOLD,18));
		l2.add(l3);
		
		t1=new JTextField();
		t1.setHorizontalAlignment(SwingConstants.CENTER);
		t1.setFont(new Font("serif",Font.BOLD,18));
		t1.setBounds(370,180,150,25);
		l2.add(t1);
		
		l4=new JLabel("Enter Your Partner Name : ");
		l4.setBounds(150,225,220,25);
		l4.setForeground(Color.BLACK);
		l4.setFont(new Font("serif",Font.BOLD,18));
		l2.add(l4);
		
		t2=new JTextField();
		t2.setHorizontalAlignment(SwingConstants.CENTER);
		t2.setFont(new Font("serif",Font.BOLD,18));
		t2.setBounds(370,225,150,25);
		l2.add(t2);
		
		b3=new JButton("Generate");
		b3.setBounds(300,300,120,40);
		b3.setForeground(Color.RED);
		b3.setBackground(Color.BLACK);
		b3.addActionListener(this);
		b3.addMouseListener(this);
		b3.setFont(new Font("serif",Font.PLAIN,20));
		l2.add(b3);
		
		
		b1=new JButton("Home");
		b1.setBounds(100,570,110,33);
		b1.setForeground(Color.BLACK);
		b1.setBackground(Color.ORANGE);
		b1.addActionListener(this);
		b1.addMouseListener(this);
		b1.setFont(new Font("serif",Font.PLAIN,20));
		add(b1);
		
		b2=new JButton("Close");
		b2.setBounds(890,570,110,33);
		b2.setForeground(Color.BLACK);
		b2.setBackground(Color.ORANGE);
		b2.addActionListener(this);
		b2.addMouseListener(this);
		b2.setFont(new Font("serif",Font.PLAIN,20));
		add(b2);
		
		
		b4=new JButton("Refresh");
		b4.setBounds(490,570,110,33);
		b4.setForeground(Color.BLACK);
		b4.setBackground(Color.ORANGE);
		b4.addActionListener(this);
		b4.addMouseListener(this);
		b4.setFont(new Font("serif",Font.PLAIN,20));
		add(b4);
		
		
		/*i3=new ImageIcon(getClass().getResource("loveicon.png"));
		m2=i3.getImage().getScaledInstance(170, 150, Image.SCALE_DEFAULT);
		i4=new ImageIcon(m2);
		l5=new JLabel(i4);
		l5.setBounds(190,350,340,190);
		l2.add(l5);*/
		
		
		l6=new JLabel();
		l6.setBounds(320,300,240,290);
		l6.setForeground(Color.BLACK);
		l6.setBackground(Color.ORANGE);
		l6.setFont(new Font("serif",Font.BOLD,36));
		l6.setVisible(false);
		l2.add(l6);
		
		l7=new JLabel();
		l7.setBounds(170,330,600,90);
		l7.setForeground(Color.BLUE);
		l7.setFont(new Font("serif",Font.PLAIN,30));
		l7.setVisible(false);
		l2.add(l7);
		
		
		getContentPane().setBackground(Color.BLACK);
		setBounds(100,30,1100,680);
		setVisible(true);
		
	}
	
	
	public static void main(String[] args) {
		new generatelove();

	}

	@Override
	public void mouseClicked(MouseEvent e) {
		
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		if(e.getSource()==b1)
		{
			b1.setForeground(Color.BLACK);
			b1.setBackground(Color.GRAY);
		}else if(e.getSource()==b2)
		{
			b2.setForeground(Color.BLACK);
			b2.setBackground(Color.GRAY);
		}else if(e.getSource()==b3)
		{
			b3.setForeground(Color.BLACK);
			b3.setBackground(Color.GRAY);
		}else if(e.getSource()==b4)
		{
			b4.setForeground(Color.BLACK);
			b4.setBackground(Color.GRAY);
		}
		
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		if(e.getSource()==b1)
		{
			b1.setForeground(Color.BLACK);
			b1.setBackground(Color.ORANGE);
		}else if(e.getSource()==b2)
		{
			b2.setForeground(Color.BLACK);
			b2.setBackground(Color.ORANGE);
		}else if(e.getSource()==b3)
		{
			b3.setForeground(Color.RED);
			b3.setBackground(Color.BLACK);
		}else if(e.getSource()==b4)
		{
			b4.setForeground(Color.BLACK);
			b4.setBackground(Color.ORANGE);
		}
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void actionPerformed(ActionEvent ae) {
		if(ae.getSource()==b1)
		{
			new loveCalc().setVisible(true);
			this.setVisible(false);
		}else if(ae.getSource()==b2)
		{
			System.exit(0);
		}else if(ae.getSource()==b3)
		{
			Random random=new Random();
			int num=random.nextInt(100);
			System.out.println(t2.getText()+num+"%"+t1.getText());
			l6.setVisible(true);
			l7.setVisible(true);
			String love=String.valueOf(num);
			l7.setText("How much "+t2.getText()+" loves "+t1.getText());
			l6.setText(love+"%");
		}else if(ae.getSource()==b4)
		{
			t1.setText(null);
			t2.setText(null);
			l6.setText(null);
			l7.setText(null);
			
			
		}
		
	}

}
