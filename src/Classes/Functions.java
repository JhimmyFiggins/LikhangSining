
package Classes;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JPanel;


public class Functions {
    
    public void MenuClicked(boolean HomeClicked, JPanel Home_BTN)
    {
        if(HomeClicked == true)
        {
            Home_BTN.setBackground(Color.red);
        }
        else 
        {
            Home_BTN.setBackground(Color.yellow);
        }
    }
}
