
package com.DauCungDuocHotel.Untils;


/**
 *
 * @author ps22004_taquocphong
 */
import java.io.File;
import java.sql.*;
import java.util.Date;
import java.util.regex.Matcher;
import java.util.regex.Pattern;



public class isValidated {
    public static boolean isBlank(String txt){
        if(txt.isBlank()){
            return false;
        }
        return true;
    }
    public static boolean required(String value, String msg) {
        boolean isSuccess = true;
        if (value.trim().equals("")) {
//            MsgBox.error();
            isSuccess = false;
        }
        return isSuccess;
    }

    public static boolean requiredImage(File file, String msg) {
        boolean isSuccess = true;
        if (file == null) {
//            Alert.error(msg);
            isSuccess = false;
        }
        return isSuccess;
    }

    public static boolean validateImage(String value, String msg) {
        boolean isSuccess = true;
        if (!value.matches("(.*)*.+\\.(png|jpg|gif|bmp|jpeg|PNG|JPG|GIF|BMP|JPEG)$")) {
//            Alert.error(msg);
            isSuccess = false;
        }
        return isSuccess;
    }

    public static boolean requiredNumber(String value, String msg) {
        try {
            double n = Double.parseDouble(value);
            return true;
        } catch (Exception e) {
//            Alert.error(msg);
            return false;
        }
    }

    public static boolean equalToOrGreaterThanZero(double value, String msg) {
        boolean isSuccess = true;
        if (value < 0) {
//            Alert.error(msg);
            isSuccess = false;
        }
        return isSuccess;
    }

    public static boolean equalString(String value1, String value2, String msg) {
        boolean isSuccess = true;
        if (!value1.equals(value2)) {
//            Alert.error(msg);
            isSuccess = false;
        }
        return isSuccess;
    }

    public static boolean validateDate(String value, String msg) {
        boolean isSuccess = true;
        if (!value.matches("[0-9]{2}[/]{1}[0-9]{2}[/]{1}[0-9]{4}")) {
//            Alert.error(msg);
            isSuccess = false;
        }
        return isSuccess;
    }

    public static boolean validatePhone(String value, String msg) {
        boolean isSuccess = true;
        String pattern = "\\d{10}|(?:\\d{3}-){2}\\d{4}|\\(\\d{3}\\)\\d{3}-?\\d{4}";
        if (!value.matches(pattern)) {
//            Alert.error(msg);
            isSuccess = false;
        }
        return isSuccess;
    }

    public static boolean validateMinMax(double value, double min, double max, String msg) {
        boolean isSuccess = true;
        if (value < min || value > max) {
//            Alert.error(msg);
            isSuccess = false;
        }
        return isSuccess;
    }

    public static boolean validateEmail(String value, String msg) {
        Pattern VALID_EMAIL_ADDRESS_REGEX
                = Pattern.compile("^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}$", Pattern.CASE_INSENSITIVE);
        Matcher matcher = VALID_EMAIL_ADDRESS_REGEX.matcher(value);
        boolean isSuccess = true;
        if (!matcher.find()) {
//            Alert.error(msg);
            isSuccess = false;
        }
        return isSuccess;
    }

}
