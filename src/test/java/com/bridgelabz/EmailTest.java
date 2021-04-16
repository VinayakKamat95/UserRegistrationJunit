package com.bridgelabz;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.ArrayList;
import java.util.List;

@RunWith(Parameterized.class)
public class EmailTest {
    //*initializing fields firstname and expected(result boolean)*//
    String email;
    boolean expected;

    //*Constructor created to provide current object value*//
    public EmailTest(String email, boolean result) {
        this.email = email;
        this.expected = result;
    }

    /*Parameters for class in list format is provided in the inputFirst method*/
    @Parameterized.Parameters
    public static List inputEmail(){
        List list = new ArrayList();
        
        list.add(new Object[]{"abc.xyz@bl.co.in",true});
        return list;
    }

    //*Object of validatorEmail class created
    // checking validateEmail methods result with expected result using equals method*//
    @Test
    public void validateEmail() {
        UserValidator userValidator = new UserValidator();
        Assert.assertEquals(this.expected,
                userValidator.validateEmail(this.email));
    }
}
