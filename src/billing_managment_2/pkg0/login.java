
package billing_managment_2.pkg0;
import javax.swing.*;

public class login extends JFrame{
    login()
    {
        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("bms/login background.PNG"));
        JLabel image=new JLabel(i1);  
        add(image);
        setSize(300,300);
        setVisible(true);
    }
    public static void main(String[] args)
    {
        new login();
    }
}
