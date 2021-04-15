package com.bridgelabz;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.ArrayList;
import java.util.List;

@RunWith(Parameterized.class)
public class LastNameTest {
    //*initializing fields lastname and expected(result boolean)*//
    String lastName;
    boolean expected;

    //*Constructor created to provide current object value*//
    public LastNameTest(String lastName, boolean result) {
        this.lastName = lastName;
        this.expected = result;
    }

    /*Parameters for class in list format is provided in the inputLast method*/
    @Parameterized.Parameters
    public static List inputLast(){
        List list = new ArrayList();
        list.add(new Object[]{"Abc",true});
        list.add(new Object[]{"abc",false});
        list.add(new Object[]{"bc",false});
        return list;
    }

    //*Object of validatorLastName class created
    // checking validateLastName methods result with expected result using equals method*//
    @Test
    public void validateLastName() {
        UserValidator userValidator = new UserValidator();
        Assert.assertEquals(this.expected,
                userValidator.validateLastName(this.lastName));
    }

}
