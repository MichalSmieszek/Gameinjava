import java.awt.*;
public class Cel extends Rzecz {
	private Gra okno;
	int width,height;
public Cel(Gra okno,int x,int y){
super(x,y);
this.okno=okno;
width=40;
height=40;
}
public void paint(Graphics g){
g.setColor(Color.pink);
g.fillRect(10, 10, 40, 40);
}
}