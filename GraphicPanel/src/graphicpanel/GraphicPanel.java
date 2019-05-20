package graphicpanel;

import java.awt.Color;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Panel;

public class GraphicPanel extends Panel{
    public GraphicPanel(){
    setBackground(Color.black);
}
    
    public void paint(Graphics v){
        v.setColor(new Color(0,255,0));
        v.setFont(new Font("Helvetica",Font.PLAIN,16));
        v.drawString("Hello GUI World!", 30, 100);
        v.fillRect(30, 100, 150, 10); 
    }
    
    public static void main(String[] args) {
        Frame f=new Frame("Testing Graphics Panel");
        GraphicPanel i=new GraphicPanel();
        f.add(i);
        f.setSize(600,300);
        f.setVisible(true);
    }
    
}
