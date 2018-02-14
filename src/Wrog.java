import java.awt.*;
import java.io.*;
import java.util.*;
import javax.swing.*;
public class Wrog extends Rzecz{
	private Gra okno;
	private boolean dead;
	private Rectangle przeszkoda;
	int xd,yd,k,p=1;
	
	Wrog(Gra okno,int x, int y,int m){
		super(x,y);
		this.okno=okno;
		Rectangle przeszkoda=new Rectangle(x,y,60,60);
		width=60;
		height=60;
		k=m;
		}
	
	private void move(){
		y=y+p;
	}
	private void move1(){
		y=y-p;
	}
	
	private void sprawdz(){
		if (k==0 && y<530){
			move();
		}
		else if  (k==0 && y==530)
			k=1;
		else if (k==1 && y>10) 
			move1();
		else if  (k==1 && y==10)
			k=0;
	}
	public void paint(Graphics g){
	sprawdz();
	g.setColor(Color.red);	
	g.fillRect(x,y,width, height);
	}
	
	public void setp(int o){
		p=o;
	}
	

}
