
package Classes;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JPanel;


public class Functions {
    
    public void MenuClicked(boolean HomeClicked, JPanel Home_BTN, boolean ArtistClicked, JPanel Artist_BTN, boolean RequestClicked, JPanel Request_BTN, boolean SettingsClicked, JPanel Settings_BTN)
    {
        if(HomeClicked == true)
        {
            Home_BTN.setBackground(Color.red);
        }
        else 
        {
            Home_BTN.setBackground(Color.yellow);
        }
        
        if(ArtistClicked == true)
        {
            Artist_BTN.setBackground(Color.red);
        }
        else 
        {
            Artist_BTN.setBackground(Color.yellow);
        }
        
        if(RequestClicked == true)
        {
            Request_BTN.setBackground(Color.red);
        }
        else 
        {
            Request_BTN.setBackground(Color.yellow);
        }
        
        if(SettingsClicked == true)
        {
            Settings_BTN.setBackground(Color.red);
        }
        else 
        {
            Settings_BTN.setBackground(Color.yellow);
        }
    }
}
