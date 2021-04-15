package com.bridgelabz;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.ArrayList;
import java.util.List;

@RunWith(Parameterized.class)
public class FirstNameTest {
    String firstName;
    boolean expected;

    public FirstNameTest(String firstName, boolean result) {
        this.firstName = firstName;
        this.expected = result;
    }

    @Parameterized.Parameters
    public static List inputFirst(){
        List list = new ArrayList();
        list.add(new Object[]{"Abc",true});
        list.add(new Object[]{"abc",false});
        list.add(new Object[]{"bc",false});
        return list;
    }

    @Test
    public void validateFirstName() {
        UserValidator userValidator = new UserValidator();
        Assert.assertEquals(this.expected,
                userValidator.validateFirstName(this.firstName));
    }

}
