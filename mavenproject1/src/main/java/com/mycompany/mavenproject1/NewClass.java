import com.twilio.Twilio; 
import com.twilio.converter.Promoter; 
import com.twilio.rest.api.v2010.account.Message; 
import com.twilio.type.PhoneNumber; 
 
import java.net.URI; 
import java.math.BigDecimal; 
 
public class NewClass { 
    // Find your Account Sid and Token at twilio.com/console 
    public static final String ACCOUNT_SID = "AC21b457d7057d80c00c981e0a4104d9b0"; 
    public static final String AUTH_TOKEN = "0d107bfa8770392cd5e13827f82b06dc"; 
 
    public static void main(String[] args) { 
        Twilio.init(ACCOUNT_SID, AUTH_TOKEN); 
        Message message = Message.creator( 
                new com.twilio.type.PhoneNumber("+84828467578"),   
                "Your message")      
            .create(); 
 
        System.out.println(message.getSid()); 
    } 
}