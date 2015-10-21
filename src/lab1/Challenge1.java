package lab1;

import javax.swing.JOptionPane;

/**
 * The purpose of this challenge is to give you practice time using
 * Java Exception handling techniques.
 * <p>
 * Your challenge is to consider all the possible things that can go wrong
 * with this program and use exception handling where appropriate to prevent
 * the program from crashing. In addition you must display a friendly error
 * message in a JOptionPane and ask the user to try again. (Yes, this violates 
 * the Single Responsibility Principle, but for this lab, we'll overlook that.)
 * 
 * @author  Jim Lombardo, jlombardo@wctc.edu
 * @version 1.00
 */
public class Challenge1 {
    private static final int LAST_NAME_IDX = 1;

    public static void main(String[] args) {
        Challenge1 app = new Challenge1();
        
        String fullName = JOptionPane.showInputDialog("Enter full name (use Format: first last):");
        String lastName = null;
        try{
        lastName =app.extractLastName(fullName);
        } catch (IllegalArgumentException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        String msg = "Your last name is: " + lastName;
        JOptionPane.showMessageDialog(null, msg);
    }
    
    public final String extractLastName(String fullName) throws IllegalArgumentException {
        if (fullName == null || fullName.isEmpty()){
            throw new IllegalArgumentException("Name cannot be Null or Empty, try again");
        }
        String[] nameParts = fullName.split(" ");
        String lastPart = nameParts[nameParts.length-1].toLowerCase();
        
        //Validate Array
        if (nameParts.length > 3 || nameParts.length <= 1 ) {
            throw new IllegalArgumentException("Must have a First and Last name, no more than 2 names and a Suffix of junior, senior, *2rd*, *3rd*");
        //Validate for suffixes such as Jr. Sr. (the 2nd) (the 3rd)
        } else if (lastPart.contains("jr.")|| lastPart.contains("jr")||lastPart.contains("sr")||lastPart.contains("sr.")||lastPart.contains("ii")||lastPart.contains("iii"))
                {
            return nameParts[nameParts.length - 2];
        }
        else {
            return nameParts[nameParts.length - 1];
        }
    
    }

}
