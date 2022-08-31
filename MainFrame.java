import java.awt.*;
import java.awt.Dimension;
import java.sql.DriverAction;
import java.text.Format;
import javax.swing.*;

import org.w3c.dom.Text;

public class MainFrame {
JLabel dayLabel,hrLabel,minLabel,secLabel;
JButton startButton,pauseButton,resetbButton;
Font font=new Font("Algerian", Font.PLAIN, 65);


    public MainFrame() {

    startButton=new JButton("Start");
    startButton.setBounds(260,400,80,40);
    startButton.setFocusable(false);
    // startButton.addActionListener(this);
    startButton.setForeground(new Color(0xFFFFFF));
    startButton.setBackground(new Color(0x292929));
    startButton.setIcon(new ImageIcon("icons2.png"));
    startButton.setHorizontalTextPosition(JButton.CENTER);
    startButton.setVerticalTextPosition(JButton.BOTTOM);
    startButton.createImage(80, 80);


    dayLabel=new JLabel("00");
    dayLabel.setBounds(75,167,80,80);
    dayLabel.setFont(font);
    dayLabel.setForeground(Color.WHITE);
 
    hrLabel=new JLabel("00");
    hrLabel.setBounds(75+225,167,80,80);
    hrLabel.setFont(font);
    hrLabel.setForeground(Color.WHITE);
 
    minLabel=new JLabel("00");
    minLabel.setBounds(75+225+225,167,80,80);
    minLabel.setFont(font);
    minLabel.setForeground(Color.WHITE);
 
    secLabel=new JLabel("00");
    secLabel.setBounds(75+225+225+225,167,80,80);
    secLabel.setFont(font);
    secLabel.setForeground(Color.WHITE);
 
    

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
    frame.add(dayLabel);
    frame.add(hrLabel);
    frame.add(minLabel);
    frame.add(secLabel);
    frame.add(startButton);
    frame.add(bgLabel);


    Toolkit tk=Toolkit.getDefaultToolkit();
    int x=(int) tk.getScreenSize().getWidth();
    int y=(int) tk.getScreenSize().getHeight();
    frame.setLocation(x/2-frame.getSize().width/2, y/2-frame.getSize().height/2);
    

    frame.getContentPane().setBackground(new Color( 0x292929));
    frame.setVisible(true);
    }


    public static void main(String[] args) {
        new MainFrame();
    }
    
}
