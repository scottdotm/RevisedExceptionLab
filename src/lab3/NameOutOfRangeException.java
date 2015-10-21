/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3;

/**
 *
 * @author smuth4
 */
public class NameOutOfRangeException extends Exception {

    private static final String MSG = 
            "Name cannot be Null, and also must not be Empty.";
    
    public NameOutOfRangeException() {
        super(MSG);
    }

    public NameOutOfRangeException(String message) {
        super(MSG);
    }

    public NameOutOfRangeException(String message, Throwable cause) {
        super(MSG, cause);
    }

    public NameOutOfRangeException(Throwable cause) {
        super(MSG, cause);
    }
    
}
