package com.bridgelabz;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.ArrayList;
import java.util.List;

/*To Declare the class will be Parameterized class*/
@RunWith(Parameterized.class)
public class PasswordTest {

    //*initializing fields mobile_number and expected(result boolean)*//
    String password;
    boolean expected;

    //*Constructor created to provide current object value*//
    public PasswordTest(String password, boolean result) {
        this.password = password;
        this.expected = result;
    }

    /*Parameters for class in list format is provided in the inputPassword method*/
    @Parameterized.Parameters
    public static List inputPassword(){
        List list = new ArrayList();
        list.add(new Object[]{"Abcd100!",true});
        list.add(new Object[]{"Aa100!",false});
        list.add(new Object[]{"aaaa100!",false});
        list.add(new Object[]{"Abcdefg!",false});
        list.add(new Object[]{"Abcde100",false});
        return list;
    }

    //*Object of validator class created
    // checking validatePassword methods result with expected result using equals method*//
    @Test
    public void validatePassword() {
        UserValidator userValidator = new UserValidator();
        Assert.assertEquals(this.expected,
                userValidator.validatePassword(this.password));
    }

}

