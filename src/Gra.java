import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class Gra extends JPanel implements KeyListener {
	private int x=5,y=5,v=2, v1=2;
	private Gracz gracz;
	private Okno okno;
	private Wrog przeszkoda,przeszkoda3,przeszkoda1,przeszkoda2,przeszkoda4;
	private Wrog2 przeszkoda5,przeszkoda6,przeszkoda7;
	private Cel cel;
	private boolean b=false;;
	public Gra(){
		setSize(new Dimension(800,600));
		setPreferredSize(new Dimension(800,600));
		setFocusable(true);
		addKeyListener(this);
		gracz=new Gracz(this,750,560);
		okno=new Okno();
		przeszkoda=new Wrog(this,60,50,1);
		przeszkoda1=new Wrog(this,270,50,0);
		przeszkoda2=new Wrog(this,140,350,1);
		przeszkoda3=new Wrog(this,480,250,0);
		przeszkoda4=new Wrog(this,620,210,1);
		przeszkoda5=new Wrog2(this,520,400,1);
		przeszkoda6=new Wrog2(this,310,80,1);
		przeszkoda7=new Wrog2(this,270,150,0);
		cel=new Cel(this,10,10);
	}
	
;
	public void paint (Graphics g){
		g.setColor(Color.BLACK);
		g.fillRect(0, 0, 800 , 600 );
		gracz.paint(g);
		okno.paint(g);
		przeszkoda.paint(g);
		przeszkoda1.paint(g);
		przeszkoda2.paint(g);
		przeszkoda3.paint(g);
		przeszkoda4.paint(g);
		przeszkoda5.paint(g);
		przeszkoda6.paint(g);
		przeszkoda7.paint(g);
		cel.paint(g);
		g.setColor(Color.white);
		g.drawString("Predkosc gorna wynosi "+ v , 1, 10);
		g.drawString("Predkosc boczna wynosi "+ v1 , 150, 10);
		g.drawString("Nacisnij R by zrestartowac " , 310, 10);
		g.setColor(Color.black);
		g.drawString("Cel", 10, 30);
		if (wygrana2()==true){
			g.setFont(new Font("Courier New", Font.ITALIC, 140));
			g.setColor(Color.cyan);
			g.drawString("Wygrana", 120, 200);
		
	}
		if (przegrana()==true){
			gracz.setx(750);
			gracz.sety(560);
		}
		repaint();
	}
	
	public boolean wygrana2(){
		if (b==false &&  wygrana()==true){
			b=true;
		}
		return(b);
	}
	public boolean wygrana(){
		if (gracz.getx()<50 && gracz.gety()<50){
			przeszkoda.setp(0);
			przeszkoda1.setp(0);
			przeszkoda2.setp(0);
			przeszkoda3.setp(0);
			przeszkoda4.setp(0);
			przeszkoda5.setp(0);
			przeszkoda6.setp(0);
			przeszkoda7.setp(0);
			return true;
			
		}
			else
			return false;
		}
		public boolean przegrana(){
			//if(((przeszkoda7.getx()-gracz.getx()<10 && przeszkoda7.getx()-gracz.getx()>0)||(gracz.getx()-przeszkoda7.getx()<60 && przeszkoda6.getx()-gracz.getx()<0)) && ((przeszkoda7.gety()-gracz.gety()<10 && przeszkoda7.gety()-gracz.gety()>0)||(gracz.gety()-przeszkoda7.gety()<60 && przeszkoda7.gety()-gracz.gety()<0))){
			if((((przeszkoda.getx()-gracz.getx()<10 && przeszkoda.getx()-gracz.getx()>0)||(gracz.getx()-przeszkoda.getx()<60 && przeszkoda.getx()-gracz.getx()<0)) && ((przeszkoda.gety()-gracz.gety()<10 && przeszkoda.gety()-gracz.gety()>0)||(gracz.gety()-przeszkoda.gety()<60 && przeszkoda.gety()-gracz.gety()<0)))||(((przeszkoda1.getx()-gracz.getx()<10 && przeszkoda1.getx()-gracz.getx()>0)||(gracz.getx()-przeszkoda1.getx()<60 && przeszkoda1.getx()-gracz.getx()<0)) && ((przeszkoda1.gety()-gracz.gety()<10 && przeszkoda1.gety()-gracz.gety()>0)||(gracz.gety()-przeszkoda1.gety()<60 && przeszkoda1.gety()-gracz.gety()<0)))||(((przeszkoda2.getx()-gracz.getx()<10 && przeszkoda2.getx()-gracz.getx()>0)||(gracz.getx()-przeszkoda2.getx()<60 && przeszkoda2.getx()-gracz.getx()<0)) && ((przeszkoda2.gety()-gracz.gety()<10 && przeszkoda2.gety()-gracz.gety()>0)||(gracz.gety()-przeszkoda2.gety()<60 && przeszkoda2.gety()-gracz.gety()<0)))||(((przeszkoda3.getx()-gracz.getx()<10 && przeszkoda3.getx()-gracz.getx()>0)||(gracz.getx()-przeszkoda3.getx()<60 && przeszkoda3.getx()-gracz.getx()<0)) && ((przeszkoda3.gety()-gracz.gety()<10 && przeszkoda3.gety()-gracz.gety()>0)||(gracz.gety()-przeszkoda3.gety()<60 && przeszkoda3.gety()-gracz.gety()<0)))||(((przeszkoda4.getx()-gracz.getx()<10 && przeszkoda4.getx()-gracz.getx()>0)||(gracz.getx()-przeszkoda4.getx()<60 && przeszkoda4.getx()-gracz.getx()<0)) && ((przeszkoda4.gety()-gracz.gety()<10 && przeszkoda4.gety()-gracz.gety()>0)||(gracz.gety()-przeszkoda4.gety()<60 && przeszkoda4.gety()-gracz.gety()<0)))||(((przeszkoda5.getx()-gracz.getx()<10 && przeszkoda5.getx()-gracz.getx()>0)||(gracz.getx()-przeszkoda5.getx()<60 && przeszkoda5.getx()-gracz.getx()<0)) && ((przeszkoda5.gety()-gracz.gety()<10 && przeszkoda5.gety()-gracz.gety()>0)||(gracz.gety()-przeszkoda5.gety()<60 && przeszkoda5.gety()-gracz.gety()<0)))||(((przeszkoda6.getx()-gracz.getx()<10 && przeszkoda6.getx()-gracz.getx()>0)||(gracz.getx()-przeszkoda6.getx()<60 && przeszkoda6.getx()-gracz.getx()<0)) && ((przeszkoda6.gety()-gracz.gety()<10 && przeszkoda6.gety()-gracz.gety()>0)||(gracz.gety()-przeszkoda6.gety()<60 && przeszkoda6.gety()-gracz.gety()<0)))||(((przeszkoda7.getx()-gracz.getx()<10 && przeszkoda7.getx()-gracz.getx()>0)||(gracz.getx()-przeszkoda7.getx()<60 && przeszkoda6.getx()-gracz.getx()<0)) && ((przeszkoda7.gety()-gracz.gety()<10 && przeszkoda7.gety()-gracz.gety()>0)||(gracz.gety()-przeszkoda7.gety()<60 && przeszkoda7.gety()-gracz.gety()<0)))){
				return true;
			}
			else return false;
		}
		public static void main(String[] args){
		 
		Gra gra= new Gra()	;
		 JFrame okno=new JFrame();
		 okno.setTitle("Hejo");
		 okno.add(gra);
		 okno.pack();
		 okno.setResizable(false);
		 okno.setVisible(true);
		
		}

		@Override
		public void keyPressed(KeyEvent e) {
			int c=e.getKeyCode();
			if(c==KeyEvent.VK_UP)
				gracz.setyd(-v);
			if(c==KeyEvent.VK_DOWN)
				gracz.setyd(v);	
			if(c==KeyEvent.VK_LEFT)
				gracz.setxd(-v1);
			if(c==KeyEvent.VK_RIGHT)
				gracz.setxd(v1);
			if(c==KeyEvent.VK_W)
				v=v+1;	
			if(c==KeyEvent.VK_S)
				v=v-1;
			if(c==KeyEvent.VK_D)
				v1=v1+1;
			if(c==KeyEvent.VK_A)
				v1=v1-1;
			if(c==KeyEvent.VK_R){
				przeszkoda.setp(1);
				przeszkoda1.setp(1);
				przeszkoda2.setp(1);
				przeszkoda3.setp(1);
				przeszkoda4.setp(1);
				przeszkoda5.setp(1);
				przeszkoda6.setp(1);
				przeszkoda7.setp(1);
				gracz.setx(750);
				gracz.sety(560);
				b=false;
			}
			    
		}

		@Override
		public void keyReleased(KeyEvent e) {
			gracz.setxd(0);
			gracz.setyd(0);
			
			
		}

		@Override
		public void keyTyped(KeyEvent e) {
			// TODO Auto-generated method stub
			
		}
	}

