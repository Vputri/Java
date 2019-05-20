package belajar;

import javax.swing.*;

public class Belajar {
    JOptionPane optionPane;
    
    public Belajar(){
        
    }
    void launchFrame(){
        optionPane=new JOptionPane();
        String name=optionPane.showInputDialog("Enter world1");
        String fika=optionPane.showInputDialog("Enter world2");
        String msg=name+" "+fika;
        optionPane.showMessageDialog(null,msg);
        System.exit(0);
    }
    public static void main(String[] args) {
        new Belajar().launchFrame();
    }
    
}
