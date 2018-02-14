import java.awt.*;

public class Okno {
	private Rectangle lewo= new Rectangle(0,0,10,600);
	private Rectangle prawo= new Rectangle(790,0,10,600);
	private Rectangle dol= new Rectangle(0,590,800,10);
	private Rectangle gora= new Rectangle(0,0,800,10);
	public Okno(){
	}
	public void paint(Graphics g){
		g.setColor(Color.blue);
		g.fillRect(lewo.x, lewo.y, lewo.width, lewo.height);
		g.fillRect(prawo.x, prawo.y, prawo.width, prawo.height);
		g.fillRect(dol.x, dol.y, dol.width, dol.height);
		g.fillRect(gora.x, gora.y, gora.width, gora.height);

	
	}
}
