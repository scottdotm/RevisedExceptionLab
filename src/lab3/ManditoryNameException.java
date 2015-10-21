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
public class ManditoryNameException extends Exception {

    private static final String MSG = 
            "Name cannot be Null, and also must not be Empty.";
    
    public ManditoryNameException() {
        super(MSG);
    }

    public ManditoryNameException(String message) {
        super(MSG);
    }

    public ManditoryNameException(String message, Throwable cause) {
        super(MSG, cause);
    }

    public ManditoryNameException(Throwable cause) {
        super(MSG, cause);
    }
    
}
