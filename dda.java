import java.awt.*;
import java.util.*;
import javax.swing.*;

public class dda extends JFrame
{
Vector<Integer> xpixel;
Vector<Integer> ypixel;
dda(Vector<Integer> x,Vector<Integer> y)
{
xpixel=x;
ypixel=y;
this.setDefaultCloseOperation(this.EXIT_ON_CLOSE);
this.setSize(500,500);
this.setVisible(true);
}

public void paint(Graphics gr)
{
for(int i=0;i<xpixel.size();i++)
	{
	gr.drawOval(xpixel.get(i),(int)ypixel.get(i),2,2);
	}
}




public static void main(String[] arg)
{
Scanner sc=new Scanner(System.in);
float x1,x2,y1,y2;

System.out.println("Enter the first cordinate of line x1,y1");
x1=sc.nextInt();
y1=sc.nextInt();

System.out.println("Enter the second cordinate of line x1,y1");
x2=sc.nextInt();
y2=sc.nextInt();

Vector<Integer> x=new Vector<Integer>();
Vector<Integer> y=new Vector<Integer>(); 
//float m=(float)(y2-y1)/(x2-x1);
float dx=(x2-x1);
float dy=(y2-y1);
int step=0;
if(dx>dy)
step=Math.abs((int)dx);
else
step=Math.abs((int)dy);

			for(int i=0;i<step;i++)			
			{
			x1+=dx/(float)step;
			y1+=dy/(float)step;
			x.add((int)x1);
			y.add((int)y1);
			}

dda obj=new dda(x,y);
System.out.println(x);
System.out.println(y);
}
}



class Bresenham
{

int x1,x2,y2,y1;
Vector<Integer> x;
Vector<Integer> y;
Bresenham(int x1,int y1,int x2,int y2)
{
this.x1=x1;
this.x2=x2;
this.y1=y1;
this.y2=y2;
x=new Vector<Integer
} 







}

