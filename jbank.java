import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class JF1 extends JFrame implements ActionListener
{
JLabel jl1,jl2;
JTextField jt1;
JPasswordField jt2;
JButton jb1;
JPanel jp1;
static String name,password;
JF1()
{
jl1=new JLabel("name:");
jl2=new JLabel("password:");
jt1=new JTextField(10);
jt2=new JPasswordField(10);
jb1=new JButton("SignUp");
jp1=new JPanel();
jp1.add(jl1);
jp1.add(jt1);
jp1.add(jl2);
jp1.add(jt2);
jp1.add(jb1);
getContentPane().add(jp1);
ac()
;}
void ac()
{
	jb1.addActionListener(this);
}
public void actionPerformed(ActionEvent e)
{
this.name=jt1.getText();
this.password = String.valueOf(jt2.getPassword());
JF2 jf2 =new JF2();
//JF1 jf1=new JF1();
this.setVisible(false);
jf2.setVisible(true);
jf2.setSize(225,200);

}
public static int check(String x,String y)
{
	if(x.equals(name)&&y.equals(password))
		return 1;
	else return 0;
}
}

class jbank 
{
	String name;
public static void main(String args[])
{
 JF1 jf1=new JF1();
jf1.setVisible(true);
jf1.setSize(225,150); 
}

}
class JF2 extends JFrame implements ActionListener
{
	JLabel jl1,jl2;
	JTextField jt1;
	JPasswordField jt2;
	JButton jb1;
	JButton jb2;
	JPanel jp1;
	int n=0;
	String name,password;
	JF2()
	{
		jl1=new JLabel("name:");
	jl2=new JLabel("password:");
	jt1=new JTextField(10);
	jt2=new JPasswordField(10);
	jb1=new JButton("Login");
	jb2=new JButton("GO-back to Sign-in page");
	jp1=new JPanel();
	jp1.add(jl1);
	jp1.add(jt1);
	jp1.add(jl2);
	jp1.add(jt2);
	jp1.add(jb1);
	jp1.add(jb2);
	getContentPane().add(jp1);
	jb1.addActionListener(this);
	jb1.setActionCommand("1");
	jb2.addActionListener(this);
	jb2.setActionCommand("2");
		
	}
	public void actionPerformed(ActionEvent e)
	{
		if(e.getActionCommand()=="1")
		{
		this.name=jt1.getText();
		this.password = String.valueOf(jt2.getPassword());
		this.n=JF1.check(name,password);
		
		if(n==1)
		{
		JF3 jf3 =new JF3();
		//JF2 jf2=new JF2();
		jf3.setVisible(true);
		jf3.setSize(160,210);
		this.setVisible(false);
		}
			else
			{
			JOptionPane.showMessageDialog(null,"password or user-id is incorrect go back to sign-in page");
			JF1 jf1=new JF1();
			jf1.setVisible(true);
			jf1.setSize(225,150); 
			this.setVisible(false);
			}
	}	
		else
		{
		JF1 jf1=new JF1();
		 jf1.setVisible(true);
	     jf1.setSize(225,150); 
		 this.setVisible(false);
		
		}
	
}
}
class JF3 extends JFrame implements ActionListener
{
JButton jb1,jb2,jb3,jb4;
JPanel jp1;
JLabel jl1;
JTextField jt1;
JF3()
{
jt1=new JTextField("0");
jl1=new JLabel("current balance");	
jb2=new JButton("withdraw");
jb1=new JButton("deposit");
jb3=new JButton("change pin");
jb4=new JButton("Info");
jp1=new JPanel();
jp1.add(jl1);
jp1.add(jt1);
jp1.add(jb1);
jp1.add(jb2);
jp1.add(jb3);
jp1.add(jb4);
getContentPane().add(jp1);
jb1.addActionListener(this);
jb1.setActionCommand("deposit");

jb2.addActionListener(this);
jb2.setActionCommand("withdraw");

jb3.addActionListener(this);
jb3.setActionCommand("changepin");

jb4.addActionListener(this);
jb4.setActionCommand("info");
}
int n;
public void actionPerformed(ActionEvent e)
{
		if(e.getActionCommand()=="deposit")
		{
			n=Integer.parseInt(jt1.getText());
			JF4 jf4=new JF4("deposit",n);
			jf4.setVisible(true);
			this.setVisible(false);
			jf4.setSize(250,100);
			
		}
		else if(e.getActionCommand()=="withdraw")
		{
			n=Integer.parseInt(jt1.getText());
			JF4 jf4=new JF4("withdraw",n);
			jf4.setVisible(true);
			this.setVisible(false);
			jf4.setSize(250,100);
		}
		else if(e.getActionCommand()=="changepin")
		{
			n=Integer.parseInt(jt1.getText());
			JF4 jf4=new JF4("changepin",n);
			jf4.setVisible(true);
			this.setVisible(false);
			jf4.setSize(250,100);
		}
		else if(e.getActionCommand()=="info")
		{
			n=Integer.parseInt(jt1.getText());
			JF4 jf4=new JF4("info",n);
			jf4.setVisible(true);
			jf4.setSize(250,100);
			this.setVisible(false);
		}			
}
}
class JF4 extends JFrame implements ActionListener
{
	JLabel jl1;
	JLabel jl2;
	JLabel jl3;
	JLabel jl4;
	JTextField jt1;
	JTextField jt2;
	JTextField jt3;
	JButton jb1;
	JPanel jp1;int n=0;
	JPasswordField jpf1;
	JF4(String x,int y)
	{
		n=y;
		if(x.equals("deposit"))
		{
			jl1=new JLabel("Enter Balnce:");
			jt1=new JTextField(10);
			jb1=new JButton("Submit");
			jp1=new JPanel();
			jp1.add(jl1);
			jp1.add(jt1);
			jp1.add(jb1);
			jb1.addActionListener(this);
			jb1.setActionCommand("deposit");
			getContentPane().add(jp1);
		}
		else if(x.equals("withdraw"))
		{
			jl1=new JLabel("Enter withdraw amount:");
			jt1=new JTextField(10);
			jb1=new JButton("Submit");
			jp1=new JPanel();
			jp1.add(jl1);
			jp1.add(jt1);
			jp1.add(jb1);
			jb1.addActionListener(this);
			jb1.setActionCommand("withdraw");
			getContentPane().add(jp1);
		}
		else if(x.equals("changepin"))
		{
				jl1=new JLabel("Enter old pin");
				jpf1=new JPasswordField(6);
				jb1=new JButton("Submit");
				jp1=new JPanel();
				jp1.add(jl1);
				jp1.add(jpf1);
				jp1.add(jb1);
				getContentPane().add(jp1);
				jb1.addActionListener(this);
				jb1.setActionCommand("changepin");
		}
		else if(x.equals("info"))
		{
			
			
			jl1=new JLabel("The details");
			jl2=new JLabel("Name:");
			jl3=new JLabel("Password:");
			jl4=new JLabel("Balance");
			jt1=new JTextField(JF1.name);
			jt2=new JTextField(JF1.password);
			jt3=new JTextField(String.valueOf(n));
			jb1=new JButton("Home");
			jp1=new JPanel();
			jp1.add(jl1);
			jp1.add(jl2);
			jp1.add(jt1);
			jp1.add(jl3);
			jp1.add(jt2);
			jp1.add(jl4);
			jp1.add(jt3);
			jp1.add(jb1);
			getContentPane().add(jp1);
			jb1.addActionListener(this);
			jb1.setActionCommand("info");
		}
	}
	void pin(int pin)
	{
		
	}
	public void actionPerformed(ActionEvent e)
	{
		if(e.getActionCommand()=="deposit")
		{
			 n=n+Integer.parseInt(jt1.getText());
			 JF3 jf3 =new JF3();
			 this.setVisible(false);
				 jf3.setVisible(true);
				 jf3.jt1.setText(String.valueOf(n));
				 jf3.setSize(160,210);
		}
		else if(e.getActionCommand()=="withdraw")
		{
			 if((n-Integer.parseInt(jt1.getText()))<0)
			 {
				 JOptionPane.showMessageDialog(null,"Insufficent Money Please enter Again!!!");
				JF3 jf3 =new JF3();
				this.setVisible(false);
				 jf3.setVisible(true);
				 jf3.jt1.setText(String.valueOf(n));
				 jf3.setSize(160,210);
			 }
			 else
			 {
				 n=n-Integer.parseInt(jt1.getText());
				 JF3 jf3 =new JF3();
				 jf3.setVisible(true);
				 jf3.jt1.setText(String.valueOf(n));
				 jf3.setSize(160,210);
			 }
		}
		else if(e.getActionCommand()=="changepin")
		{
		       String x= String.valueOf(jpf1.getPassword());
				
				if(x.equals(JF1.password))
				{
					JF5 jf5 =new JF5(n);
					this.setVisible(false);
				 jf5.setVisible(true);
				 jf5.setSize(300,300);
				}
				else
				{
					JOptionPane.showMessageDialog(null,"entered wrong password");
					JF3 jf3 =new JF3();
					this.setVisible(false);
				 jf3.setVisible(true);
				 jf3.jt1.setText(String.valueOf(n));
				 jf3.setSize(160,210);
				}
			   
		}
		else if(e.getActionCommand()=="info")
		{
				JF3 jf3 =new JF3();
				 jf3.setVisible(true);
				 this.setVisible(false);
				 jf3.jt1.setText(String.valueOf(n));
				 jf3.setSize(160,210);
		}
	}
}

class JF5 extends JFrame implements ActionListener
{
	JPanel jp1;
	JButton jb1;
	JPasswordField jpf1;
	JLabel jl1;
	int n=0;
	JF5(int n)
	{
		this.n=n;
				jl1=new JLabel("Enter new pin");
				jpf1=new JPasswordField(6);
				jb1=new JButton("Submit");
				jp1=new JPanel();
				jp1.add(jl1);
				jp1.add(jpf1);
				jp1.add(jb1);
				getContentPane().add(jp1);
				jb1.addActionListener(this);
	}
	public void actionPerformed(ActionEvent e)
	{
		JF1.password=String.valueOf(jpf1.getPassword());
				JOptionPane.showMessageDialog(null,"password updated succesfully");
				JF3 jf3 =new JF3();
				this.setVisible(false);
				 jf3.setVisible(true);
				 jf3.jt1.setText(String.valueOf(n));
				 jf3.setSize(160,210);
	}
}
