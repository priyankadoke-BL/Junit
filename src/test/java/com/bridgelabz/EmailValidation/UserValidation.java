package com.bridgelabz.EmailValidation;


import com.bridgelabz.ValidationProcess;
import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
class UserValidateTest {
    ValidationProcess userRegistration = new ValidationProcess();

    @Test
    public void validateFirstName() {

        Assert.assertTrue(userRegistration.isValidFirstName("Priyanka"));
        System.out.println("Valid First Name");

    }




    @Test
    public void validateLastName() {

        Assert.assertTrue(userRegistration.isValidLastName("Doke"));
        System.out.println("Valid Last Name");

    }



    @Test
    public void validateEmail() {

        Assert.assertTrue(userRegistration.isValidEmail("priyankaadoke@gmail.com"));
        System.out.println("Valid Email");

    }



    @Test
    public void validateMobile() {

        Assert.assertTrue(userRegistration.isValidMobileNo("91 "));
        System.out.println("Valid Mobile Number");

    }


    @Test
    public void  validatePwd() {

        Assert.assertTrue(userRegistration.isValidPwd("pqrs@gh"));
        System.out.println("Valid Password");

    }

}