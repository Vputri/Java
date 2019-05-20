package getinputfromkeyboard2;

import java.io.InputStreamReader;
import javax.swing.JOptionPane;


public class GetInputFromKeyboard2 {
    public static void main(String[] args) {
        Bufferedreader dataIn=new Bufferedreader(new InputStreamReader(System.in));
        String nama="",hoby="";
        
        nama=JoptionPane.showInputDialog("Nama Anda :");
        hoby=JoptionPane.showInputDialog("Hobi Anda :");
        String msg="Jadi Anda Hobi" +hoby+".Hobi Yang bagus" +nama;
    
        JOptionPane.showMessageDialog(null, msg);
        System.out.println("Jadi Anda Hobi" +hoby+ ".Hobi Yang Bagus" +nama);
        
    }
    
}
