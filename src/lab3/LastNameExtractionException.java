/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3;

/**
 *
 * @author L115student
 */
public class LastNameExtractionException extends Exception{
    
    public LastNameExtractionException(){
        
    }
    public LastNameExtractionException(String message){
        super(message);
    }
    public LastNameExtractionException(Throwable cause){
        super(cause);
    }
    public LastNameExtractionException(String message, Throwable cause){
        super(message, cause);
        
    }
    
}
