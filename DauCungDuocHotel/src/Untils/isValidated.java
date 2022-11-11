
package Untils;


/**
 *
 * @author ps22004_taquocphong
 */
import java.sql.*;
import java.util.Date;


public class isValidated {
    public static boolean isBlank(String txt){
        if(txt.isBlank()){
            return false;
        }
        return true;
    }
}
