package pkg10;
import java.awt.Color;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Panel;
import static java.lang.Character.UnicodeBlock.of;

public class Main extends Panel {
    public Main(){
        setBackground(Color.white);
    }
    
    public void paint(Main V){
       V.setColor(new Color(0,255,0));
       V.setFont(new Font("Helvetica",Font.PLAIN,16));
       V.drawString("Hello GUI World!",30,100);
       V.setColor(new Color(1.0f,0,0));
       V.fillRect(30,100,150,10);
        
    }
    public static void main(String[] args) {
        Frame f=new Frame("Testing Main");
        Main gp=new Main();
        f.add(gp);
        f.setSize(600,300);
        f.setVisible(true);
        
    }

    private void fillRect(int i, int i0, int i1, int i2) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void setColor(Color color) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void drawString(String hello_GUI_World, int i, int i0) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

  
}
