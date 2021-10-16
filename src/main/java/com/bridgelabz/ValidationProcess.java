package com.bridgelabz;

import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class ValidationProcess {


    public static boolean isValidFirstName(String firstName) {

            String pattern = "^[A-Z][a-z]{3,}";
            Pattern fname = Pattern.compile(pattern);
            if (firstName == null) {
                return false;
            }
            Matcher match = fname.matcher(firstName);
            return match.matches();

    }

    public static boolean isValidLastName(String lastName)
         {
            String lname = "^[A-Z][a-z]{3,}";
            Pattern pattern = Pattern.compile(lname);
            if (lastName == null) {
                return false;
            }
            Matcher m2 = pattern.matcher(lastName);
            return m2.matches();

    }

    public static boolean isValidEmail(String emails)
         {
            String regex = "^[\\w!#$%&'*+/=?`{|}~^-]+(?:\\.[\\w!#$%&'*+/=?`{|}~^-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,6}$";
            Pattern pattern = Pattern.compile(regex);
            if (emails == null) {
                return false;
            }
            Matcher matcher = pattern.matcher(emails);
            return matcher.matches();

    }

    public static boolean isValidMobileNo(String mobileNo) {

            String mobile = "^(\\d{0,9}[\\s]?)?\\d{10}$";
            Pattern mob = Pattern.compile(mobile);
            if (mobileNo == null) {
                return false;
            }
            Matcher matcher = mob.matcher(mobileNo);
            return matcher.matches();

    }


    public static boolean isValidPwd(String pwd)
         {
            String password = "(?=.*d)(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=])(?=\\S+$).{8,}";
            Pattern pattern = Pattern.compile(password);
            if (pwd == null) {
                return false;
            }
            Matcher match = pattern.matcher(pwd);
            return match.matches();

    }

}
