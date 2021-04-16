package com.bridgelabz;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.ArrayList;
import java.util.List;

@RunWith(Parameterized.class)
public class EmailTest {
    //*initializing fields email and expected(result boolean)*//
    String email;
    boolean expected;

    //*Constructor created to provide current object value*//
    public EmailTest(String email, boolean result) {
        this.email = email;
        this.expected = result;
    }

    /*Parameters for class in list format is provided in the inputEmail method*/
    @Parameterized.Parameters
    public static List inputEmail(){
        List list = new ArrayList();
        
        list.add(new Object[]{"abc.xyz@bl.co.in",true});
        list.add(new Object[]{"abc.@bl.co.in",true});
        list.add(new Object[]{"abc.@bl.co",true});
        list.add(new Object[]{".xyz@bl.co.in",false});
        list.add(new Object[]{"abc.xyz@bl..in",false});
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
