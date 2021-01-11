package lovecalculator;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.*;

public class loveCalc extends JFrame implements ActionListener,MouseListener {
	
	JLabel l1,l2,l3,l4;
	JButton b1,b2,b3,b4;
	ImageIcon i1,i2,i3,i4,i5,i6;
	Image m1,m2,m3;
	
	
	
	loveCalc()
	{
		setLayout(null);
		
		l1=new JLabel("Welcome to Love Calculator");
		l1.setBounds(400, 30, 600, 100);
		l1.setFont(new Font("serif",Font.BOLD,30));
		l1.setForeground(Color.RED);
		add(l1);
		
		
		i1=new ImageIcon(getClass().getResource("love.jpg"));
		m1=i1.getImage().getScaledInstance(600, 400,Image.SCALE_DEFAULT);
		i2=new ImageIcon(m1);
		l2=new JLabel(i2);
		l2.setBounds(0,0,1100,600);
		add(l2);
		
		b1=new JButton("Check");
		b1.setBackground(Color.ORANGE);
		b1.setForeground(Color.BLACK);
		b1.setHorizontalAlignment(SwingConstants.CENTER);
		b1.setFont(new Font("serif",Font.PLAIN,18));
		b1.setBounds(760, 490, 120, 30);
		b1.addActionListener(this);
		b1.addMouseListener(this);
		add(b1);
		
		b2=new JButton("Close");
		b2.setBackground(Color.ORANGE);
		b2.setForeground(Color.BLACK);
		b2.setHorizontalAlignment(SwingConstants.CENTER);
		b2.setFont(new Font("serif",Font.PLAIN,18));
		b2.setBounds(900, 490, 120, 30);
		b2.addActionListener(this);
		b2.addMouseListener(this);
		add(b2);
		
		setVisible(true);
		setBounds(140,70,1100,600);
		getContentPane().setBackground(Color.BLACK);
	}

	public static void main(String[] args) {
		new loveCalc();

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==b1)
		{
			//check
			this.setVisible(false);
			new generatelove().setVisible(true);
		}
		else if(e.getSource()==b2)
		{
			//cancel
			System.exit(0);
		}
		
	}

	@Override
	public void mouseClicked(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent ae) {
		if(ae.getSource()==b1)
		{
			b1.setForeground(Color.ORANGE);
			b1.setBackground(Color.BLACK);
		}else if(ae.getSource()==b2)
		{
			b2.setForeground(Color.ORANGE);
			b2.setBackground(Color.BLACK);
		}
		
	}

	@Override
	public void mouseExited(MouseEvent ae) {
		// TODO Auto-generated method stub
		if(ae.getSource()==b1)
		{
			b1.setForeground(Color.BLACK);
			b1.setBackground(Color.ORANGE);
		}else if(ae.getSource()==b2)
		{
			b2.setForeground(Color.BLACK);
			b2.setBackground(Color.ORANGE);
		}
		
	}

	@Override
	public void mousePressed(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

}
