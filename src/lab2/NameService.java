package lab2;

/**
 * This class provides various services relating to name manipulation.
 * No output should be performed here.
 * 
 * @author  Jim Lombardo, jlombardo@wctc.edu
 * @version 1.00
 */
public class NameService {
    
    /**
     * Finds and returns the last name from within a full name. Caution: 
     * No validation is performed.
     * 
     * @param fullName - a name containing a first name and a last name
     * @return the last name
     * @throws IllegalArgumentException if fullName is null or empty or has 
     * fewer than two parts
     */
    public String extractLastName(String fullName) throws ArrayIndexOutOfBoundsException, IllegalArgumentException, NullPointerException {        
        
        String tokens[] = fullName.split(" ");
        
        
        String lastName = tokens[1];
        
        if(tokens.length < 1)
        {
            throw new ArrayIndexOutOfBoundsException("Last Name Required");    
        }
        if(fullName.isEmpty())
        { 
            throw new NullPointerException("Cannot be empty");
        }    
        
        if(tokens.length > 2){
            throw new ArrayIndexOutOfBoundsException("Please use the (First Last) Format");
        }
        
        
        
        return lastName;
    }
    

    
    
}
