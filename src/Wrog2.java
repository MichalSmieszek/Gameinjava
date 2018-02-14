import java.awt.*;
import java.io.*;
import java.util.*;
import javax.swing.*;
public class Wrog2 extends Rzecz{
	private Gra okno;
	private boolean dead=false;
	private Rectangle przeszkoda;
	int xd,yd,k,p=1;
	boolean t=true;
	Wrog2(Gra okno,int x, int y,int m){
		super(x,y);
		this.okno=okno;
		Rectangle przeszkoda=new Rectangle(x,y,60,60);

		width=60;
		height=60;
		k=m;
		}
	
	private void move(){
		x=x+p;
	}
	private void move1(){
		x=x-p;
	}
	
	private void sprawdz(){
		if (k==0 && x<730){
			move();
		}
		else if  (k==0 && x==730)
			k=1;
		else if (k==1 && x>10) 
			move1();
		else if  (k==1 && x==10)
			k=0;
	}
	public void paint(Graphics g){
	sprawdz();
	g.setColor(Color.yellow);	
	g.fillRect(x,y,width, height);
	}
/*	public boolean wpadka(){
	while t
		if((x<Gracz.getx()+20 || x>Gracz.getx()-60)&&(y<Gracz.getx()+20 || y>Gracz.getx()-60))
			t=false;
	}*/
	public void setp(int o){
		this.p=o;
	}
}