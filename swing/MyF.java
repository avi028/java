import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
class MyCanvas extends Canvas
{
Image i;
MyCanvas()
{
Toolkit t=Toolkit.getDefaultToolkit();
i=t.getImage("D:\\pic\\photo0080.jmg");

}
public void paint(Graphics g)
{
g.drawImage(i,100,100,this);
}

} 

class MyF extends Frame
{
	
	MyF()
	{
		super("graphics");
		
		MyCanvas m=new MyCanvas();
		add(m);
		setSize(400,400);
		setBackground(Color.red);
		setVisible(true);
		}
		

public static void main(String s[])
{
new MyF();
}
}

