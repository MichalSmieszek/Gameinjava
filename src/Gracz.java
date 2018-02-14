import java.awt.*;
import javax.swing.*;
public class Gracz extends Rzecz {
	private int xd,yd;
	private Gra okno;
	//private boolean wygrana=false;
public Gracz(Gra okno,int x,int y){
	super(x,y);
	this.okno=okno;
	width=10;
	height=10;
}
public void paint(Graphics g){
	ruch();
	g.setColor(Color.green);
	g.fillRect(x,y,width,height);

}
private void ruch(){
	if (x+xd>10 && x+xd<780)
	x=x+xd;
	if (y+yd>10 && y+yd<580)
	y=y+yd;
}

public void setxd(int value){
	xd=value;
	}
public void setyd(int value){
	yd=value;	
}
public void setx(int value){
	x=value;	
}
public void sety(int value){
	y=value;	
}
	
public int getx(){return x;}
public int gety(){return y;}
}
