package com.bridgelabz;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.ArrayList;
import java.util.List;

/*To Declare the class will be Parameterized class*/
@RunWith(Parameterized.class)
public class FirstNameTest {

    //*initializing fields firstname and expected(result boolean)*//
    String firstName;
    boolean expected;

    //*Constructor created to provide current object value*//
    public FirstNameTest(String firstName, boolean result) {
        this.firstName = firstName;
        this.expected = result;
    }

    /*Parameters for class in list format is provided in the inputFirst method*/
    @Parameterized.Parameters
    public static List inputFirst(){
        List list = new ArrayList();
        list.add(new Object[]{"Abc",true});
        list.add(new Object[]{"abc",false});
        list.add(new Object[]{"bc",false});
        return list;
    }

    //*Object of validatorFirstName class created
    // checking validateFirstName methods result with expected result using equals method*//
    @Test
    public void validateFirstName() {
        UserValidator userValidator = new UserValidator();
        Assert.assertEquals(this.expected,
                userValidator.validateFirstName(this.firstName));
    }

}
