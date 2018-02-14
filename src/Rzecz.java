import java.awt.*;
public abstract class Rzecz {
protected int x,y,width,height;
//protected boolean removed = false;

public Rzecz(int x, int y){
	this.x=x;
	this.y=y;
}
public void paint(Graphics g){
	
}
public int getx(){return x;}
public int gety(){return y;}
public int getw(){return width;}
public int geth(){return height;}
}
