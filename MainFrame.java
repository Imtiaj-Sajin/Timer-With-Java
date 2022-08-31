import java.awt.*;
import java.awt.Dimension;
import java.sql.DriverAction;
import java.text.Format;
import javax.swing.*;

public class MainFrame {
JLabel dayLabel,hrLabel,minLabel,secLabel;



    public static void main(String[] args) {

    JLabel bgLabel= new JLabel();
    bgLabel.setIcon(new ImageIcon("bg1.png"));
       
    JFrame frame = new JFrame();
    frame.setTitle("Sign Up");
    frame.setSize(915,520);
    frame.setMinimumSize(new Dimension(915,420));
    // frame.setMaximumSize(new Dimension(918,520));
    frame.setResizable(false);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    ImageIcon image1 =new ImageIcon("Bangladesh_railway_logo.png");

    frame.setIconImage(image1.getImage());
    frame.add(bgLabel);

    Toolkit tk=Toolkit.getDefaultToolkit();
    int x=(int) tk.getScreenSize().getWidth();
    int y=(int) tk.getScreenSize().getHeight();
    frame.setLocation(x/2-frame.getSize().width/2, y/2-frame.getSize().height/2);
    

    frame.getContentPane().setBackground(new Color( 0x292929));
    frame.setVisible(true);
    }
    
}
