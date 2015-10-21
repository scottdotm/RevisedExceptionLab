package lab2;

/**
 * This class provides various services relating to name manipulation.
 * No output should be performed here.
 * 
 * @author  Jim Lombardo, jlombardo@wctc.edu
 * @version 1.00
 */
public class NameService {
    private static final int FIRST_NAME_IDX = 0;
    private static final int LAST_NAME_IDX = 1;
    
    //Output Doesn't belong in this class, Exceptions should be thrown to a class which is responsible for output, then printed.
    //All output is inputed with the Exceptions - these will need to be moved to another class (InputOutputGui class)
    
    
    /**
     * fullName cannot be null or empty, must have at least a first and last name,
     * But no more than 2 names entered, cannot add suffixes.
     * 
     * @param fullName - a name containing a first name and a last name
     * @return the last name in the form of [LAST_NAME_IDX]
     */
    
    public final String extractLastName(String fullName) {
        
         if (fullName == null || fullName.isEmpty()) {
            throw new IllegalArgumentException("Name cannot be null, please try again");
        }
         
        String[] nameParts = fullName.split(" ");
        String lastPart = nameParts[LAST_NAME_IDX];
        
        //First and last name required, no more than 4 names
        if (nameParts.length > 3 || nameParts.length <= 1) {
            throw new IllegalArgumentException("Must have at least a first and a last name and no more than 3 names");

        //could be more options for suffix's
        } else if (lastPart.contains("jr.")|| lastPart.contains("jr")||lastPart.contains("sr")||lastPart.contains("sr.")||lastPart.contains("ii")||lastPart.contains("iii")){
            throw new IllegalArgumentException("Please do not add suffix to last name, please try again");
        } else {
        
        return nameParts[LAST_NAME_IDX];
        }
    }
    
    /**
     * fullName cannot be null or empty.
     * 
     * 
     * @param fullName - a name containing a first name and a last name
     * @return the first name in the form of [FIRST_NAME_IDX]
     */
    public final String extractFirstName(String fullName) {
        
        if (fullName == null || fullName.isEmpty()) {
            throw new IllegalArgumentException("Name cannot be null, please try again");
        }
        
        String[] nameParts = fullName.split(" ");
        
        return nameParts[FIRST_NAME_IDX];
    }

    /**
     * Gets the length of a name, nameParts array cannot have more than 3 names. 
     * 
     * @param name - any full name or part of a name.
     * @return the length of the name or part. by combining [FIRST_NAME_IDX] and
     * [LAST_NAME_IDX]
     */
    public final int getNameLength(String name) {

        String[] nameParts = name.split(" ");
        
        if (nameParts.length > 3 || nameParts.length <= 1) {
            throw new IllegalArgumentException("Must have at least a first and a last name and no more than 3 names");
        }
        
        return name.length();

    }
    
}
