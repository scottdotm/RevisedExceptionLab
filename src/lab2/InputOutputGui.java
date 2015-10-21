package lab2;

import javax.swing.JOptionPane;

/**
 * This class is responsible for all input and output in the program.
 * 
 * @author  Jim Lombardo, jlombardo@wctc.edu
 * @version 1.00
 */
public final class InputOutputGui {
    private NameService nameService;

    public InputOutputGui() {
        nameService = new NameService();
    }

    public final void startConversation() {
        
        String fullName = JOptionPane.showInputDialog("Enter full name:");
        String lastName = "";
        try{
            lastName = nameService.extractLastName(fullName);
        }
        catch (IllegalArgumentException iae)
        {
            //This forces you to input your first and last name, there is NO other way to close the app otherwise
            JOptionPane.showMessageDialog(null, iae);
            startConversation();
            return;
        }
        String msg = "Your last name is: " + lastName;
        JOptionPane.showMessageDialog(null, msg);
        
        }
        
}
